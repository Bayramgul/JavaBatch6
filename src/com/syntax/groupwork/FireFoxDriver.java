package com.syntax.groupwork;

public class FireFoxDriver implements RemoteWebDriver{
	@Override
	public String getTitle() {
		String getTitle="Firefox";
		return getTitle;
	}
	@Override
	public void open() {
		System.out.println("We can open browser in "+ this.getTitle());
	}
	@Override
	public void close() {
		
		System.out.println("We can close browser in "+ this.getTitle());		
	}
	@Override
	public void getScreenShot() {
		System.out.println(this.getTitle()+ " can take screenshot");
	}
	@Override
	public void navigate() {
		System.out.println(this.getTitle()+ " can navigate");
	}}
	
