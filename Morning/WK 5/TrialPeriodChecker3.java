import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeParseException;

public class TrialPeriodChecker3 {
    private static final String FILE_NAME = "trial3.txt";
    private static final int TRIAL_DAYS = 30;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static void main(String[] args) {
        int remainingDays = checkTrialPeriod();
        
        if (remainingDays > 0) {
            System.out.println("You have " + remainingDays + " days left in your trial.");
        } else {
            System.out.println("Your trial period has expired. Please purchase the full version.");
        }
    }

    private static int checkTrialPeriod() {
        try {
            File file = new File(FILE_NAME);
            LocalDate expiryDate;

            if (!file.exists()) {
                // First run, set expiration date to 30 days from today
                expiryDate = LocalDate.now().plusDays(TRIAL_DAYS);
                writeToFile(expiryDate.format(FORMATTER));
            } else {
                // Read expiration date from file
                String content = Files.readString(Path.of(FILE_NAME)).trim();
                expiryDate = LocalDate.parse(content, FORMATTER);
            }

            // Calculate remaining days
            long daysLeft = ChronoUnit.DAYS.between(LocalDate.now(), expiryDate);
            
            return (int) Math.max(daysLeft, 0); // Ensure we don't return negative values
        } catch (IOException | DateTimeParseException e) {
            System.out.println("Error accessing trial file: " + e.getMessage());
            return 0;
        }
    }

    private static void writeToFile(String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            writer.write(content);
        }
    }
}
