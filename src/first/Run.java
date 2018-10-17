package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Run {

	public static void main(String[] args) {
		System.out.println("Hellooooooo");
		WebDriver dr=new FirefoxDriver();
		dr.get("https://paytm.com/");
	}

}
