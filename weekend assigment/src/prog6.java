import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class prog6{

	public static void findFile() throws FileNotFoundException {

	       File newFile = new File("test.txt");
	    FileInputStream fis = new FileInputStream(newFile);
	  }

	  public static void main(String[] args) {
	   System.out.println("Print the exception");
	  }
	}