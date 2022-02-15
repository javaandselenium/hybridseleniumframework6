package testscripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class Testacse2 extends BaseClass{

	@Test
	public void tc2() throws IOException {
SkillraryLoginPage s=new SkillraryLoginPage(driver);
s.gerasButton();
s.skillrraydemoapp();

SkillraryDemoApp d=new SkillraryDemoApp(driver);
driverutilies.switchingTabs(driver);
driverutilies.dropDown(d.getCoursedd(),pdata.getPropertyFileldata("coursedd"));

TestingPage t=new TestingPage(driver);
driverutilies.dragdrop(driver,t.getMunit(),t.getAreacart());

WebElement facebook = t.getFb();
Point loc = facebook.getLocation();
int x = loc.getX();
int y = loc.getY();
driverutilies.scrollBar(driver, x, y);
t.facebookicon();

Assert.assertEquals(driver.getTitle(),pdata.getPropertyFileldata("fbtitle"));

Reporter.log(driver.getTitle(),true);













	}
	
}
