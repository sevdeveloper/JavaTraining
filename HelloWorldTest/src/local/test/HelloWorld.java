/**
 * 
 */
package local.test;


import java.util.TreeSet;

import local.test.config.*;

/**
 * @author AUser
 * Uses the specified {@link AbstractConfiguration} object  
 */
public class HelloWorld {
	
	private static final double EPSILON = 0.00001;
	protected int xxx;
    protected boolean yyy = true;
    protected String zzz;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Op!");
		treeTest();
	}
	
	@SuppressWarnings("unused")
	private static void configTest() {
		Configuration cfg = new ConfigXML();
		
		System.out.println(cfg.getZZZ()+"t2!");
		System.out.println("Branch3");
	}
	
	private static void treeTest() {
		TreeSet<String> tm = new TreeSet<String>();
		tm.add("Первая");
		tm.add("Вторая");
		tm.add("Третья");
		tm.add("Четвёртая");
		for (String string : tm) {
			System.out.println(string);
		}
		System.out.println("TreeTest");
	}

}
