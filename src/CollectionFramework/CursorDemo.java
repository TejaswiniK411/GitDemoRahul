package CollectionFramework;
import java.util.Vector;
import java.util.Enumeration;

public class CursorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v =  new Vector();
		v.add(10);
		v.add("tej");
		v.add(35.78);
		v.add(true);
		v.add("tej");
		Enumeration e =  v.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		System.out.println(v);

	}

}
