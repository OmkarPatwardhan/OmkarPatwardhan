package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TaskTabHandler {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Data\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.setBrowserVersion("120");
		WebDriver d = new ChromeDriver(co);
		d.get("https://demo.guru99.com/v4/");
		String str=d.getWindowHandle();
        d.switchTo().newWindow(WindowType.TAB);
        d.get("https://demo.automationtesting.in/Alerts.html");
        Thread.sleep(3000);
        String str1=d.getWindowHandle();
        d.switchTo().newWindow(WindowType.TAB);
        d.get("https://www.google.co.in/");
        String str2=d.getWindowHandle();
        Thread.sleep(3000);
        d.switchTo().window(str);
        Thread.sleep(3000);
        d.switchTo().window(str1);
        Thread.sleep(3000);
        d.switchTo().window(str2);
        Thread.sleep(3000);
        d.switchTo().window(str);
        Thread.sleep(3000);
        d.close();
        Thread.sleep(3000);
        d.quit();



    

	}

}
