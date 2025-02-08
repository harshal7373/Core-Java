package Command_Arguments;

public class CmdLineArgument {
    public static void main(String[] args) {
        try {
            // Check if at least 4 arguments are provided
            if (args.length < 4) {
                throw new IllegalArgumentException("Insufficient arguments! Please provide: RollNo, Name, Marks, and Grade.");
            }

            // Parse command-line arguments
            int rno = Integer.parseInt(args[0]);  // Convert to int
            String name = args[1];  // Name remains a string
            float marks = Float.parseFloat(args[2]);  // Convert to float
            char grade = args[3].charAt(0);  // Extract first character for grade

            // Display the output
            System.out.println("Roll No: " + rno);
            System.out.println("Name: " + name);
            System.out.println("Marks: " + marks);
            System.out.println("Grade: " + grade);
        } 
        catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format! Ensure RollNo is an integer and Marks is a float.");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Missing command-line arguments! Please provide all required inputs.");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
