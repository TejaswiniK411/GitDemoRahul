
public class finalKeyword {
	final int a =20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finalKeyword f= new finalKeyword();
		//f.a = 30; --will throw error as final keyword can not be updated 
		System.out.println(f.a);
	}

}
