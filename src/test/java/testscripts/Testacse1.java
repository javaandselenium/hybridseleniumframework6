package testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryLoginPage;

public class Testacse1  extends BaseClass{
	@Test
	public void tc1() {
		
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gerasButton();
		s.skillrraydemoapp();
		
		SkillraryDemoApp d=new SkillraryDemoApp(driver);
		 driverutilies.switchingTabs(driver);
		 driverutilies.mouseHover(driver,d.getCousetab());
		 d.seleniumtrainingtab();
		 
		 AddtocartPage ad=new AddtocartPage(driver);
		 driverutilies.doubleClick(driver,ad.getAdd());
		 ad.addtocartbutton();
		 driverutilies.alertPopup(driver);
		 Reporter.log(driver.getTitle(),true);
	}

}
