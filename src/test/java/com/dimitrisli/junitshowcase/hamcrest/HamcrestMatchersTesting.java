package com.dimitrisli.junitshowcase.hamcrest;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hamcrest.Matchers;
import org.junit.Test;

public class HamcrestMatchersTesting {

	@Test
	public void assertThat1(){
		double d = 1.3;
		assertThat(d, is(1.3));
		assertThat(d, is(not(1.4)));
	}
	
	@Test
	public void assertThat2(){
		String str="test";
		assertThat(str, equalTo("test"));
		assertThat(str, not(equalTo("anotherTest")));
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void assertThat3(){
		String str="test";
		assertThat(str, anyOf(is("test"), is("this"), is("that")));
		assertThat(str, not(anyOf(is("tasty"), is("this"), is("that"))));
	}
	
	@SuppressWarnings("serial")
	@Test
	public void assertThatCollections1(){
		List<String> list = new ArrayList<String>(){{add("one");add("two");add("three");}};
		assertThat(list, hasItem("two"));
		assertThat(list, not(hasItem("ttwo")));
	}
	
	@SuppressWarnings("serial")
	@Test
	public void assertThatCollections2(){
		List<Integer> list = new ArrayList<Integer>(){{add(1);add(2);add(3);}};
		assertThat(list, not(hasItem(lessThan(0))));
	}
	
	@Test
	public void assertThatMaps1(){
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		assertThat(map, Matchers.<String,Integer>hasKey("one"));
		assertThat(map, Matchers.<String,Integer>hasValue(2));
	}
	
	@Test
	public void assertThatProperty1(){
		
		Bean<String> myBean = new Bean<String>();
		myBean.setT("hi");
		assertThat(myBean, hasProperty("t",is("hi")));
		assertThat(myBean, hasProperty("t",startsWith("h")));
	}
}
