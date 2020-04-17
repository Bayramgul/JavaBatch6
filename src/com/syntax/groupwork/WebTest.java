package com.syntax.groupwork;

public class WebTest {

	public static void main(String[] args) {
		RemoteWebDriver	 chrome = new ChromeDriver();
		RemoteWebDriver safari = new Safari();
		RemoteWebDriver firefox = new FireFoxDriver();
		RemoteWebDriver [] drivers= {chrome,safari,firefox};
		for(RemoteWebDriver d:drivers) {
			d.close();
			d.open();
			d.navigate();
			d.getScreenShot();
			System.out.println("***********");
		}
	}

}
