package Collections;
import java.util.ArrayList;


public class TestArrayList {
	
	//Collections:---
	/* 1.ArrayList
	 * 2.Set
	 * 3.Hashtable
	 */
	
	public static void main(String[] args) {
		
		ArrayList mylist=new ArrayList();
		//ArryList<String> mylist=new ArrayList<String>();
		
		mylist.add("Amol");
		mylist.add("Mangesh");
		mylist.add("Shiva");
		
		System.out.println(mylist.get(2));
		System.out.println(mylist.size());
		for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}
		
	}

}
