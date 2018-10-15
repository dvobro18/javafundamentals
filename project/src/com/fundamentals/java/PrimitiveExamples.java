package com.fundamentals.java;

/*
 * this class will demonstrate Primitive Data Types
 * */
public class PrimitiveExamples {

	// Value range is true or false
	boolean isPrimitive = true;

	// Value range is 0 to 65535
	char mychar = 'a';

	// Value range is -128 to 127
	byte mybyte = 25;

	// Value range is -32768 to 32767
	short myshort = -250;

//Value range is -2147483648 to 2147483647
	int myInt = 34678;

//Value range is -9.223.372.036.854.775.808 to 9.223.372.036.854.775.807
	Long myLong = 52789l;

//Value range varies
	float myfloat = 20.543F;

//Value range varies 
	double myDouble = 36.89;
	int ab = 10;
	int cd = 24;

//Method changes instance value from 34678 to 3400 after it displays in the printLn
	public void myFirstPrimitiveMethod() {
		System.out.println(myInt);
		myInt = 3400;
		System.out.println(myInt);
	}

// Method adds to number to the total and displays the result
	public void myAddition() {
		int total = ab + cd;
		System.out.println(total);
	}

//Method subtracts two numbers to a total and displays the result
	public void mySubtraction() {
		int total = ab - cd;
		System.out.println(total);
	}

	// Method multiplies two numbers to a total and displays the result
	public void myMultipication() {
		int total = ab * cd;
		System.out.println(total);
	}

	// Method divides two numbers and displays the result
	public void myDivison() {
		double total = (double) cd / (double) ab;
		System.out.println(total);
	}

	// Method displays the remainder of the value
	public void myModulus() {
		int total = ab % cd;
		System.out.println(total);
	}

	// Method for order of operation
	public void myOrderop() {
		int total = (ab = cd) * 23;
		System.out.println(total);
	}
}

// TODO Auto-generated method stub
