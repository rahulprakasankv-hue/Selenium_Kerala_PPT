package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import kp_page_pkg.Kp_addpage;
import kp_page_pkg.Kp_loginpage;

public class Kp_base {
	public static WebDriver driver;
	
	public Kp_loginpage kp;
	public Kp_addpage kpadd;
	
	@BeforeTest
	public void opensetup() {
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void objMthd() {
		kp = new Kp_loginpage(driver);
		kpadd = new Kp_addpage(driver);
	}

}
