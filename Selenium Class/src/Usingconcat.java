import java.util.Scanner;
public class Usingconcat {

	public static void main(String[] args) {
		String a,b,c;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Name: ");
		a=sc.next();
		
		System.out.println("Enetr Second Name: ");
		b=sc.next();
		
		a=a.concat(" ");
		c=a.concat(b);
		System.out.println("Your Name is : " +c);
		sc.close();
		

	}

}
