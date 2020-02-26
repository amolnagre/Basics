package Loop;

public class EnhancedForLoop {
	
	public static void main(String[] args) {
		
		int[] numbers = {3,4,5,7,0,12};
		int sum=0;
		// Enhanced For Loop
		for (int num : numbers)
		{
			sum=sum+num;
		}
		System.out.println("Sum of Array Elements is: "+sum);
		
		//Declaration an array
		
		int arr[]={12,13,14,44};
		// traversing the array with Enhanced for loop
		
		for(int i:arr)
		System.out.println(i);
			
		
	}

}
