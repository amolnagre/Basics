package Functional_Overloading;

public class FunctionalOverloading {

	public static int a=30, b=20;
	
	public static void AddNumber()
	{
		int c=a+b;
		System.out.println("Addition is: "+c);
	}
	public static void AddNumber(int a,int b)
	{
		int add=a+b;
		System.out.println("Addition is: "+add);
	}
	public static void AddNumber(float a,float b)
	{
		double add=a+b;
		System.out.println("Addition is: "+add);
	}
	public void print()
	{
		System.out.println(" Learning Funtion Overloading...");
	}
	
	public static void main(String[] args) 
	{
		FunctionalOverloading fo=new FunctionalOverloading();
		fo.print();
		AddNumber();
		AddNumber(40,40);// passing integer arguments
		AddNumber(30.44f,40.66f);// passing float arguments  

	}

}
