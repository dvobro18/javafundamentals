package com.fundamentals.java;

import java.util.Scanner;

import com.designpatteerns.behavioral.BikeGearBox;
import com.designpatteerns.behavioral.BikeSpeedMonitor;
import com.designpatteerns.behavioral.BikeSpeedometer;
import com.designpatteerns.behavioral.GearBox;
import com.designpatteerns.behavioral.SpeedMonitor;
import com.designpatteerns.behavioral.Speedometer;
import com.designpatteerns.behavioral.WheelDiagnostics;
import com.designpatteerns.behavioral.WheelInventory;
import com.designpatteerns.behavioral.mountainBikeRange;
import com.designpatterns.base.BikeInterface;
import com.designpatterns.base.BikeInterface.Color;
import com.designpatterns.base.NarrowWheel;
import com.designpatterns.base.RoadBike;
import com.designpatterns.base.TouringBike;
import com.designpatterns.base.WheelInterface;
import com.designpatterns.base.WideWheel;
import com.designpatterns.creational.AbstractBikeFactory;
import com.designpatterns.creational.BikeBuilder;
import com.designpatterns.creational.BikeDirector;
import com.designpatterns.creational.BikeFrameInterface;
import com.designpatterns.creational.BikeSeatInterface;
import com.designpatterns.creational.RoadBikeBuilder;
import com.designpatterns.creational.RoadBikeDirector;
import com.designpatterns.creational.RoadBikeFactory;
import com.designpatterns.creational.SerialNumberGenerator;
import com.designpattterns.structural.CustomGrips;
import com.designpattterns.structural.GoldFrameBike;
import com.designpattterns.structural.UltraWheelAdapter;
import com.fundamentals.java.House1.House;
import com.fundementals.data.Dinner;
import com.fundementals.data.GrannySmiths;
import com.fundementals.data.HolidayDinner;
import com.fundementals.data.Quiz2;
import com.fundementals.data.Trex;

/*
 * public - Access Modifier 
 * class - File type 
 * WelcomeTojava - Name of class 
 */

enum icecream {
	Vanila,Chocolate,Strawberry,Carmel;
}
public class WelcomeToJava {
	
	public static final int MY_VALUE;
	public static int MY_OTHER_VALUE;
	
	static {
		MY_OTHER_VALUE = 25;
		int total = MY_VALUE * MY_OTHER_VALUE;// total should 250
		System.out.println(total);
	}
	public static void fundamentalExample() {
		MY_OTHER_VALUE = 35;
	}
public static void main1 (String[]args) {
	creationalPatterns();
}



public static void creationalPatterns() {
	//AbstractFactory
	//String whatToMake = "roadBike";
	AbstractBikeFactory factory = new RoadBikeFactory();
	BikeFrameInterface frame = factory.createFrame();
	BikeSeatInterface seat = factory.createBikeSeat();
	System.out.println(frame.getFrameParts());
	System.out.println(seat.getSeatParts());
}

	public static void main(String[] args) {
		
		MY_OTHER_VALUE = 35;
		// TODO Auto-generated method stub
		// someMethod();
		// stringExamples();
		// moreStringExamples();
		// primitiveExamples();
		// scannerExample();
		// myOperatorExample();
		// myAssignmentExample();
		// myDecisionExample();
		//mysongexample();
		//accessmoModifierExamples();
		//quiz1();
		//inheritanceExample();
		//overloadExample();
		//overrideExample();
		//myAbstractExample();
		//mySongExample();
		//sampleUtility();
		//enumExample();
		iteratorPattern();
		visitorPattern();
		}
	//Builder
	RoadBike bike = new TouringBike(new NarrowWheel(22), Color.CHROME);
	BikeBuilder builder = new RoadBikeBuilder(bike);
	BikeDirector direct = new RoadBikeDirector();
	private BikeDirector director;
	BikeInterface bikeInterface = director.build(builder);
	System.out.println(bikeInterface);
	
	//Singleton
	System.out.println("Generating Serial Numbers");
	SerialNumberGenerator generator = SerialNumberGenerator.getinstance();
	System.out.println("next serial" + generator.getNextSerial());
	System.out.println("next serial + generator.getNextSerial"());
	System.out.println("next + generator.getNextSerial"();

public static void observerPaatternV2() {
	BikeSpeedometer speedo = new BikeSpeedometer();
	speedo.addSpeedometerListener(new BikeSpeedMonitor());
	speedo.addSpeedometerListener(new BikeGearBox());
	
	speedo.setCurrentSpeed(5);
	speedo.setCurrentSpeed(10);
	speedo.setCurrentSpeed(20);
	speedo.setCurrentSpeed(30);
	speedo.setCurrentSpeed(35);
}
public static void visitorPattern() {
	WheelInterface wheel = new WideWheel(24);
	wheel.acceptVisitor(new WheelDiagnostics());
	wheel.acceptVisitor(new WheelInventory());
}










public static void adapterPatterns() {
	List<WheelInterface>wheels = new ArrayList<WheelInterface>();
	UltraWheel ultrawheel = new UltraWheel(28);
	wheels.add(new NarrowWheel(24));
	wheels.add(new NarrowWheel(20));
	wheels.add(new NarrowWheel(24));
	wheels.add(new UltraWheelAdapter(ultrawheel));
	for (WheelInterface wheel : wheels) {
	System.out.println(wheel);
	}
	public static void observerPatterns() {
		//create the speed Monitor
		SpeedMonitor monitor = new SpeedMonitor();
		Speedometer speedo = new Speedometer();
		speedo.addObserver(monitor);
		speedo.addObserver(new GearBox());
		
		
		speedo.setCurrentSpeed(5);
		speedo.setCurrentSpeed(10);
		speedo.setCurrentSpeed(20);
		speedo.setCurrentSpeed(30);
		speedo.setCurrentSpeed(35);
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	public static void myInterfaceExample1() {
		House myHouse = new House1();
		Condo myCondo = new Condo();	
	}
	public static void decoratorPatterns() {
		BikeInterface myTourBike = new TouringBike(new NarrowWheel(24));
		System.out.println(myTourBike);
		
		myTourBike = new GoldFrameBike(myTourBike);
		System.out.println(myTourBike);
		myTourBike = new CustomGrips(myTourBike);
		System.out.println(myTourBike);
	}
	public static void myInterfaceExample() {
		House myHouse = new House();
		House mySummerHouse = new House("storm windows");
		House myLogHouse = new House("wooden windows","wooden door");
		System.out.println(mySummerHouse.getwindows());
		System.out.println(myLogHouse.getwindows()+"" + myLogHouse.getDoors());
		//Condo myCondo = new Condo();
		myHouse.decorate();
		myHouse.installPlumbing();
		//myCondo.decorate();
		myHouse.supplementWork();
		
	}
	public static void iteratorPattern() {
		System.out.println(" = = = ");
		RoadBikeRange bikeRange = new RoadBikeRange();
		printiterator(bikeRange.iterator());
		System.out.println(" = = = Our MOuntian Bikes = = =  ");
		MountainBikeRange mountainBikeRange.iterator();
	}
	public static void printiterator(iterator iter) {
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	public static void iteratorPatternV2() {
		system.out.println(" = = = Our Road Bikes = = =");
		RoadBikeRange bikeRange = new RoadBikeRange();
		for (BikeInterface bikes : bikeRange.getRange()) {
			System.out.println(bikes);
		}
	System.out.println(" = = = Our Mountain Bike = = =");
	mountainBikeRange.mountainBikeRange = new MountianBikeRange();
	for (BikeInterface bikes : mountainBikeRange.getRange()) {
		System.out.println(bikes);
	}
	}
	
	
	
	
	
	
	
	
	
	public static void myConstructorPlusExample() {
		GrannySmiths gs = new GrannySmiths();
		gs.decide();
		Trex tr = new Trex("Sharp","Smooth");
		System.out.println("The TRex has " +tr.getskin()+ " skin and "+tr.getteeth()+"teeth");
	}
	public static void enumSample11() {
		icecream ic = icecream.Strawberry;
		System.out.println(ic);
		HolidayDinner hd = new HolidayDinner();
		hd.letsEat();
		hd.letsChoose(Dinner.Turkey);
		hd.letsChoose(Dinner.Ham);
		hd.letsChoose(Dinner.PumpkinPie);
		
		Dinner d1 = Dinner MashedPotatoes;
		System.out.println(d1);
		d1.readyNow();
		
	}
	public static void enumSample1() {
		icecream ic + iceCream.Strawberry;
		System.out.println(ic);
	}
	public void something() {
	} // can not run in a static method
	
	public static void sampleUtility() {
		System.out.println(Utility.addSomething(5, 23));
		Utility.somethingElse();
	}
	public static void myAsbstractExample() {
		// Can't created an instance of an Abstract class
		//Shape shape = new Shape // Not Valid 
		System.out.println(Shape.area(5, 10));
		Square sqaure = new Square();
		System.out.println(square.draw());
		Rectangle rec = new Rectangle();
		System.out.println(rec.draw));
		rec.setLength(10);
		rec.setWidth(5);
		System.out.println(Shape.area(rec.getLength(),rec.get width()));
		  MyOctagon();
	
	
	public static void overrideExample() {
		House myHouse =  new House();
		Condo myCondo = new Condo();
		House myOtherhouse = (House) new Condo(); //Implicit Cast
		Condo myOtherCondo = (Condo)new House();//Explicit Cast
		//myHouse.openDoor();
		//myCondo.openDoor();
		myOtherhouse.openDoor();
		}
	public static void overloadExample() {
		Apple myApple = new Apple();
		myApple.display("Granny Smith", 5);
		myApple.display("Sour", 3, "Red");
		//String show = myApple.display("Granny Smiths","Green");
		System.out.println(myApple.display("Granny Smiths","Green"));
		System.out.println(Apple.SOUR_SCALE);
		System.out.println(myApple.SOUR_SCALE);
		System.out.println(Apple.SWEET_SCALE);
		Apple.SWEET_SCALE = 25;
	}
	public static void inheritanceExample() {
		House house = new House();
		Condo condo = new Condo();
		condo.setDoors("Red Door");
		System.out.println(((House1) condo).getDoors());
		house.setDoors("Purple Door");
		System.out.println(house.getDoors());
	}
	
	public static void inheritanceExample1() {
		House house = new House();
		Condo condo = new Condo();
	}

	public static void mySongExample() {
		SongExample se = new SongExample();
		String beer = se.bottlesofBeer();
		System.out.println(beer);
	}

	public static void myDecisionExample() {
		DecisionExample de = new DecisionExample();
		de.basicIfStatement();
		de.chainIfStatement();
		de.switchExample(5);
	}
	public static void Quiz1() {
		Quiz2 myQuiz = new Quiz2();
		//myQuiz.divisibleByThree();
		//myQuiz.grade("g");
        //myQuiz.grade("b");
	}
	public static void myAssignmentExample() {
		AssignmentExamples ae = new AssignmentExamples();
		ae.plusEqualsExample();
		ae.minusEqualsExample();
		ae.multiplyEqualsExample();
		ae.divisionEqualsExample();
		ae.modulusEqualsExample();
		ae.leftShiftEqualsExample();
		ae.rightShiftEqualsExample();
		ae.bitwiseAndEqualsExample();
		ae.bitwiseOrEqualsExample();
	}

	public static void myOperatorExample() {
		OperatorExamples oe = new OperatorExamples();
		oe.incrementSample();
		oe.decrementSample();
		oe.equalsExample();
		oe.equalsExample2();
		oe.logicalExample();
	}

//	my first method 
	public static void someMethod() {

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
		pe.myMultiplication();
		pe.myDivison();
		pe.myModulus();
		pe.myOrderOp();
	}

//Example of the use of Scanner 
	public void scannerExample() {
		int x, y, z;
		System.out.println("Enter two integers to calculate their sum");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = x + y;
		System.out.println("Sum of entered integers = " + z);
		in.close();
	}

public static void myHouse() {
	House myHouse = new House();
	//myHouse.doors = "(red Doors)";
	myHouse.setDoors("Red Doors");
	
	House mySecondHome = new House();
	//mySecondHome.doors = ("purple Doors);
	mySecondHome.setDoors("Purple Doors");
	
	House myThirdHome = myHouse;
	myHouse = mySecondHome;
	
	House houseArray = new House(myHouse,mySecondHome, myThirdHome);
	System.out.println(myHouse.doors);// 5 Red doors, 1 null. ? Purple Doors
	System.out.println(mySecondHome.doors);// Purple Doors
	System.out.println(myThirdHome.doors);// 4 Purple Doors, 1 Red Doors, 1 Null
	
	int i = 0;
			do {
				System.out.println(houseArray[i].getDoors());
				i++;
			}while(i < houseArray.length);
}

public static void mySongExample1() {
	
}

}

