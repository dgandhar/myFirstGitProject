/**
 * 
 */
package com.AssertionStudy;

/**
 * @author USER
 *
 */
public class AssertionExample implements Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//assertionInIf(3);
		
		assertionInSwitch("test");
	}
	
	private static void assertionInIf(int i) {
		try {
			/*if(i%3 == 0) {
				System.out.println("0");
			} else */if(i%3 == 1) {
				System.out.println("1");
			} else {
				assert i%3 == 2:i;
				System.out.println("2");
			}
		} catch(AssertionError e) {
			System.out.println("exception:: "+e);
			e.printStackTrace();
		}
	}
	
	private static void assertionInSwitch(String test) {
		switch(test) {
			case test1 : System.out.println("1");
				break;
			case test2 : System.out.println("2");
				break;
			case test3 : System.out.println("3");
				break;
			case test4 : System.out.println("4");
				break;
				default : throw new AssertionError(test);
		}
	}
}