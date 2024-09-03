package CollectionFramework;
import java.util.*;

public class StackClass {
	public static void main(String[] args) {
		Stack s= new Stack();
		s.add("tej");
		s.add(10);
		s.add("");
		s.add(null);
		System.out.println("push : " + s.push(45));
		//System.out.println("pop : " + s.pop());  //delets the last element 
		System.out.println("peek : " + s.peek()); //shows the last element 
		System.out.println("Capacity : " + s.size());
		System.out.println(s);
		
	}
}
