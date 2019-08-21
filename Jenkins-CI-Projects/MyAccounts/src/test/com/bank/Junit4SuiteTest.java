package test.com.bank;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.Test;
import junit.framework.TestSuite;

@RunWith(Suite.class) 

/*@SuiteClasses({test.com.bank.AllJUnitTests.class,test.com.bank.AccountTest.class,test.com.bank.HelloWorldTest.class,
	test.com.bank.SkeletonTest.class,test.com.bank.AppTest4.class,test.com.bank.TestManager.class}) 
*/

@SuiteClasses({test.com.bank.AccountTest.class,App1Test.class,ManagerTest.class}) 

public class Junit4SuiteTest {

	/*public static Test suite() {
		System.out.println("Junit4TestSuite running the test now.");
		TestSuite suite = new TestSuite();
		//$JUnit-BEGIN$

		//$JUnit-END$
		return suite;
	}
*/
}
