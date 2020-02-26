package ExceptionalHandling;

public class test {
/*
 * try{
 * exception
 * }catch(Throwable t{
 * exception handling code
 * }
 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before try block");
		try{
			System.out.println("Begining");
			int divide=10/0;
			System.out.println(divide);
			System.out.println("Ending");
		}catch( Exception e)
		{
			System.out.println("Error Occured");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("After try catch block");
	}

}
