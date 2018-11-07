package com.fundamentals.java;

public class Apple {
public static final int SOUR_SCALE = 10;
public static int SWEET_SCALE = 20;
	int size = 1;
public String color = "red";
public char[] display;

void myApplemethod() {
	System.out.println("my Apple meththod");
}
public void myApplesecondmethod() {
	System.out.println("my apple second method");
}

protected void myAppleProtected() {
	System.out.println("my Apple is protected");
}
public void display(String type, int count) {
}{
	int count;
	display(type, count, "Green");
}
public void display(String type, int count, String color) {
	System.out.println("I would like "+count+ ""+type+"aples that are "+color);
}
public String display(String type, String color) {
	return "I would like 6 " +type+" apples that are" +color;
}


}
