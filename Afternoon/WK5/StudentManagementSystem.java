import java.nio.file.*;
import java.io.*;
import java.util.*;



public class StudentManagementSystem
{
    private static final String FILE_PATH_STRING = "C:\\java\\Afternoon\\WK5\\SWDV\\NWAD\\Flatfiles\\StudentRecord.txt";
    private static final Path FILE_PATH = Paths.get(FILE_PATH_STRING).toAbsolutePath();
    private static final Path TEMP_FILE_PATH = Paths.get(FILE_PATH_STRING + ".tmp");
    

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while(exit == false)   //while(!exit)
        {
            System.out.println("\n------------ Menu -----------");
            System.out.println("1. Add Student Record     [C]");
            System.out.println("2. View Student Record    [R]");
            System.out.println("3. Modify  Student Record [U]");
            System.out.println("4. Delete Student Record  [D]");
            System.out.println("5. Exit                      ");
            System.out.print("Make a selection: ");
            int choice = scanner.nextInt();
            

            try
            {
                switch (choice)
                {
                    case 1: 
                        addStudentRecord(); 
                        break;
                    
                    case 2: 
                        readStudentRecord(); 
                        break;
                                            
                    case 3: 
                        updateStudentRecord(); 
                        break;

                    case 4: 
                        deleteStudentRecord(); 
                        break;

                    case 5: 
                        exit = true;
                        System.out.println("\n..........Exiting program");

                        break;
                    
                    default: 
                        System.out.println("\nWrong/Invalid option. Make another selection!");

                        break;
                         
                }
            }
            catch(Exception e)
            {
                System.out.println("Error: " + e.getMessage());
            }


        }

    }


    private static void addStudentRecord()  throws MySWDVExceptions
    {
        
        //BufferedWriter writer = null;

        try (BufferedWriter writer  =  Files.newBufferedWriter(FILE_PATH, StandardOpenOption.APPEND, StandardOpenOption.CREATE))
        {
            //writer = Files.newBufferedWriter(FILE_PATH);
            Scanner ss = new Scanner(System.in);
            String studenrNum, fName, lName, email;
            double score;
            char grade;

            System.out.print("Enter Student Number: ");
            studenrNum = ss.nextLine();

            System.out.print("Enter Student First Name: ");
            fName = ss.nextLine();

            System.out.print("Enter Student Last Name: ");
            lName = ss.nextLine();

            email = fName.toLowerCase()  + "."  + lName.toLowerCase()  + "@swdv.rdp.ca";

            System.out.print("Enter Student Score: ");
            score = ss.nextDouble();

            grade = evaluateScore(score);

            //this allings all the student details into  a line
            String lineRecord = String.format("%s,%s,%s,%s,%.2f,%c\n",studenrNum,fName,lName,email,score,grade);

            //write to the file
            writer.write(lineRecord);
            System.out.println("Student's record successfully added!");

        }
        catch(IOException e)
        {
            System.out.println("Error: " + e.getMessage());          

        }
        catch(InputMismatchException e)
        {
            System.out.println("Error: " + e.getMessage());          

        }
        catch(MySWDVExceptions e)
        {
            System.out.println("Error: " + e.getMessage());          

        }
        
        catch(Exception e)
        {
            System.out.println("Error: " + e.getMessage());          

        }
        
    }
 
    

    private static void readStudentRecord()
    {
        try
        {
            if(Files.exists(FILE_PATH))
            {
                //move all content into a List called studentRecords
                List<String> studentRecords = Files.readAllLines(FILE_PATH);

                if(studentRecords.isEmpty())
                {
                    System.out.println("No Student record available in the file.");         

                }
                else
                {
                    for(String record : studentRecords)
                    {
                        System.out.println(record);         
  
                    }
                    
                }

            }
            else
            {
                System.out.println("File does not exist in the location!");         
            }

        }
        catch(InputMismatchException e)
        {
            System.out.println("Error: " + e.getMessage());          

        }
        
        catch(Exception e)
        {
            System.out.println("Error: " + e.getMessage());          

        }

    }


    private static void updateStudentRecord()
    {
        try
        {
            if(Files.exists(FILE_PATH))
            {
                boolean updateFlag = false;
                try(BufferedReader reader = Files.newBufferedReader(FILE_PATH);
                   BufferedWriter writer = Files.newBufferedWriter(TEMP_FILE_PATH))
                {
                    
                    Scanner ss = new Scanner(System.in);

                    System.out.print("Enter Student Number: ");
                    String studentNumUpdate = ss.nextLine();
                    String line;

                    while((line = reader.readLine()) != null )
                    {
                        String[] data = line.split(",");
                        if(data[0].equals(studentNumUpdate))
                        {
                            System.out.print("Enter new Score: ");
                            double newScore = ss.nextDouble();
                            data[4] = String.valueOf(newScore);
                            data[5] = String.valueOf(evaluateScore(newScore));                           
                            updateFlag = true;

                        }
                        writer.write(String.join(",", data) + "\n");
                    }
                    if (updateFlag != false)
                    {
                        System.out.println("Student score successfully updated!");
                    }
                    else
                    {
                        System.out.println("No record found for the student with ID !" + studentNumUpdate);
                    }

                }

                //Replaces the origianl Student record fil with the Temp file that contains the updard record.
                Files.delete(FILE_PATH);
                Files.move(TEMP_FILE_PATH, FILE_PATH);

            }
            else
            {
                System.out.println("File does not exist in the location!");         
            }
        }
        catch(IOException e)
        {
            System.out.println("Error: " + e.getMessage());          

        }
        catch(InputMismatchException e)
        {
            System.out.println("Error: " + e.getMessage());          

        }
        catch(MySWDVExceptions e)
        {
            System.out.println("Error: " + e.getMessage());          

        }
        
        catch(Exception e)
        {
            System.out.println("Error: " + e.getMessage());          

        }

    }



    // Method to delete a student
    private static void deleteStudentRecord()
     {
         try 
         {
             if (Files.exists(FILE_PATH)) 
             {
                 boolean deleteFlag = false;
                 try (BufferedReader reader = Files.newBufferedReader(FILE_PATH);
                      BufferedWriter writer = Files.newBufferedWriter(TEMP_FILE_PATH)) 
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
                 Files.delete(FILE_PATH);
                 Files.move(TEMP_FILE_PATH, FILE_PATH);
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
 


    public static char evaluateScore(double score) throws MySWDVExceptions
    {
        char grade = ' ';

        if (score < 0 || score > 100)
        {
            throw new MySWDVExceptions("Score must be between 0 and 100!\n");
        }

        if (score >= 39 && score < 40)
        {
            throw new MySWDVExceptions("Please add mark (1%) to this score!\n");
        }

        if (score >= 80)
        {
            grade = 'A';
        }
        else if (score >= 70)
        {
            grade = 'B';
        }
        else if (score >= 60)
        {
            grade = 'C';
        }
        else if (score >= 50)
        {
            grade = 'D';
        }
        else if (score >= 40)
        {
            grade = 'E';
        }
        else 
        {
            grade = 'F';
        } 

        return grade;

    }
}





class MySWDVExceptions extends Exception
{
    public MySWDVExceptions(String errorMessage)
    {
        super(errorMessage);
    }
}