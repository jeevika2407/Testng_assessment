package Test;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Page.HomePage;
import Page.LogInPage;
@Listeners(utils.Listeners.class)
public class LogInTest extends BaseTest{
  @Test(dataProvider="loginDetails",dataProviderClass=utils.DataProviders.class)
  public void LogInTests(String un,String pw,String sts){
	  LogInPage lp=new LogInPage(getDriver());
	  lp.LogIn(un, pw);
	  HomePage hp=new HomePage(getDriver());
	  if(sts.equalsIgnoreCase("testcase1")){
	  String ex="Swag Labs";
	  String act=hp.HomeText();
	  Assert.assertEquals(ex,act);
	  }
	  else if(sts.equalsIgnoreCase("testcase2") || sts.equalsIgnoreCase("testcase3")) {
		  String ex="Epic sadface: Username and password do not match any user in this service";
		  String act=lp.errorText();
		  Assert.assertEquals(ex,act);
	  }
	  else if(sts.equalsIgnoreCase("testcase3")) {
		  String ex="Epic sadface: Username and password do not match any user in this service";
		  String act=lp.errorText();
		  Assert.assertEquals(ex,act);
	  }
  }
  
 
}
