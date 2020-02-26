package Assignment01;

import java.util.Scanner;

public class DayUsingSwitch {

	public static void main(String[] args) {
		/*8.Write a program to display Day of the week using Switch case
			Ex: Day=3 then display 'Wednesday'*/

		int num;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number for the Day: ");
		num=sc.nextInt();
		
		switch(num)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}
	}

}
