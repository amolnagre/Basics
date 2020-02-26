package Functional_Overloading;

public class FunctionOverLoading {
// Function Overloading: Same function name with diffrent arguments
	
	public static int a=30;
	public static int b=20;
	
	public static void addNumbers()
	{
		int c=a+b;
		System.out.println("The Addition of two numbers"+c);
	}
	
	public static int addNumbers(int r, int s)
	{
		int add = r+s;
		return add;
		//System.out.println("The additon of two number is"+ add);
	}
	public void print()
	{
		System.out.println("The Learing function Overloading");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionOverLoading f = new FunctionOverLoading();
		f.print();
		addNumbers();
		int res=addNumbers(20,40);
		System.out.println("The addition of two numbers"+res);
	}
}
