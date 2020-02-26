package Functional_Overloading;

//Write 2 methods o find minimum number between two integer values and two float values 
//using function overloading

public class FunctionOverloadingFloat {
	
	//static float num1= (float) 70.3;
	//static float num2=  (float) 30.8;
	
	public static void minNumber(float num1, float num2)
	{
		//float num1= 70.3f;
		//float num2= 30.8f;
	
		if (num1<num2)
		{
			System.out.println("Minimun Number  "+num1);
		}
		else
		{
			System.out.println("Minimun Number  "+num2);
		}
	
	
	}
 public static int minNumber(int a,int b)
 {
	 if(a<b)
	 {
		 //System.out.println("Minimun Number  "+a);
		 return a;
	 }
	 else
	 {
		 //System.out.println("Minimun Number  "+b);
		 return b;
	 }
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		minNumber(30.4f,50.67f);
		int min=minNumber(20,30);
		System.out.println("minimum number  "+min);
	}

}
