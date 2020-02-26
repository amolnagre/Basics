package Collections;

import java.util.Hashtable;

public class TestHashtable {
	public static void main(String[] args) {
		
		Hashtable <String,String> ht=new Hashtable <String,String>();
		
		ht.put("Name","Amol");
		ht.put("Location", "Pune");
		ht.put("Caurse","Selenium");
		
		System.out.println(ht.get("Location"));
		
		ht.put("Caurse","Automation");
		System.out.println(ht.get("Caurse"));
		
		Hashtable <String,Integer> ht1=new Hashtable <String,Integer>();
		
		ht1.put("RollNo",105);
		
		System.out.println(ht1.get("RollNo"));
	}

}
