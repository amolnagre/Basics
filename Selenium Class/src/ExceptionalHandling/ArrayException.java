package ExceptionalHandling;

public class ArrayException {
	
	public static void main (String args[])
	{ 
		System.out.println("Begining");
		try{
			int i[]=new int[4];
			i[5]=100;
		}catch (Exception e)
		{
			System.out.println("Error Occured");
			e.printStackTrace();
		}
		System.out.println("Ending");
	}

	/*Gmail Validation
	 * Take Screenshot
	 * send mail attached screenshot
	 * and print error message in subject of mail
	 */
}
