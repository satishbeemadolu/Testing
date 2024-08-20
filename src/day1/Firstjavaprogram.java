package day1;

import org.openqa.selenium.edge.EdgeDriver;

public class Firstjavaprogram
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver","./Lib/msedgedriver.exe");
		EdgeDriver satish=new EdgeDriver();
		satish.get("http://www.instagram.com");
		Thread.sleep(5000);
		System.out.println(satish.getTitle());
		System.out.println(satish.getCurrentUrl());
		satish.close();
	}

}
