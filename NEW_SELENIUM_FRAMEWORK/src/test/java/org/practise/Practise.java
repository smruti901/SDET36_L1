package org.practise;

import org.testng.annotations.Test;

public class Practise 
{
	@Test
	public void test1()
	{
		System.out.println("Test1 Passed Safely");
		System.out.println("new Test1 Passed Safely");
		String browser = System.getProperty("BROWSER");
		String url = System.getProperty("URL");
		String username = System.getProperty("USERNAME");
		String password = System.getProperty("PASSWORD");
		
		System.out.println("browser--------->"+browser);
		System.out.println("url--------->"+url);
		System.out.println("username--------->"+username);
		System.out.println("password--------->"+password);
	}
	@Test
	public void test2()
	{
		System.out.println("Test2 Passed");
		
		
	}
	@Test
	public void test3()
	{
		System.out.println("Test3 Passed");
		System.out.println("Test30 Passed");
		System.out.println("Test3 Passed");
		
	}
	@Test
	public void test4()
	{
		System.out.println("Test5l Passed");
	}

}
