
class superparent{
	int a =30;
//	public void add(int a) {
//		
//	}
}



public class SuperKeyworkd extends superparent {
	int a =20;
	public void add(int a ) {
		System.out.println("local varibale"+a);
		System.out.println("this varibale"+this.a);
		System.out.println("this varibale"+super.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeyworkd k = new SuperKeyworkd();
		k.add(10);

	}

}
