package test.com.bank;

import app.App;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for App.
 */
public class AppTest  extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	private String userName;
	
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        System.out.println("Suite returns Test for AppTest suite..");
    	return new TestSuite(AppTest.class );
    }

     //test1
    public void testApp()
    {
        System.out.println("\nRunning the AppTest simple...\n");
        assertTrue( true );
    }
    //test2
    public void testNewCode()
    {
    	System.out.println("Test new code here");
    	//fail("The test is failing itself..");
    }

    //test3
public void testApp2()
    {
        System.out.println("\nRunning the TestApp2...\n");
        App obj = new App();
        String data = obj.runMe("Hhe");
        assertEquals("App data",  data);
         
    }
}
