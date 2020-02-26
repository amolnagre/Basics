package ExceptionalHandling;

public class Caught_Exception {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int i[] = new int[4];
		i[5]=1000;
		System.out.println("Exceptions");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread.sleep(3000);
		Thread.sleep(1000);
		

	}

}
