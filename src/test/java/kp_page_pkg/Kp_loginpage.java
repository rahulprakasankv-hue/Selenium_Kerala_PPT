package kp_page_pkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Kp_loginpage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"ulogin\"]") WebElement username;
	@FindBy(xpath="//*[@id=\"upass\"]") WebElement password;
	@FindBy(xpath="//*[@id=\"sub_logbtn\"]") WebElement logbtn;
	@FindBy(xpath="/html/body/div[3]/div/div/div[1]/div/ul/li[3]/a") WebElement addppt;
	
	public Kp_loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void LoginMthd(String uname,String upass) {
		username.sendKeys(uname);
		password.sendKeys(upass);
		logbtn.click();
	}
	
	public void pptaddMthd() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("myhome"));
		addppt.click();
	}

}
