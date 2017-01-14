/**
 * 
 */
package local.test;

import local.test.config.*;

/**
 * @author AUser
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Op!");
		configTest();
	}
	
	private static void configTest() {
		Configuration cfg = new ConfigXML();
		
		System.out.println(cfg.getZZZ()+"t2!");
		System.out.println("Branch3");
	}

}
