
public class InstanceAndLocalVar {
	
	static int i=10;// instance variable or Local variable

	public void go()
	{
		i=123;// Global variable accessible for any where in the class 
		int j=234;// Local Variable--> only accessible for this method
	}
	
	public void go1(){
		int k=45;//Local variable for this go1 method only
		//j=20;//not accessible for this class 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
