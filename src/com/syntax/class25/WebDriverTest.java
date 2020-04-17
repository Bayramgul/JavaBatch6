package com.syntax.class25;

public class WebDriverTest {

	public static void main(String[] args) {
			WebDriver chrome=new ChromeDriver();
			WebDriver firefox=new FirefoxDriver();
			WebDriver [] drivers= {chrome,firefox};
		for(WebDriver d: drivers) {
			d.closeBrowser();
			d.findElement();
			d.maximizeWindows();
			d.openBrowser();
			System.out.println("******");
		}
	}

}
