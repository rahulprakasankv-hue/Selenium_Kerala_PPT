package kp_page_pkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Kp_addpage {
	WebDriver driver;

	@FindBy(id = "proptype")
	WebElement pptfor;
	@FindBy(id = "listtype")
	WebElement pptplan;
	@FindBy(xpath = "//*[@id=\"proplabel\"]")
	WebElement pptlabel;
	@FindBy(xpath = "//*[@id=\"propcategory\"]")
	WebElement pptcategory;
	@FindBy(xpath = "//*[@id=\"propcost\"]")
	WebElement pptprice;
	@FindBy(xpath = "//*[@id=\"propbeds\"]")
	WebElement pptbed;
	@FindBy(xpath = "//*[@id=\"propbaths\"]")
	WebElement pptbath;
	@FindBy(xpath = "//*[@id=\"district\"]")
	WebElement pptdist;
	@FindBy(xpath = "//*[@id=\"proplocation\"]")
	WebElement pptloc;
	@FindBy(xpath = "//*[@id=\"propaddress\"]")
	WebElement pptaddress;
	@FindBy(xpath = "//*[@id=\"introlabel\"]")
	WebElement ppttitle;
	@FindBy(xpath = "//*[@id=\"frm_property\"]/div[9]/div/div/iframe")
	WebElement pptitag;
	@FindBy(xpath = "/html/body")
	WebElement pptsummary;

	public Kp_addpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void pptletterMthd(String plabel, String paddress, String ptitle) {
		pptlabel.sendKeys(plabel);
		pptaddress.sendKeys(paddress);
		ppttitle.sendKeys(ptitle);

	}

	public void pptnumberMthd(String pprice, String pbed, String pbath) {
		pptprice.sendKeys(pprice);
		pptbed.sendKeys(pbed);
		pptbath.sendKeys(pbath);
	}

	public void pptdropdownMthd() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(pptfor));

		Select forppt = new Select(pptfor);
		forppt.selectByVisibleText("Rental");

		Select planppt = new Select(pptplan);
		planppt.selectByValue("featured");

		Select catppt = new Select(pptcategory);
		catppt.selectByVisibleText("House");

		Select distppt = new Select(pptdist);
		distppt.selectByVisibleText("Ernakulam");
		
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));
		waits.until(ExpectedConditions.visibilityOf(pptloc));

		Select locppt = new Select(pptloc);
		locppt.selectByVisibleText("Angamaly");

	}

	public void pptiframeMthd(String psummary) {
		driver.switchTo().frame(pptitag);
		pptsummary.click();
		pptsummary.sendKeys(psummary);
		driver.switchTo().defaultContent();
	}

}
