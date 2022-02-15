package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TakeCoursePage {

	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playbutton;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pausebutton;
	
	@FindBy(xpath="//span[text()='Share via Twitter']")
	private WebElement twitter;
	
	public TakeCoursePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void playbtn() {
		playbutton.click();
	}
	
	public void pausebtn() {
		pausebutton.click();
	}
	
	public void twitterbtn() {
		twitter.click();
	}
	
}
