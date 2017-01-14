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
		Observable<String> values = Observable.just("one", "two", "three");
		Subscription subscription = values.subscribe(
		    z -> System.out.println("Received: " + z),
		    e -> System.out.println("Error: " + e),
		    () -> System.out.println("Completed")
		);  
	}

}
