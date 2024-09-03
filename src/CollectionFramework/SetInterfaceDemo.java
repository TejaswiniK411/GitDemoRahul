package CollectionFramework;
import java.util.*;

public class SetInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set a = new HashSet();
		a.add(10);
		a.add(10.34);
		a.add("string");
		a.add(true);
		a.add(null);
		a.add("string"); //duplicate value wont take 
		System.out.print(a);

	}

}
