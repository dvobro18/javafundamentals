package com.fundamentals.java;
/*
*Since this class is abstract, it does not have to implement its abstract methods
*of its parent. However, any subclass of this class must implement those abstract
*methods, unless. this class defines them itself
* Any abstract methods of this class, must be defined(implemented) in its subclasses.
***/
public abstract class GeometrySample extends Shape{
	/* This method orignated from the shape class and has been overridden in
	 * order to demonstrate a Polymorphism trait of defining its own behavior*/
	@Override
	public String draw() {
		return"Geometry Draws";	
		
}
	/* Abstract method must be defined (implemented) in the child class(subclass).
	 * An abstract method is constructed without a body and ends with a semi-colon
	 * Abstarct methods can be defined with parameters and a return type. and can be
	 * overloaded
	 **/
abstract void geometryMethod();
}
