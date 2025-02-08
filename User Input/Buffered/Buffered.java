package Buffered;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffered {

	public static void main(String[] args) throws IOException{
		
		Buffered a1 = new Buffered();
		
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
    System.out.println("Enter roll no, Name and Marks");
 int rno=Integer.parseInt(br.readLine());
 String name=br.readLine();
 float marks=Float.parseFloat(br.readLine());
 
 
 System.out.println("roll no: " + rno );
 System.out.println("Name: " + name );
 System.out.println("Marks: " + marks );

    
    
	}
}
