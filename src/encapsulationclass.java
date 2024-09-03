
class Employee {

	private int empid = 101;
	public void setEmpID(int empID)
	{
		empid = empID;
	}
	
	public int getEmpID() {
		return empid;
	}
}
	public class encapsulationclass {
	public static void main(String[] args)
	{
		Employee e= new Employee();
		int a = e.getEmpID();
		e.setEmpID(10);
		
		System.out.println(a);

	}
	

}
