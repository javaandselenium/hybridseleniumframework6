package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CorejavaseleniumPage;
import pomPages.SkillraryLoginPage;
import pomPages.TakeCoursePage;

public class Testcase3 extends BaseClass{
	@Test
	public void tc3() throws IOException, InterruptedException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.serachtextbox(pdata.getPropertyFileldata("courseName"));
		s.serachbutton();
		
		CorejavaseleniumPage c=new CorejavaseleniumPage(driver);
		c.corejavaselenium();
		
		TakeCoursePage t=new TakeCoursePage(driver);
		driverutilies.switchframe(driver);
		t.playbtn();
		Thread.sleep(10000);
		t.pausebtn();
		
		driverutilies.switchbackframe(driver);
		Thread.sleep(5000);
		t.twitterbtn();
		
		driverutilies.switchingTabs(driver);
		
		Thread.sleep(10000);
		Assert.assertEquals(driver.getTitle(),pdata.getPropertyFileldata("twittertitle"));
		Reporter.log(driver.getTitle(),true);
	}

}
