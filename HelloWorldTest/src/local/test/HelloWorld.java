/**
 * 
 */
package local.test;

import local.test.config.*;
import rx.Observable;
import rx.Subscription;

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
		rxLibTest();
	}
	
	@SuppressWarnings("unused")
	private static void configTest() {
		Configuration cfg = new ConfigXML();
		
		System.out.println(cfg.getZZZ()+"t2!");
		System.out.println("Branch3");
	}
	
	private static void rxLibTest() {
		Observable<Integer> values = Observable.range(10, 15);
		Subscription subscription = values.subscribe(
		    v -> System.out.println("Received: " + v),
		    e -> System.out.println("Error: " + e),
		    () -> System.out.println("Completed")
		);
	}

}
