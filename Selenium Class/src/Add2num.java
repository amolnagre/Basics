import java.util.Scanner;
public class Add2num {

	public static void main(String[] args) {
		int a,b,sum;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number for Addition:  ");
		a=sc.nextInt();
		
		System.out.println("Enetr Second Number for Addition:  ");
		b=sc.nextInt();
		
		sc.close();
		
		sum=a+b;
		System.out.println("Additon of Two Number is:  "+sum);

	}

}
