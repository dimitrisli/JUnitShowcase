package com.dimitrisli.junitshowcase.parameterizedTest;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



@RunWith(Parameterized.class)
public class ParameterizedTesting {

	@Parameters
	public static Collection<?> data(){
		return Arrays.asList(new Object[][]{
				{2,3,6},
				{3,4,12},
				{4,5,20},
				{5,6,30},
				{6,7,42}
		});
	}
	
	private int a;
	private int b;
	private int result;
	
	public ParameterizedTesting(int a, int b, int result){
		this.a = a;
		this.b = b;
		this.result = result;
	}
	
	@Test
	public void multiplicationCalculation(){
		int calcResult = a*b;
		System.out.println("a="+a+", b="+b+". Expected result= "+result+", and calculated result= "+calcResult);
		Assert.assertEquals(result, calcResult);
	}
	
}
