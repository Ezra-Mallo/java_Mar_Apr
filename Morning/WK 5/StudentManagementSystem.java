import java.util.*;
import  java.io.*;
import java.nio.file.*;


public class StudentManagementSystem
{
    private static final String FILE_PATH = "C:\\java\\Morning\\WK 5\\SWDV\\NWAD\\files\\StudentRecord.txt" ;
    private static Path filePath = Paths.get(FILE_PATH).toAbsolutePath();
    private static final Path tempFilePath =Paths.get(FILE_PATH +".tmp");

    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        
        while(exit == false)   // while(!exit)
        {
            System.out.println("\n------- Menu -------");
            System.out.println("1. Add Student    [C]");
            System.out.println("2. View Student   [R]");
            System.out.println("3. Update Student [U]");
            System.out.println("4. Delete Student [D]");
            System.out.println("5. Exit              ");
            System.out.printf("Chose an option....: ");
            int choice = scanner.nextInt();
            
           try
           { 
                switch (choice)
                {
                    case 1:
                        addStudentRecord();
                        break;
                    
                    case 2:
                        viewStudentRecords();
                        break;

                    case 3:
                        updateStudentRecords();
                        break;

                    case 4:
                        deleteStudentRecord();
                        break;
                    case 5:
                        exit = true;
                        System.out.println("Exiting program....: ");                    
                        break;
                        
                    default:
                        System.out.println("Invalid choice. Please select a valid option....: ");                    
                        break;                 
                }
            }            
            catch(Exception e)
            {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void addStudentRecord() throws MyInvalidScoreExceptions
    {
        //BufferedWriter writer = null;
        try (BufferedWriter writer = Files.newBufferedWriter(filePath, StandardOpenOption.APPEND, StandardOpenOption.CREATE ))
        {
            //write = Files.newBufferedWriter(filePath);
            Scanner ss = new Scanner(System.in);

            String studentNum, fName,lName, email;
            double score;
            char grade;

            System.out.printf("Enter Student Number: ");     
            studentNum = ss.nextLine();      
            
            System.out.printf("Enter First Name: ");                    
            fName = ss.nextLine();
            
            System.out.printf("Enter Last Name: ");                    
            lName = ss.nextLine();
            email = fName.toLowerCase()+"."+lName.toLowerCase()+"@swdv.ca";
            
            System.out.printf("Enter Score: ");                    
            score = ss.nextInt();

            grade = evaluateScore(score);

            writer.write(String.format("%s,%s,%s,%s,%.2f,%c\n",studentNum,fName,lName,email,score,grade));
            System.out.println("Student added successfully!");                                

        }
        catch(IOException e)
        {
            System.out.println("Error adding student: " + e.getMessage());                        
        }
        catch(InputMismatchException e)
        {
            System.out.println("Error: " + e.getMessage());                    
        }        
        catch(Exception e)
        {            
            System.out.println("Error: " + e.getMessage());                    
        }        
        
        
        catch (MyInvalidScoreExceptions e) 
        {
            System.out.println("Invalid score: " + e.getMessage());
        }
    
    }

    private static void viewStudentRecords()
    {
        try
        {
            if(Files.exists((filePath)))
            {
                List<String> studentRecords = Files.readAllLines(filePath);
                if (studentRecords.isEmpty())
                {
                    System.out.println("No Student record available in file!");                    

                }
                else
                {
                    for(String record: studentRecords)
                    {
                        System.out.println(record);                    
                    }
                }
            }
            else 
            {
                System.out.println("Sorry, file doe not exist!");                    
            }
        }
        catch(Exception e)
        {            
            System.out.printf("Error: " + e.getMessage());                    
        }
        catch(IOException e)
        {
            System.out.println("Error adding student: " + e.getMessage());                        
        }
    }


    




    // Method to update student information
    private static void updateStudentRecords() throws MyInvalidScoreExceptions
    {
        try 
        {
            if (Files.exists(filePath)) 
            {
                boolean updateFlag = false;
                try (BufferedReader reader = Files.newBufferedReader(filePath);
                     BufferedWriter writer = Files.newBufferedWriter(tempFilePath)) 
                {

                    Scanner ss = new Scanner(System.in);
                    System.out.print("Enter student ID to update: ");
                    String studentIDUpdate = ss.nextLine();
                    String line;
                
                    while ((line = reader.readLine()) != null) 
                    {
                        String[] data = line.split(",");
                        if (data[0].equals(studentIDUpdate)) {
                            System.out.print("Enter new Score: ");
                            double newScore = ss.nextDouble();
                            //ss.nextLine(); // Consume newline
                            data[4] = String.valueOf(newScore); // Update score
                            data[5] = String.valueOf(evaluateScore(newScore)); // Update grade
                            updateFlag = true;
                        }
                        writer.write(String.join(",", data) + "\n");
                    }

                    if (updateFlag) 
                    {
                        System.out.println("Student updated successfully.");
                    } 
                    else 
                    {
                        System.out.println("No record found for the given Student ID.");
                    }
                }

                // Replace original file with updated file
                Files.delete(filePath);
                Files.move(tempFilePath, filePath);
            } 
            else 
            {
                System.out.println("File not found.");
            }
        } 
        catch (IOException e) 
        {
            System.out.println("Error updating student: " + e.getMessage());
        }
        catch (MyInvalidScoreExceptions e) 
        {
            System.out.println("Invalid score: " + e.getMessage());
        }
    
    }




    // Method to delete a student
    private static void deleteStudentRecord() 
    {
        try 
        {
            if (Files.exists(filePath)) 
            {
                boolean deleteFlag = false;
                try (BufferedReader reader = Files.newBufferedReader(filePath);
                     BufferedWriter writer = Files.newBufferedWriter(tempFilePath)) 
                {

                    Scanner ss = new Scanner(System.in);

                    System.out.print("Enter student ID to delete: ");
                    String studentIDDelete = ss.nextLine();
                    String line;

                    while ((line = reader.readLine()) != null) 
                    {
                        String[] data = line.split(",");
                        if (!data[0].equals(studentIDDelete)) 
                        {
                            writer.write(String.join(",", data) + "\n");
                        } 
                        else 
                        {
                            deleteFlag = true;
                        }
                    }

                    if (deleteFlag) 
                    {
                        System.out.println("Student deleted successfully.");
                    } 
                    else 
                    {
                        System.out.println("No record found for the given Student ID.");
                    }
                }

                // Replace original file with updated file
                Files.delete(filePath);
                Files.move(tempFilePath, filePath);
            } 
            else 
            {
                System.out.println("File not found.");
            }
        } 
        catch (IOException e) 
        {
            System.out.println("Error deleting student: " + e.getMessage());
        }
    }



    public static char evaluateScore(double score) throws MyInvalidScoreExceptions
    {
   
        if (score < 0 || score >100)
        {
            throw new MyInvalidScoreExceptions("Score must be between 0 and 100!");
        }
        char val ;

        if (score >= 80 )
        {
            val =   'A';
        }
        else if (score >= 70 )
        {
            val =   'B';
        }
        else if (score >= 60 )
        {
            val =   'C';
        }
        else if (score >= 50 )
        {
            val =   'D';
        }
        else if (score >= 40 )
        {
            val =   'E';
        }
        else  
        {
            val =   'F';
        }
        return val;
        
    }


}

class MyInvalidScoreExceptions extends Exception
{
    public MyInvalidScoreExceptions(String errorMessage)
    {
        super(errorMessage);
    }
}