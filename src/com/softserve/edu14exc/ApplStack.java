package com.softserve.edu14exc;

import java.util.Arrays;

class MyException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public MyException(String message) {
		super(message);
	}
}

public class ApplStack {

	public static void method1() throws MyException {
		method2();
	}

	public static void method2() throws MyException {
		method3();
	}

	public static void method3() throws MyException {
		throw new MyException("Exception thrown in method3");
	}

	public static void main(String[] args) {
		 //method1();
		try {
			method1();
		} catch (Exception e) {
			// System.err.println(e.getMessage() + "\n");
			System.out.println(e.getMessage() + "\n");
			e.printStackTrace();
			//
			String msg = "";
			for ( StackTraceElement current : e.getStackTrace()) {
				msg = msg + "\n\t at " + current.toString();
			}
			throw new RuntimeException(msg);
			//throw new RuntimeException(Arrays.toString(e.getStackTrace()));
		}

	}
}
