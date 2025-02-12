package Copy_from_oneFile_to_another;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// CopyPaste CLass
public class CopyPaste {

// Main Method
	public static void main(String[] args) throws IOException {

		FileInputStream fi = new FileInputStream("C:\\Users\\RAHUL\\OneDrive\\Desktop\\File Handling Files\\File1.txt");
		FileOutputStream fo = new FileOutputStream("C:\\Users\\RAHUL\\OneDrive\\Desktop\\File Handling Files\\File2.txt");

		int i;

		while ((i = fi.read()) != -1) {
			fo.write((char) i);
		}
		
		System.out.println("Completed");

	}

}
