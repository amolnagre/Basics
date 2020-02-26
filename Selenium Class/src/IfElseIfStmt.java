
public class IfElseIfStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int num=(int)(Math.random()*20);
	System.out.println(num);
	/*
	 * Example of If Statements
	 * if(num>10)
		System.out.println(num+" IsGreater than 10");
	 */
	
	
	
	/*
	 * Example of If Else Statement
	 * 
	if(num>10)
		System.out.println(num+" IsGreater than 10");
	
	else
		System.out.println(num+" Is Less than 10");
	*/
	
	if(num>10)
		System.out.println(num+" Is Greater than 10");
	
	else if(num<=10 && num>=5)
		System.out.println(num+" Is Between 10 and 5");
	else
		System.out.println(num+" Is less than 5");
	
	
	}

}
