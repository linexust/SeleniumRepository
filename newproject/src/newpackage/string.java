package newpackage;

import java.util.*;
import java.util.regex.*;
import java.util.stream.IntStream;


public class string {

	public static void main(String[] args) {		
		
		String str = "This 123 is # a 4 ^& string 56";
		Pattern p = Pattern.compile("[a-z]{3}");
		Matcher m = p.matcher(str);
		//boolean b = m.matches();
		String[] coll = new String[50];
		
		int counter=0; 
		
		while(m.find())
		{
			coll[counter] =  m.group();
			//System.out.println(m.group());
			counter++;
		}	
		
		for (int i = 0; i < counter; i++) {
			System.out.println(coll[i]);
		}	
		
		System.out.println(counter);				

	}

}
