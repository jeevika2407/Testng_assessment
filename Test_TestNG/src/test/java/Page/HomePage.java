package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
public class HomePage extends BasePage{
	public HomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//div[@class=\"app_logo\"]")
	public WebElement txt;
	
	@FindBy(xpath="//button[@id=\"add-to-cart-sauce-labs-backpack\"]")
	public WebElement cart;
	
	@FindBy(xpath="//a[@class=\"shopping_cart_link\"]")
	public WebElement cartLink;
	
	@FindBy(xpath="//button[@id=\"remove\"]")
	public WebElement removeLink;
	
	public String HomeText() {
		return txt.getText();
	}
	public void clickk() {
		cart.click();
	}
	public void cartPage() {
		cartLink.click();
	}
	public void removeLinkk() {
		removeLink.click();
	}
}
