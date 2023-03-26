package test;

import java.util.Arrays;

public class Methodsofstring {
	// String is used to story the Text.....String is a Sequence of characters and
		// it's a class in java But considered as LITERAL
		// because of it's unique behavior.... literal:-numbers,letters,special char
		// included.
		void m1() {
			String a = "hello";
			String b = "HELLO";
			String c = new String("hello");
			String d = " hello Raju 143 & ";
			String g = "im[raju[jannu";

			System.out.println(a == c); // It's verify the address of the variable
			System.out.println("1" + a.equals(c));// It's equal's method verify the Data // Return type is boolean true or false
			System.out.println("2" + a.equalsIgnoreCase(b));// It's verify the data case sensitive no matter (Aa)
			System.out.println("3" + d.contains(g));// If this string contains the value 143 give the T otherwise F
		
			System.out.println(d.trim().startsWith("he")); // startswith() check string starts with the specified prefix value
			System.out.println("******* 6666");
			System.out.println(d.trim().endsWith("&"));// endswith() check string ends with the Specified suffix value
														// Her i'm used trim() method also it's neglect the space consider
														// the value
			System.out.println(d.length());// Return type is int(142789) count the no.of charters in String value
			System.out.println(d.trim().length());// trim() ignores the space
			System.out.println(b.toLowerCase());// Converts all of the characters in this String lower case to upper case.
												// default local
			System.out.println(a.toUpperCase());// Converts all of the characters in this String to upper case to lower
												// case. "
//			System.out.println("25"+d.toCharArray());
			
			char[] f = d.toCharArray();
			for(char k:f) {
				System.out.print(k + "     ");
			}
				
			
			
//			for(char x:f) {
//				System.out.println(f);
//			}
			
			System.out.println(";lkjhgfdsdfghjkl");
			System.out.println(f);
			
			System.out.println(d.indexOf("h"));// Return type int(123)in this check the position of the value
			System.out.println(d.charAt(8)); // Return type char at the specified index in string
			System.out.println(b.lastIndexOf("E"));
			
			System.out.println(d.substring(3)); //give the starting value and ending value wich word u word
			System.out.println(d.substring(2, 14));// Returns type string("epofnj")substring check specified start index and
													// last index value--
			System.out.println("jhgfghjkjhjkj");
			String w[]=d.split(" ");
			System.out.println(w);
			//System.out.println(Arrays.toString(d.split("$$$")));// Return type String split() is separate the string value
																// using of specified char
			System.out.println(Arrays.toString(g.split("\\[")));
			System.out.println(g.replace("im", " FGHJJHGFGHJKJHGH"));
	        			
		}


	public static void main(String[] args) {
		Methodsofstring q = new Methodsofstring();
		q.m1();

	}
   
}
