package Inheritance;

public class testBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Bike();
		
		b.color="Black";
		b.startBike();
		
		
		makeHonda m =new makeHonda();
		m.color="Blue";
		m.startBike();
		m.tyreType();
		
		Bike b1 = new makeHonda();
		b1.startBike();
		b1.stopBike();
		

		
	}

}
