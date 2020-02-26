
public class Methodcalling {
	
	// Static Method to can not give a call to non-static methods directly
	// Static Method to static Method we can directly call each other.
	// Non-static to static method we can also directly call to static method using method calling
	// Non-static to non-static method we can directly call to each other.
	
	public void go()// Non-static method
	{
		System.out.println("inside go Method");
		go1();// non static to non static directly call
	}
	
	public void go1()//non static method
	{
		System.out.println("inside go1 Method");
		go2();// non static method directly call to non static method.
		go3();// non static directly call to static method.
	}
	
	public void go2()//non static method
	{
		System.out.println("inside go2 Method");
	}
	
	public static void go3()// static method
	{
		System.out.println("inside go3 Static Method");
		System.out.println("inside go3 Method");
	}
	
	
	

	public static void main(String[] args) {
		// Method Calling Method
		
		Methodcalling m=new Methodcalling();// Creating Object for call to all non-static methods.
		m.go();
		//m.go1();
		//m.go2();
		//m.go3();
		go3();// static to static directly call without using object because static main directly call to go3() static method
	}

}
