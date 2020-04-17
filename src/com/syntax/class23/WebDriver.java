package com.syntax.class23;

public class WebDriver {
	public void open() {
		System.out.println("Opening browser");
	}
}
class FirefoxDriver extends WebDriver{
	public void open() {
		System.out.println("Opening firefox browser");
	}
}
class ChromeDriver extends WebDriver{
	public void open() {
		System.out.println("Opening Chrome browser");
	}
}
class InternetExplorer extends WebDriver{
	public void open() {
		System.out.println("Opening internet explorer browser");
	}
}