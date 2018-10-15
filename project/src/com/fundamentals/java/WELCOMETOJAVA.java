package com.fundamentals.java;

import java.util.Scanner;

//public - Access Modifier 
//class - file type
public class WELCOMETOJAVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// someMethod();
		// stringExamples();
		// moreStringExamples();

	}

//	my first method 
	public static void someMethod() {
		// this is a single comment
		/**
		 * this is a multi-line comment
		 **/
		System.out.println("welcometojava");

	}

	public static void stringExamples() {
		// String = Type | str1 = variable name Welcome = string literal
		String str1 = "welcome";
		String str2 = new String("java");
		System.out.println(str2);
		// charAt method return a single character at a certain position
		char j = str1.charAt(2);// index is zero based
		System.out.println(j);
		// concat method joins two strings together ; called Concatenation
		String name = str2.concat(" is cool");
		System.out.println(name);
		// equals method will check to see if an object equals the string variable
		boolean isMyString = str1.equals(str2); // is str2 = str1 ?
		System.out.println(isMyString);
		// toLowercase method will make the variable with lower case letter
		String myString = str1.toLowerCase();
		System.out.println(myString);
		// toUpper case method will make the variable with upper case letter
		String mySecondString = str2.toUpperCase();
		System.out.println(mySecondString);
	}

	public static void moreStringExamples() {

		String myString = "My java String";
// Are these equal?
		boolean isTheSame = myString.toLowerCase().equals("my java string");
		System.out.println(isTheSame);
// myString is capitalized then added to is so capitalized 
		String name = myString.toUpperCase().concat(" is so captilized");
		System.out.println(name);
// equalsIngoreCase does not check if it has capitalization. it is ignored
		boolean testString = myString.equalsIgnoreCase("My java string");
		System.out.println(testString);
// contains method checks to see if it matches part of variable 
		boolean isContained = myString.contains("ava");
		System.out.println(isContained);
	}

	public static void dataTypeExamples() {
		PrimitiveExamples pe = new PrimitiveExamples();
		pe.myFirstPrimitiveMethod();
		pe.myAddition();
		pe.mySubtraction();
		pe.myMultipication();
		pe.myDivison();
		pe.myModulus();
		pe.myOrderop();
	}

//Example of the use of Scanner 
	public void scannerExample() {
		int x, y, z;
		System.out.println("Enter two integers to calculate their sum");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = x + y;
		System.out.println("Sum of entered integers = " + 2);
	}
}
