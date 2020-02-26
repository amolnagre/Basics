import java.util.Scanner;

public class Concatstr {

	public static void main(String[] args) {
		 String a,b,sum;
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Name:   ");
		a=sc.next();
		
		System.out.println("Enetr Second Name:  ");
		b=sc.next();
		
		sc.close();
		
		sum=a+" "+b;
		System.out.println("Your Name is:  " +sum);


	}

}
