package Assignment01;

public class PrimeNo {

	/*6.Write a program to find whether given no. is Prime or not.
		Ex: 30
		o/p:30 is not prime*/

	public static void main(String[] args) {

		int num=7,temp=0;
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}
				if(temp==0)
				{
					System.out.println(num+" Is Prime Numbers");
				}
				else{
					System.out.println(num+" is Not Prime Numbers ");
				}
	}

}
