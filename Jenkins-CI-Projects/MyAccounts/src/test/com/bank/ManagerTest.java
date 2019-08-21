package test.com.bank;

import junit.framework.Assert;

import org.junit.Test;

import com.bank.Manager;

public class ManagerTest {

	@Test
	public void testManagerAccount()
	{
		System.out.println("TestManager.testManagerAccount here");
		Manager obj = new Manager();
		int amount = obj.getSalary();
		Assert.assertEquals(1000, amount);
		
	}

     public void test()
{
}
}
