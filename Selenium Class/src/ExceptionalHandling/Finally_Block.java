package ExceptionalHandling;

public class Finally_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int x=100;
		
		try{
			
			
			//int i[]=new int[4];
			//i[5]=100;
			/* System.out.println("close db connection in try block");
			//DB Connection
			//Executing some questions
			//Validating data and comparing from website
			//closing connection */
		}catch (Exception e)
		{
			System.out.println("Error Occured");
			
		}//Code inside finally block will always be executed
		
		finally{
			System.out.println("closing the DB connection in finally block");
		}

	}

}
