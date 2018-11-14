package com.fundamentals.java;
/*
 * Since the class ectends Square instead of Shape, it is not required
 * to implement/use the methods from the Shape class.
 * However, you can still override them if you choose. 
 ***/
public class Rectangle extends Square{
	
	@Override
	public String draw() {
		return "Rectangle Draw";
	}
}

