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
		Configuration cfg = new ConfigXML();
		
		System.out.println(cfg.getZZZ());
		System.out.println("TestBranch");
	}

}
