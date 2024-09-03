package CollectionFramework;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(34);
		ts.add(35);
		ts.add(90);
		ts.add(90);
		//ts.clear();
		//ts.add(true);  //boolean and string value is also not allowed 
		//ts.add(null);  // null not allowed 
		System.out.println(ts);

	}

}
