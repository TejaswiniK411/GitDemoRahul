import java.util.Scanner;

public class shapeclass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius value : ");
		float radius = sc.nextFloat();
		float pi = 3.14f;
		float area_of_circle = pi*radius*radius;
		System.out.println("Enter the value circle  : " +area_of_circle);
		sc.close();
	}

}
