package com.dimitrisli.junitshowcase.hamcrest;

class Bean<T> {
	private T t;
	public void setT(T t){this.t = t;}
	public T getT(){return this.t;}
}