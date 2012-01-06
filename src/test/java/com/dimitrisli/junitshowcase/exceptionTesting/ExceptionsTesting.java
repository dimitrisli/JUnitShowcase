package com.dimitrisli.junitshowcase.exceptionTesting;

import org.junit.Test;

public class ExceptionsTesting {

	@Test(expected = NullPointerException.class)
	public void method(){
		throw new NullPointerException();
	}

	@Test(expected = IllegalArgumentException.class)
	public void method2(){
		throw new IllegalArgumentException();
	}
}
