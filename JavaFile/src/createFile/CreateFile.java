package createFile;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Create a File
		System.out.println("----------------------\n");
		try {
		      File myObj = new File("filename.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		try {  
		      File myObj = new File("C:\\Users\\M_Oezdemir\\Desktop\\java_programm\\JavaFile");  
		      if (myObj.createNewFile()) {  
		        System.out.println("File created: " + myObj.getName());  
		        System.out.println("Absolute path: " + myObj.getAbsolutePath());  
		      } else {  
		        System.out.println("File already exists.");  
		      }  
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();  
		    }  
		System.out.println("----------------------\n");
		//Write To a File
		try {
		      FileWriter myWriter = new FileWriter("filename.txt");
		      myWriter.write("Files in Java might be tricky, but it is fun enough!");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		System.out.println("----------------------\n");
		//Java Read Files
		 try {
		File myObj = new File("filename.txt");
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        System.out.println(data);
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
		 
		 System.out.println("----------------------\n");
		 //Get File Information
		 File myObj = new File("filename.txt");
		    if (myObj.exists()) {
		      System.out.println("File name: " + myObj.getName());
		      System.out.println("Absolute path: " + myObj.getAbsolutePath());
		      System.out.println("Writeable: " + myObj.canWrite());
		      System.out.println("Readable " + myObj.canRead());
		      System.out.println("File size in bytes " + myObj.length());
		    } else {
		      System.out.println("The file does not exist.");
		    }
		    
		    
		    System.out.println("----------------------\n");
		    //Java Delete Files
		    
		    if (myObj.delete()) { 
		        System.out.println("Deleted the file: " + myObj.getName());
		      } else {
		        System.out.println("Failed to delete the file.");
		      } 
		    
		    
		    System.out.println("----------------------\n");
		    //Delete a Folder
		    
		    if (myObj.delete()) { 
		        System.out.println("Deleted the folder: " + myObj.getName());
		      } else {
		        System.out.println("Failed to delete the folder.");
		      } 
		  }
		}