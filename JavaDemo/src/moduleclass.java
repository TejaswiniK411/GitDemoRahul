import java.util.Scanner;

public class moduleclass {

	int i = 10 ;
	static int j = 10;
	
	public static void main(String[] args) {
		moduleclass mc = new moduleclass();
		System.out.println(mc.i);	
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println("please enter the number to tables : ");
		if (mc.i > j)
		{
			System.out.println("greater");
		}
		if (mc.i < j)
		{
			System.out.println("lesser");
		}
		else {
			System.out.println("equal");
		}
		for(int j = 1; j<=10-1; j++)
		{
			System.out.println(i+" X " +j+ "=" +i*j);
		}

	}

}
