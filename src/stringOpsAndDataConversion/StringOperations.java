package stringOpsAndDataConversion;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class StringOperations {
	

	public static void main(String[] args) {
		
		// Store text value
		String value = " Username : Admin | Password : admin123 ";
		
		//Total chars available with in the String ==> String.length();
		System.out.println("Total Chars in String :"+value.length());
		
		//Get Specific char from specific index ==> String.charAt(Index);
		System.out.println("Char available at Index 5 :"+value.charAt(5));
		
		//Reverse the String
		String reverseString="";
		
		for(int i=value.length()-1;i>=0 ;i--) {
			reverseString = reverseString+value.charAt(i);
		}
		System.out.println(reverseString);
		
		//Remove unwanted spaces from the String ==> String.trim();
		System.out.println("Normal Value:"+value);
		System.out.println("Trimmed Value:"+value.trim());
		
		//Remove all spaces from the String ==> String.replace(oldchars, newChars);
		System.out.println("Value without Spaces:"+value.replace(" ", ""));
		
		//Remove all alphabets from the String ==> String.replaceAll(regExp, newChars);
		System.out.println("Value without Alphabets:"+value.replaceAll("[a-zA-Z]", ""));
		
		//Remove all numbers from the String ==> String.replaceAll(regExp, newChars);
		System.out.println("Value without Numbers:"+value.replaceAll("[0-9]", ""));
		
		//Remove all special Chars from the String ==> String.replaceAll(regExp, newChars);
		System.out.println("Value without Special Chars:"+value.replaceAll("[^0-9a-zA-Z]", ""));
		
		//Change the case of chars in String ==> String.toUpperCase(); , String.toLowerCase();
		System.out.println("Normal Value:"+value);
		System.out.println("Upper Case Value:"+value.toUpperCase());
		System.out.println("Lower Case Value:"+value.toLowerCase());
		
		// Extract part of String ==> value.subString(beginingIndex);value.subString(beginingIndex,endingIndex+1);
		System.out.println("Username is:"+value.substring(12, 17));
		System.out.println("Password is:"+value.substring(31));
		
		// Extract part of String from dynamic text ==> value.split(expression);
		String [] splittedText = value.split(" ");
		System.out.println(splittedText[3]);
		System.out.println(splittedText[7]);

		//Compare String values ==>equals (exact match), equalsIgnoreCase (exact match without case sensitive), contains (partial match), startWith(prefix), endsWith(trailing chars) 
		String name = "Bharath";
		System.out.println(name.equals("Bharath"));
		System.out.println(name.equals("bharath"));
		System.out.println(name.equalsIgnoreCase("bharath"));
		System.out.println(name.contains("hara"));
		System.out.println(name.contains("Hara"));
		System.out.println(name.startsWith("Bha"));
		System.out.println(name.endsWith("ath"));
		
		//Join the Strings together ==> String.concat("String");
		System.out.println("Bharath".concat(" Reddy"));
		
		//String is empty ? (not even white spaces) or Blank ? (white spaces allowed)
		System.out.println("".isEmpty());
		System.out.println(" ".isEmpty());
		System.out.println(" ".isBlank());
		
		String [] values = {""," ",null,"Prateek"};
		
		for (int i=0; i<values.length;i++) {
			if(values[i]==null) {
				System.out.println("Null at Index :"+i);
			}else if(values[i].isEmpty()) {
				System.out.println("Empty at Index :"+i);
			}else if(values[i].isBlank()) {
				System.out.println("Blank at Index :"+i);
			}else {
				System.out.println("Normal Value at Index :"+i);
			}
		}
		
		// String, StringBuffer, StringBuilder
		
		//String ==> immutable class
		//StringBuffer ==> Mutable Class ==> Synchronized
		//StringBuilder ==> Mutable Class ==> Non-Synchronized
		
		//String
		String val = "Bharath";
		val.concat(" Reddy");
		System.out.println(val);
		
		// StringBuffer
		StringBuffer sbf = new StringBuffer("Bharath");
		sbf.append(" Reddy");
		System.out.println(sbf);

		// StringBuilder
		StringBuilder sbd = new StringBuilder("Bharath");
		sbd.append(" Reddy");
		System.out.println(sbd);
		
		//How to convert the data from String to other data types and other data type to String
		//type conversion ==> one data type to other data type
		//type casting ==> one data type to similar data type
		
		//type conversion
		int stdCode = 144;
		int phoneNumber = 345532;
		String StdCode = String.valueOf(stdCode);
		System.out.println(StdCode+phoneNumber);
		
		//String to Integer
		String balance = "  Account Balance : 9999.99$ ";
		double Balance = Double.valueOf(balance);//Integer.parseInt(String); Integer.valueOf(String); 
		
		if(Balance>=10000) {
			System.out.println("Account is having minimum balance");
		}else {
			System.out.println("Account is not having minimum balance");
		}
		
		// Converting time-stamp to String
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyhhmmss");
		String uniqueId = sdf.format(Calendar.getInstance().getTime());
		System.out.println(uniqueId);
		
		//type casting
		
		//byte--> short --> int --> long -->float --> double
		byte num = 98;
		int Num = num; //Auto Casting
		
		int numb = 98;
		byte Numb = (byte)numb; // down casting
		System.out.println(Numb);
		

		
	}

}
