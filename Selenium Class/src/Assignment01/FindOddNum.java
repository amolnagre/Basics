package Assignment01;

import java.util.Scanner;

public class FindOddNum {

	public static void main(String[] args) {
		//4. Find odd number using for loop
		
		int num;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number for Odd list: ");
		num=sc.nextInt();
		
		for(int i=0;i<=num;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
		
		
		
		
		

	}

}
