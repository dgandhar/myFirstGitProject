/**
 * 
 */
package com.testConsoleInput;

import java.util.Scanner;

/**
 * @author GANDHAR
 *
 */
public class ConsoleInputTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Please Enter your name: ");
		
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		
		System.out.println("Hi "+name+"!!!");
	}

}
