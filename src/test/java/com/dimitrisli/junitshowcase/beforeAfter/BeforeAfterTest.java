package com.dimitrisli.junitshowcase.beforeAfter;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class BeforeAfterTest {

	@BeforeClass
	public static void initialiseClass(){
		System.out.println("init class");
	}
	
	@Before
	public void initialiseTest(){
		System.out.println("init test");
	}
	
	@Test
	public void test1(){
		System.out.println("inside test1");
		Assert.assertTrue(true);
	}

	@Test
	public void test2(){
		System.out.println("inside test2");
		Assert.assertTrue(true);
	}
	
	@After
	public void teardownTest(){
		System.out.println("teardown test");
	}
	
	@AfterClass
	public static void teardownClass(){
		System.out.println("teardown class");
	}
}
