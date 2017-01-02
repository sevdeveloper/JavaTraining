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
		Configuration cfg = new ConfigDB();
		
		System.out.println(cfg.getZZZ());
	}

}
