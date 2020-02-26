package Array;

public class OneDimentional {
	// Sum of 1 to 10 Natural number Array element and print it 
	
	public static void main(String[] args) {

		int MyArray[]={1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int i=0;i<MyArray.length;i++)
		{
			sum=sum+MyArray[i];
		}
		System.out.println("Sum of Array Elements is: "+sum);
	}

}
