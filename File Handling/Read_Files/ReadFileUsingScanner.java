package Read_Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Class ReadFileUsinfScanner
public class ReadFileUsingScanner {

// Main Method
	public static void main(String[] args) throws FileNotFoundException {

		File f = new File("C:\\Users\\RAHUL\\OneDrive\\Desktop\\File Handling Files\\File1.txt");

		Scanner s1 = new Scanner(f);

		while (s1.hasNextLine()) {
			System.out.println(s1.nextLine());
		}
	}
}
