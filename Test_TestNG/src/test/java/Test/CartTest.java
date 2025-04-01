package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page.CartPage;
import Page.HomePage;
import Page.LogInPage;
import Page.ShopPage;
public class CartTest extends BaseTest{
	 @Test(dependsOnMethods="LogInTests")
	  public void CartTestt(){
		  LogInPage lp=new LogInPage(getDriver());
		  lp.LogIn("standard_user","secret_sauce");
		  HomePage hp=new HomePage(getDriver());
		  hp.clickk();
		  hp.cartPage();
		  CartPage cp=new CartPage(getDriver());
		  String ac="Sauce Labs Backpack";
		  String ex=cp.itemText();
		  Assert.assertEquals(ex,ac);
		  cp.remove();
		  cp.continuee();
		  hp.clickk();
		  hp.cartPage();
		 cp.checkOut();
		  ShopPage sp=new ShopPage(getDriver());
		  sp.shop();
		  String aMsg=sp.success();
		  String eMsg="Thank you for your order!";
		  Assert.assertEquals(aMsg,eMsg);
	  }
}
