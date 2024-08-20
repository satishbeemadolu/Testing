package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Second {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.edge.driver","./Lib/msedgedriver.exe");
		EdgeDriver satish=new EdgeDriver();
		satish.get("https://dev.gst-manager.pages.dev/");
		satish.manage().window().maximize();
    	WebElement Login =	satish.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div[1]/div/div/form/div[1]/div/input"));
		Login.sendKeys("ecounter@gmail.com");
		WebElement pwd =satish.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div[1]/div/div/form/div[2]/div/input"));
		pwd.sendKeys("Admin@123");
		WebElement Btn =satish.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div[1]/div/div/form/div[4]/button"));
		Btn.click();
		WebElement inve =satish.findElement(By.xpath("//*[@id=\"sidenav-collapse-main\"]/ul/li[2]/a"));
		inve.click();

		Thread.sleep(5000);


	}

}
