package com.dimitrisli.junitshowcase.performanceTesting;

import org.junit.Test;

import junit.framework.Assert;

public class PerformanceTest {

	@Test(timeout=100)
	public void method(){
		Assert.assertTrue(true);
	}
}
