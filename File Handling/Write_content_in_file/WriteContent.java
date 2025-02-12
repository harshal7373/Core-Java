package Write_content_in_file;

import java.io.FileWriter;
import java.io.IOException;

// Class WriteContent
public class WriteContent {
// Main Method
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\RAHUL\\OneDrive\\Desktop\\File Handling Files\\File1.txt");
		
		fw.write("Hello Wold, How are you all");
		fw.close();
	}
}
