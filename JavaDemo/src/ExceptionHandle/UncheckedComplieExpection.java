package ExceptionHandle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UncheckedComplieExpection {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fs = new FileInputStream("E:\\Tejaswini - Copy.docx");
		
		if (fs.equals(null)) {
			System.out.println("File Not Found");
		}
		else {
			System.out.println("File Found");
		}
		

	}

}
