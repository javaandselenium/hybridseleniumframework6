package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	
	@FindBy(xpath="(//a[text()='munit testing '])[2]")
	private WebElement munit;
	
	@FindBy(id="cartArea")
	private WebElement areacart;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement fb;
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getMunit() {
		return munit;
	}

	public WebElement getAreacart() {
		return areacart;
	}
	
	public void facebookicon() {
		fb.click();
	}

	public WebElement getFb() {
		return fb;
	}
	

}
