package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoApp {
	
	@FindBy(id="course")
	private WebElement cousetab;
	
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	
   public WebElement getCoursedd() {
		return coursedd;
	}

@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	public SkillraryDemoApp(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getCousetab() {
		return cousetab;
	}
	
	public void seleniumtrainingtab() {
		seleniumtraining.click();
	}
	

}
