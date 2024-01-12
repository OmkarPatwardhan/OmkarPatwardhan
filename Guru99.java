package com.test;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Guru99 {

	WebDriver dr;

	@Test
	public void f() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\seleniumdata\\\\chromedriver-win32\\\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();

		dr.get("https://demo.guru99.com/test/newtours/");
		String url = dr.getCurrentUrl();
		
		System.out.println("Url of the Current Page :" + url);

		dr.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();

		WebElement we = dr.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
		we.sendKeys("Omkar");

		WebElement w1 = dr.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));
		w1.sendKeys("Patwardhn");

		WebElement w2 = dr.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]"));
		w2.sendKeys("7841941761");

		WebElement w3 = dr.findElement(By.xpath("//input[@id='userName']"));
		w3.sendKeys("patwwardhan.omkar79@gmail.com");

		WebElement w4 = dr.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
		w4.sendKeys("Sangli");

		WebElement w5 = dr.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]"));
		w5.sendKeys("Sangli");

		WebElement w6 = dr.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]"));
		w6.sendKeys("Maharashtra");

		WebElement w7 = dr.findElement(By.xpath("//tbody/tr[10]/td[2]/input[1]"));
		w7.sendKeys("416416");

		WebElement w8 = dr.findElement(By.xpath("//input[@id='email']"));
		w8.sendKeys("Omee");
		String username = w8.getAttribute("value");
		System.out.println(username);

		WebElement w9 = dr.findElement(By.xpath("//tbody/tr[14]/td[2]/input[1]"));
		w9.sendKeys("Omee1234");

		WebElement w10 = dr.findElement(By.xpath("//tbody/tr[15]/td[2]/input[1]"));
		w10.sendKeys("Omee1234");
		String password = w10.getAttribute("value");
		System.out.println( password);

		Select country = new Select(dr.findElement(By.xpath("//tbody/tr[11]/td[2]/select[1]")));

		country.selectByVisibleText("INDIA");

		dr.findElement(By.xpath("//tbody/tr[17]/td[1]/input[1]")).click();

		dr.findElement(By.xpath("//a[contains(text(),'sign-in')]")).click();
		WebElement un = dr.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
		un.sendKeys(username);
		WebElement pwd = dr.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
		pwd.sendKeys(password);

		dr.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
