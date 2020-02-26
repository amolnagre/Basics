package Collections;

import java.util.Hashtable;

public class HashtableInsideHashtable {
	public static void main(String[] args) {
		
		Hashtable <String,String> ht1=new Hashtable <String,String>();
		
		ht1.put("Caurse1","Selenium");
		ht1.put("Caurse2","QTP");
		
		Hashtable <String,String> ht2=new Hashtable <String,String>();
		
		ht2.put("Location1", "Pune");
		ht2.put("Location2", "Mumbai");
		
		Hashtable<String,Hashtable<String,String>> ht=new Hashtable<String,Hashtable<String,String>>();
		
		ht.put("Institute", ht1);
		ht.put("Place", ht2);
		
		System.out.println(ht.get("Institute").get("Caurse1"));
		System.out.println(ht.get("Place").get("Location1"));
		
	}

}
