
public class Keywords {
	int a = 10;
	public void add(int a)
	{
		a=this.a;
		System.out.println("value of a" +a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Keywords k = new Keywords();
		System.out.println(k.a);
		k.add(60);
		System.out.println(k.a);

	}

}
