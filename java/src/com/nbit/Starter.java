package com.nbit;//Starter class is inside com/nbit/ folder


import com.nbit.learn.ExceptionHandling;
import com.nbit.learn.Misc;

//import java.lang.*; - imported by default. We donot need to do this explicitly
//import com.nbit.learn.*;

import com.nbit.learn.algo.ArrayAlgo;
import com.nbit.learn.oops.OopsEg;

public class Starter {
	//Java starts the program with this main method with String array argument/parameter.
	public static void main(String[] args) throws Exception {
		System.out.print("Sta-");
		main("rt");
		//com.nbit.learn.Hello.helloWorld();
		
		
		//Variables.varBoolean();
		//Variables.varInt();
		//Variables.varShort();
		//Variables.varByte();
		//Variables.varLong();
		//Variables.varFloatAndDouble();
		//Variables.varChar();
		
		//Operators.unary();
		//Operators.arithmetic();
		//Operators.unary2();
		//Operators.shift();
		//Operators.bitOperations();
		//Operators.conditional();
		//Operators.assignment();
		
		//ControlStatements.simpleIf();
		//ControlStatements.ifElse();
		//ControlStatements.ifElseIfElse();
		//ControlStatements.nestedIf();
		//ControlStatements.switchCase();
		
		//Looping.whileloop();
		//Looping.dowhile();
		//Looping.forloop();
		//Looping.breakAndContinue();
		
		//com.nbit.learn.Array.arrayIntExamples();
		//Array.stringArr1d();
		//Array.array2d();
		//Array.className();
		
		//StringEg.aboutString();
		//StringEg.methods1();
		
		//UserInput.stringInput();
		//UserInput.intInput();
		//UserInput.inputWithBR();
		
		//FileExample.readFile();
		//FileExample.readFileWithScanner();
		
		//OopsEg.oops();
		//OopsEg.polymorphism();
		//OopsEg.abstraction();
		//OopsEg.encapsulation();
		//OopsEg.misc();
		
		//Misc.misc();
		//ExceptionHandling.example();
		//ExceptionHandling.catchNullPtrEx();
		//ExceptionHandling.uncaughtException();
		//ExceptionHandling.multipleCatch();
		//ExceptionHandling.catchAnyError();
		//ExceptionHandling.catchSpecificError();
		//ExceptionHandling.checkedException();
		//ExceptionHandling.throwsExample();
		//ExceptionHandling.throwOurError();
		ExceptionHandling.ownException();
		
		
		//Algorithms
		//ArrayAlgo.greatestNumInArray();
		main();
	}
	
	public static void main() {//Main method overloaded with param count
		System.out.println("End");
	}
	
	public static void main(String val) {//Main method overloaded with param type
		System.out.println(val);
	}
}
