package com.nbit.learn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.naming.NameNotFoundException;

import com.nbit.learn.oops.Bike;

class MyException extends Exception {
	private static final long serialVersionUID = 1L;
	String error;
	static int count = 0;

	public MyException(String exStr) {
		super(exStr + ". count = " + ++count);
		String err = exStr + ". count = " + count;
		this.error = err;
	}
	
	public int getCount() {
		return count;
	}
}

public class ExceptionHandling {
	// Runtime exception: IOException, ClassNotFoundException, SQLException,etc.
	public static void example() {
		// nullPtrEg();
		System.out.println("ExceptionHandling class fully finished");
	}

	public static void nullPtrEg() {
		int a = 5;
		Integer b = null;
		Integer c = a + b;// Null Pointer Exception - not handled.
		// So, no other code after this gets executed.
		System.out.println("Sum: " + c);
	}

	public static void catchNullPtrEx() {
		try {
			Bike a = null;
			System.out.println("Bike value:" + a.toString());
		} catch (NullPointerException ex) {
			System.out.println(ex);
			// ex.printStackTrace();
		}

		try {
			Bike b = new Bike();
			System.out.println("Bike value:" + b.toString());
		} catch (NullPointerException ex) {
			System.out.println(ex);
			// ex.printStackTrace();
		} finally {
			// Finally gets executed all the time even if exception occurs or not.
			System.out.println("Finally: ExceptionHandling.catchNullPtrEx() method finished");
		}

	}

	public static void uncaughtException() {
		System.out.println("0: Method start");
		try {
			Integer a = 10 / 0;// Arithmetic Error
			System.out.println("1: a value: " + a);
			System.out.println("1.1 after error line");
		} catch (NullPointerException ex) {
			System.out.println("2: Inside catch");
			System.out.println(ex);
		} finally {
			System.out.println("3: Inside finally");
		}
		System.out.println("4: All done in method");
	}

	public static void multipleCatch() {
		System.out.println("0: Method start");
		try {
			Integer a = 10 / 0;// Arithmetic Error
			System.out.println("1: a value: " + a);
			System.out.println("1.1 after error line");
		} catch (NullPointerException ex) {
			System.out.println("2: Inside NullPointerException catch");
			System.out.println(ex);
		} catch (ArithmeticException ex) {
			System.out.print("3: Inside ArithmeticException catch. ");
			System.out.println(ex);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.print("4: Inside ArrayIndexOutOfBoundsException catch. ");
			System.out.println(ex);
		} finally {
			System.out.println("5: Inside finally");
		}
		System.out.println("6: All done in method");
	}

	public static void catchAnyError() {
		System.out.println("0: Method start");
		try {
			Integer a = 5 / 0;// Arithmetic Error
			System.out.println("1: a value: " + a.toString());
			System.out.println("1.1 after error line");
		} catch (NullPointerException ex) {
			System.out.print("2: Inside NullPointerException catch. ");
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.print("3: Inside Common catch. ");
			System.out.println(ex);
		} finally {
			System.out.println("4: Inside finally");
		}
		System.out.println("5: All done in method");
	}

	public static void catchSpecificError() {
		System.out.println("0: Method start");
		Integer a;
		try {
			a = null;
			System.out.println("1: a value: " + a.toString());// Null Pointer Error
			System.out.println("1.1 after error line");
		} catch (NullPointerException ex) {
			System.out.print("2: Inside NullPointerException catch. ");
			System.out.println(ex);
			a = 10;
			System.out.println("3: a value: " + a.toString());
		} catch (Exception ex) {
			System.out.print("4: Inside Common catch. ");
			System.out.println(ex);
		} finally {
			System.out.println("5: Inside finally");
		}
		System.out.println("6: All done in method");
	}

	public static void throwsExample() throws IOException {
		ExceptionHandling.throwPropagate();
	}

	// throws IOException - propagating
	public static void throwPropagate() throws IOException {
		ExceptionHandling.fileAccess();
	}

	public static void checkedException() {
		try {
			ExceptionHandling.fileAccess();
		} catch (IOException ex) {
			System.out.println(ex);
		}
	}

	public static void fileAccess() throws IOException {
		File f = new File("/home/geeky/geekey/work/eclipse-workspace/learning/java/resources/file-tutorial.txt");

		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String temp = "";
		while ((temp = br.readLine()) != null) {
			System.out.println("File: " + temp);
		}
		br.close();
	}

	public static void throwOurError() {
		System.out.println("0: Method start");
		try {
			Exception e = new NameNotFoundException("For Example");
			throw e;// Throw keyword is used to throw an error by ourselves.
			// System.out.println("1 after error line");//ERROR - compile time - unreachable
			// statement
		} catch (NullPointerException ex) {
			System.out.print("2: Inside NullPointerException catch. ");
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.print("3: Inside Common catch. ");
			System.out.println(ex);
		} finally {
			System.out.println("4: Inside finally");
		}
		System.out.println("5: All done in method");

	}

	public static void ownException() {
		try {

			try {
				throw new MyException("This is my exception.");
			} catch (Exception ex) {
				System.out.println(ex);
			}

			MyException e =  new MyException("This is another my exception.");
			throw e;
		} catch (MyException x) {
			System.out.println(x);
			System.out.println(x.getMessage());
			System.out.println(x.getCount());
		}
	}
}
