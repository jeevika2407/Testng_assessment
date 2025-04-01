package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopPage extends BasePage{

	public ShopPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//input[@id=\"first-name\"]")
	public WebElement fn;
	
	@FindBy(xpath="//input[@id=\"last-name\"]")
	public WebElement ln;
	
	@FindBy(xpath="//input[@id=\"postal-code\"]")
	public WebElement pc;
	
	@FindBy(xpath="//input[@id=\"continue\"]")
	public WebElement con;
	
	@FindBy(xpath="//button[@id=\"finish\"]")
	public WebElement fin;
	
	@FindBy(xpath="//h2")
	public WebElement suc;
	
	public void shop() {
		fn.sendKeys("Gayathri");
		ln.sendKeys("R");
		pc.sendKeys("908765");
		con.click();
		fin.click();
	}
	public String success() {
		return suc.getText();
	}
}
