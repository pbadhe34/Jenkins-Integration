 
package test.com.bank;

import junit.framework.TestCase;
import junit.framework.AssertionFailedError;

/**
 * JUnit 3.2 testcases. Just a Skeleton test
 */
public class SkeletonTest extends TestCase {

    public SkeletonTest(String name) {
        super(name);
    }

    protected void setUp() {
    }

    protected void tearDown() {
    }

    public static void main(String args[]) {
         junit.textui.TestRunner.run(SkeletonTest.class);
    }

    public void testAssert() {
    	System.out.println("The skeleton test Assert here");
    	assert(true);
    }
}
