package com.nbit;//Starter class is inside com/nbit/ folder


import java.util.ArrayList;

import com.nbit.learn.ExceptionHandling;
import com.nbit.learn.Misc;

//import java.lang.*; - imported by default. We donot need to do this explicitly
//import com.nbit.learn.*;

import com.nbit.learn.algo.ArrayAlgo;
import com.nbit.learn.algo.Sort;
import com.nbit.learn.algo.Tree;
import com.nbit.learn.db.Database;
import com.nbit.learn.filetype.XMLParser;
import com.nbit.learn.mycollection.EnumEg;
import com.nbit.learn.mycollection.ListEg;
import com.nbit.learn.mycollection.MapEg;
import com.nbit.learn.mycollection.QueueEg;
import com.nbit.learn.mycollection.SetEg;
import com.nbit.learn.oops.OopsEg;
import com.nbit.learn.thread.MiscEg;
import com.nbit.learn.thread.Sync;
import com.nbit.learn.thread.ThreadEg;
import com.nbit.learn.tp.JedisEg;

public class Starter {
	//Java starts the program with this main method with String array argument/parameter.
	public static void main(String[] args) throws Exception {
		
		System.out.println(Integer.MAX_VALUE);
		int a = Integer.MAX_VALUE + 1;
		System.out.println(a);
		a += 1;
		System.out.println(a);
		
		System.out.println("Sta-");
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
		//ExceptionHandling.ownException();
		
		//Collections
		//ListEg.arrayListExample();
		//ListEg.arrayToArrayList();
		//ListEg.arraylistSortingEg();
		//ListEg.serializationEg();
		//ListEg.linkedListEg();
		//ListEg.vectorEg();
		//ListEg.stackEg();
		
		//QueueEg.priorityQueueEg();
		//QueueEg.arrayDequeEg();
		
		//SetEg.hashsetEg();
		//SetEg.collectionToSet();
		//SetEg.linkedHSEg();
		//SetEg.linkedHSEg();
		//SetEg.treeSetEg();
		//SetEg.treeSetObjEg();
		
		//MapEg.mapEg();
		//MapEg.linkedHashMapEg();
		//MapEg.treeMapEg();
		//MapEg.hashTableEg();
		//MapEg.propertiesEg();
		
		//EnumEg.enumEg();
		//EnumEg.enumSet();
		//EnumEg.enumMap();
		
		//Multithreading
		//ThreadEg.sleep();
		//ThreadEg.twoThread();
		//ThreadEg.threadPool();
		//ThreadEg.threadGroup();
		//ThreadEg.syncMethodEg();
		//ThreadEg.deadLockEg();
		//ThreadEg.interThreadComm();
		//ThreadEg.interruptThread();
		
		//MiscEg.garbageCollectorEg();
		//MiscEg.shutdownEg();
		
		//XMLParser.xmlParse();
		
		//JDBC
		//Database.db();
		
		//Redis
		//JedisEg.jedisEg();
		//JedisEg.pubSub();
		//JedisEg.jedisPool();
		//JedisEg.redisCluster();
		//JedisEg.pipeline();
		
		//Algorithms
		//ArrayAlgo.greatestNumInArray();
		//Sort.selectionSortEg();
		//Tree.treeTraverse();
		
		main();
	}
    public static int reverse(int x) {
        int r = 0;
        int n = 1;
        int z = x;
        while(z !=0) {
            z = z/10;
            n = n * 10;
        }
        while(x != 0) {
            n = n / 10;
            int y = x % 10;
            r = r + y*n;
            x = x / 10;
        }
        return r;
    }
	
	public static void main() {//Main method overloaded with param count
		System.out.println(reverse(4356 + 1));
		
		System.out.println("End");
	}
	
	public static void main(String val) {//Main method overloaded with param type
		System.out.println(val);
	}
}
