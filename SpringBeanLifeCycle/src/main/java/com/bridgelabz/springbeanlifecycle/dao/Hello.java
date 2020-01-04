package com.bridgelabz.springbeanlifecycle.dao;

public class Hello {
	// @PostConstruct
	public void init()
	{
		System.out.println("Inside Hello init method");
	}
	// @PreDestroy
	public void destroy()
	{
		System.out.println("Inside hello destroy method");
	}

	public void display()
	{
		System.out.println("Hello Class");
	}
}
/*  Other way of Configuring lifecycle by implementing interface
public class Hello implements InitializingBean,DisposableBean{

	public void destroy() throws Exception {
	System.out.println("Inside init method of InitializingBean");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside init method of DisposableBean");
	}
	
}*/
