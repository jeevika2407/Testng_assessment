package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
	public CartPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//div[text()=\"Sauce Labs Backpack\"]")
	public WebElement aItem;
	
	@FindBy(xpath="//button[@id=\"remove-sauce-labs-backpack\"]")
	public WebElement rItem;
	
	@FindBy(xpath="//button[@id=\"continue-shopping\"]")
	public WebElement cs;
	
	@FindBy(xpath="//button[@id=\"checkout\"]")
	public WebElement co;
	
	public String itemText() {
		return aItem.getText();
	}
	public void remove() {
		rItem.click();
	}
	public void continuee() {
		cs.click();
	}
	public void checkOut() {
		co.click();
	}
}
