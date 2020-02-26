package Assignment01;

import java.util.Scanner;

public class FindEvenNum {

	public static void main(String[] args) {
		//5. Write a program to find and list Even numbers between
		//1 and any given number. Example: Limit=50
 
		
		int num;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number for Even list: ");
		num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}

}
