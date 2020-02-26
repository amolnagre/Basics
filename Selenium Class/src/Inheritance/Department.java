package Inheritance;

public class Department implements Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Department();
		e.salary();
		e.hr_policy();
		

	}
	
	@Override
	public void salary()
	{
		System.out.println("Salary Granted");
	}
	
	@Override
	public void hr_policy()
	{
		System.out.println("HR policy applied");
	}

}
