package newpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.lang.Character.*;

public class JavaTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String[] arr = {};
		String strold = "This is a simple string for testing only";
		String[] arr = strold.split(" ");
		int arrlen = arr.length;
		String str = "mango";
		
		String newstr = " ";
		String first = " ";
		//System.out.println(str.substring(0,1).toUpperCase());  //str.substring(0,1).toUpperCase() ;
		
		for (String string : arr) {
			str = string;
			int len = str.length();
			for (int i = 0; i < len; i++) {
				
				if(i == 0)
				{
					first = str.substring(0,1).toUpperCase();
					newstr += first;
					
				}else {
					
					newstr += str.substring(i, i+1);
				}
				
				//System.out.println(newstr);
				
			}
			newstr += " ";
		}
		
		System.out.println(newstr);
		
		
		
		
			//System.out.println(newstr);
	}

}
