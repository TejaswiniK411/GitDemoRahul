

class Methodoverloading {
	public void show() {
		System.out.print("Method overrriding");
	}
	
}


public class methodOverridingDemo extends Methodoverloading {
	
	public void show() {
		System.out.print("Child Method");
	}

	//Method overloading start 
	public void show(String str,int a) {
		System.out.print("Method1");
	}
	public void show(int a,String str) {
		System.out.print("Method2");
	}
	//Method overloading end
	
	
	public static void main(String[] args) {
		//Method overloading
		methodOverridingDemo od = new methodOverridingDemo();
		od.show("a",3);
		od.show("a",4);
		//End of method overloading 
		
		od.show();

	}

}
