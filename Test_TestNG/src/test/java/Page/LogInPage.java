package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
public class LogInPage extends BasePage{
  public LogInPage(WebDriver driver) {
	  super(driver);
  }
  @FindBy(xpath="//input[@id=\"user-name\"]")
  public WebElement un;
  
  @FindBy(xpath="//input[@id=\"password\"]")
  public WebElement pw;
  
  @FindBy(xpath="//input[@id=\"login-button\"]")
  public WebElement btn;
  
  @FindBy(xpath="//h3")
  public WebElement error;
  public void LogIn(String username,String password) {
	  un.sendKeys(username);
	  pw.sendKeys(password);
	  btn.click();
  }
  public String errorText() {
	  return error.getText();
  }
}
