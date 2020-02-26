package Functional_Overloading;

public class FunctionMinMathMethod {

	public static void minNumber()
	{
		int d=Math.min(20, 30);
		System.out.println("Minimum Number is  "+d);
	}
	public static void minNumber(float a, float b)
	{
		double d = Math.min(a, b);
		System.out.println("Minimum Number is"+d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		minNumber();
		minNumber(34.5f, 89.5f);
		}

}
