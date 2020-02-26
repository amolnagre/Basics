package Assignment01;

import java.util.Scanner;

public class OperationUsingSwitch {

	public static void main(String[] args) {
		/*9.Take input of two  numbers from user and 
		take one operator(+,-,*,/) as a input from user and do manipulations
		O/p: The multiplication of two no.s is: 600*/ 

		int num1,num2;
		char operator;
		int sum;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number: ");
		num1=sc.nextInt();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Second Number: ");
		num2=sc.nextInt();
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter the Operator ");
		operator=sc1.next().charAt(0);
		
		switch(operator)
		{
		case '+':
			sum=num1+num2;
			System.out.println("Addition is: "+sum);
			break;
		case '-':
			sum=num1-num2;
			System.out.println("Addition is: "+sum);
			break;
		case '*':
			sum=num1*num2;
			System.out.println("Addition is: "+sum);
			break;
		case '/':
			sum=num1/num2;
			System.out.println("Addition is: "+sum);
			break;	
		default:
			System.out.println("You Entered Indvalid Operator");
			
		
		}

		
		
		
		
		
		
		
		
		
		
	}

}
