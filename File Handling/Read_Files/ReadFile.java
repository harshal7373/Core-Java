package Read_Files;

import java.io.FileReader;
import java.io.IOException;

// Class ReadFile
public class ReadFile {

// Main Method
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("C:\\Users\\RAHUL\\OneDrive\\Desktop\\file2.txt");

		int i;

		while ((i = fr.read()) != -1) {
			System.out.print((char) i);
		}
	}
}
