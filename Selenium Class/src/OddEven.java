import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int num=(int)(Math.random()*20);
		Scanner sc=new Scanner(System.in);
		int num1;
		
		System.out.println("Enter the Number: ");
		num1=sc.nextInt();
		System.out.println(" You Entered the Number is: "+num1);
		
		if(num1%2==0)
			System.out.println(num1+" Number is Even");
			
		else
			System.out.println("Number is Odd");

	}

}
