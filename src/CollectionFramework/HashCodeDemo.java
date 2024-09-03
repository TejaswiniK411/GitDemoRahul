package CollectionFramework;
import java.util.HashSet;
import java.util.Set;

public class HashCodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet s = new HashSet();
		s.add(10);
		s.add("tej");
		s.add(false);
		s.add("tej");
		s.add(10.56);
		System.out.println(s);
		System.out.println("romve"+ s.removeAll(s));
		System.out.println(s);
		

	}

}
