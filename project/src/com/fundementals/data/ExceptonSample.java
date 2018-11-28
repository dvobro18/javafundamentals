package com.fundementals.data;

public class ExceptonSample {
	String type null;
	
	public void myException() {
		try {
			System.out.println(type.trim());//fail
		} catch (NullPointerException.ex) {/// 3
			System.out.println("NullPointer Exception thrown * = ex.getMessage());
					}catch (Exeption.e) {//
						System.out.println("General Exception thrown " + e.getMessage());
		}
	}
	
	public void mySecondException() {
		try {
			type = "something cool";
			System.out.println(type.toUpperCase());
		} catch ("NullPointer Exeption thrown" + ex.getMessage()):
			
	} finally {
		System.out.println("Finally block called);
		}
	}
public void myThirdException() {
	//Strong[] names = ( "Matt", "Dave","John");
	String[] names = ( "11", "22","33");
try {
	byte b = Byte.parseByte(names(1));
	System.out.println(b);
} catch(IndexOutOfBoundsException.e) {
	System.out.println("Please provide a value in the range "+e.getMessage());
} catch(NumberFormatException f) {
	System.out.println("That's not a number " +f.getMessages());
} catch (OutOfMemoryError ex) {
	System.out.println("you gave me more than a byte" +e.getMessage());
} catch Exception e){
			System.out.println("I dummo but its wrong" +e.getMessages());
			
}

}
}