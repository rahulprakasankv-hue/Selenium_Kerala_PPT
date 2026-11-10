package kp_test_pkg;

import org.testng.annotations.Test;

import basepkg.Kp_base;

public class Kp_addtest extends Kp_base{
	
	
	
	@Test(priority = 2)
	public void pptlettertest() {
		kpadd.pptletterMthd("Home Stay", "Thabore P.O", "House Sale");
	}
	
	@Test(priority = 3)
	public void pptnumbertest() {
		kpadd.pptnumberMthd("4,00,000", "4", "5");
	}
	
	@Test(priority = 1)
	public void pptdropdowntest() {
		kpadd.pptdropdownMthd();
	}
	
	@Test(priority = 4)
	public void ppytiframetest() {
		kpadd.pptiframeMthd("The house near to the thabore church and also have the best view from the balcony of mountains");
	}

}
