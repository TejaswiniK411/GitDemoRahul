

interface interface1
{
	public static final int a = 10;  //by default this is final 
	void show(); //abstract method 
	default void display() {
		System.out.println("default method");
	}
	public static  void run() {
		System.out.println("staic method");
	}
	
	private void run1() {
		System.out.println("private method");
	}
	
}

interface interface2 {
	void show2(); //abstract method
}

public class interfaceclass implements interface1,interface2 {
	@Override
	public void show() {
		System.out.println("Show method");
		
	}
	
	@Override
	public void show2() {
		System.out.println("Show2 method");
		
	}
	
	public static void main(String[] args) {
		interfaceclass ifc = new interfaceclass();
		System.out.println(a);
		ifc.show();
		ifc.display();
	
	}
	


	

}
