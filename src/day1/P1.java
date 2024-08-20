package day1;
import org.openqa.selenium.edge.EdgeDriver;

public class P1 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.edge.driver",".Lib/msedgedriver.exe");
		EdgeDriver satish=new EdgeDriver();
		satish.get("http://www.google.com");
		satish.close();
		System.setProperty(null, null)

	}

}
