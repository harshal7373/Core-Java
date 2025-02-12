package Create_File;

import java.io.File;
import java.io.IOException;

// Class CreateFile
public class CreateFile {

// Main Method
	public static void main(String[] args) throws IOException {
		
		File f1 = new File("C:\\Users\\RAHUL\\OneDrive\\Desktop\\File Handling Files\\File1.txt");
		
		f1.createNewFile();  // File Created
		
		System.out.println(f1.canRead());
		System.out.println(f1.canExecute());
		System.out.println(f1.canWrite());
		System.out.println(f1.getAbsolutePath());
	    System.out.println(f1.getName());
	    System.out.println(f1.length()); 
	    
//	    System.out.println(f1.delete());  // This Method will Delete File
		
	}
}
