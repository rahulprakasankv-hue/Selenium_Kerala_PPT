package kp_test_pkg;

import org.testng.annotations.Test;

import basepkg.Kp_base;

public class Kp_logintest extends Kp_base {
	
	@Test
	public void loginverify() {
		kp.LoginMthd("luminartesterrahul@gmail.com" , "Luminartester2266");
	}
	
	@Test
	public void pptaddtest() {
		kp.pptaddMthd();
	}

}
