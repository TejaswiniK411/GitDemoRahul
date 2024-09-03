import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayClass {

	public static void main(String[] args) {
		//Array
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int arraysize = SC.nextInt();
		int[] array = new int[arraysize];
		System.out.println("Enter the elements of the array:");
		for(int i = 0; i <arraysize; i++) {
			array[i] = SC.nextInt();
			
		}
		System.out.println("elements of the array:");
		for(int i = 0; i <arraysize; i++) {
			System.out.println(array[i] + "");
			
		}
		
		
		String[] abc = new String[3];
		abc[0] = "abc";
		abc[1] = "xyzxcvb";
		//System.out.print(Arrays.toString(abc));
		for (int i = 0;i<abc.length;i++)
		{
		System.out.print(abc[i] + " "); }
		//ArrayList
		ArrayList<String> abc2 = new ArrayList<String>();
		abc2.add("abc");
		abc2.add("xysadf");
		//System.out.println(abc2);
		for (int i = 0; i<abc2.size(); i++)
		{
			System.out.println(abc2.get(i));
		}
		/* for (String i :abc2) { System.out.println(abc2); } */
		//Array
		String a[] = {"a","b","c"};
		for (int i = 0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		//multiple dimension array
		int rows= 4;
		int colums=4;
		int[][] abc3 = new int[rows][colums];
		int value=1;
		
		  for(int i =0;i<rows;i++) 
		  { for(int j=0;j<colums;j++) 
		  { abc3[i][j] = value;
		  value++; } }
		 
		System.out.print("2D array:");
		for(int i =0;i<rows;i++)
		{
			for(int j=0;j<colums;j++)
			{
				System.out.print(abc3[i][j]);
			}
			System.out.println();
		}
		
		//Array 2 dimenstion
		int[][] a1 = {{3,4},{1,2}};
		for(int i =0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a1[i][j]);
			}
			System.out.println();
		}
		
		 
	}

}
