package failedtestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEx {
	
	@Test()
	public void Test1() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(false,true);
	}
	@Test
	public void Test2() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(false,true);
	}
	@Test
	public void Test3() throws InterruptedException
		{
			Thread.sleep(2000);
			Assert.assertEquals(true,true);
		}
	
	@Test
	public void Test4() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(false,true);
	}
	
	@Test
	public void Test5() throws InterruptedException
		{
			Thread.sleep(2000);
			Assert.assertEquals(true,true);
		}
	}

