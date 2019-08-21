package test.com.bank;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Simple class to build a TestSuite out of the individual test classes.
 */
public class AllJUnitTest extends TestCase {

    public AllJUnitTest(String name) {
        super(name);
    }

    public static Test suite() {
    	System.out.println("AllJUnitTests.suite() running");
        TestSuite suite = new TestSuite(SkeletonTest.class);
        suite.addTest(new TestSuite(HelloWorldTest.class));  
        suite.addTest(new TestSuite(AppTest.class)); 
        return suite;
   }
}
