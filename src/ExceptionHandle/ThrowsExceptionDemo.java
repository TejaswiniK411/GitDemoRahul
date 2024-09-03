package ExceptionHandle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsExceptionDemo {
	
	public void FileInputStriem() throws FileNotFoundException {
		FileInputStream fs =  new FileInputStream("E:\\Tejaswini - Copy.docx");
	}
	
	public void FileOutput() throws FileNotFoundException,IOException  {
		FileInputStream fs =  new FileInputStream("E:\\Tejaswini - Copy.docx");
		System.out.println("File Found");
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ThrowsExceptionDemo TED = new ThrowsExceptionDemo();
		
		try {
		TED.FileOutput();
		//TED.FileInputStriem();
		
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		
	}

}
