package CollectionFramework;
import java.util.LinkedList;
import java.util.List;




public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new LinkedList();
		l.add(10);
		l.add(12.3);
		l.add(true);
		l.add("tej");
		l.add('a');
		l.add("");
		l.add("tej");
		System.out.println(l);
		System.out.println(l.get(0));
		System.out.println(l.indexOf(10));
		System.out.println(l.size());
		System.out.println(l.indexOf("tej"));
		
	}

}
