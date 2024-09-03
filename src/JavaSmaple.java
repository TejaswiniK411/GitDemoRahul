import java.util.Scanner;

public class JavaSmaple {

	public static void main(String[] args) {
		String str = "teju";
		int a = 30;
		boolean b = false;
		int b1 = 40;
		//Scanner class
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the first number");
		//int num1 = sc.nextInt();
		//System.out.println("Enter the second number");
		//int num2 = sc.nextInt();
		//System.out.println("Subtraction of 2 number " +(num1-num2));
		System.out.println("Enter the string ");
		String s = sc.nextLine();
		String s1 = sc.nextLine();
		System.out.println("print string " + s.concat(s1));
		sc.close();
		//Scanner class end 
		System.out.println("boolean datatype value is : "+b1);
		System.out.println("String datatype value is : "+str);
		System.out.println("Addition of 2 number " +(a+b1));
		System.out.println("Subtraction of 2 number " +(a-b1));
		System.out.println("division of 2 number " +(a/b1));
		System.out.println("modulas of 2 number " +(a*b1));
	}

}
