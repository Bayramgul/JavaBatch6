package com.syntax.class25;

public interface WebDriver {
	void openBrowser();
	void closeBrowser();
	void maximizeWindows();
	void findElement();
	//features below were added from JAVa 1.8 version
	static void takeSelfie() {
		
	}
	default void freeze() {
		System.out.println("webdriver may freeze");
	}
}
class ChromeDriver implements  WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Chrome driver opens bowser so fast");
	}

	@Override
	public void closeBrowser() {
		System.out.println("Chrome driver closes browser so fast");
		
	}

	@Override
	public void maximizeWindows() {
		System.out.println("We can maximize windows in ChromeDriver");
	}

	@Override
	public void findElement() {
		System.out.println("YOu can easily find elements in ChromeDriver");
	}
	
}class FirefoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("FirefoxDriver opens bowser so fast");		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Chrome driver closes browser so fast");
	}

	@Override
	public void maximizeWindows () {
		System.out.println("We can maximize windows in FireFox Driver");		
	}

	@Override
	public void findElement() {
		System.out.println("You can easily find elements in FireFox driver");
		
	}
	
}