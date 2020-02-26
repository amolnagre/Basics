import java.util.Scanner;

public class NaturalNumWhile {

	public static void main(String[] args) {
		// Print Natural Numbers from 1 to 10
		
		//Scanner sc=new Scanner(System.in);
		//int num=sc.nextInt();
		
		  int num = 10, count = 1, sum = 0;

	       while(count <= num)
	       {
	           sum = sum + count;
	           count++;
	       }

	       System.out.println("Sum of first 10 natural numbers is: "+sum);
	}
}
