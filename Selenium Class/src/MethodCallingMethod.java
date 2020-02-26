
public class MethodCallingMethod {

	
	public void go()
	{
		System.out.println("Inside Go() Method");
	}
	
	public void go1()
	{
		System.out.println("Inside Go1() Method");
		go();
	}
	
	
	public void go2()
	{
		System.out.println("Inside Go2() Method");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodCallingMethod m=new MethodCallingMethod();// Creation Object
		m.go1();
		System.out.println("After Calling Go1() Method");
	}

}
