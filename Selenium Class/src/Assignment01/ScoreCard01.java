package Assignment01;

import java.util.Scanner;

public class ScoreCard01 {

	public static void main(String[] args) {
		// Assignment 1st Score card using nested if else
		
		int score;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Score : ");
		score=sc.nextInt();
		
		if(score<50)
		{
			System.out.println("You are Fail...");
		}else if(score>50 && score<60)
		{
			System.out.println("You are Grade is 'D' ");
		}else if(score>60 && score<70)
		{
			System.out.println("You are Grade is 'C' ");
		}else if(score>70 && score<80)
		{
			System.out.println("You are Grade is 'B' ");
		}else if(score>80 && score<90)
		{
			System.out.println("You are Grade is 'A' ");
		}else if(score>90 && score<100)
		{
			System.out.println("You are Grade is 'A+' ");
		}
		else
		{
			System.out.println("You are Entered wrong Score... ");
		}
		
		
		
		
		

	}

}
