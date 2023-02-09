package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BestTest;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.UsersPage;

public class ActiTimeCreateUser extends BestTest {
	
	@Test 
	public void createValidUser() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		lp.actiTimeValidLogin(flib.readPropertydata(PROP_PATH, "Username"),flib.readPropertydata(PROP_PATH, "Password"));
		Thread.sleep(2000);
		HomePage hp = new HomePage(driver);
		Thread.sleep(2000);
		hp.clickOnUsers();
		UsersPage up = new UsersPage(driver);
		up.clickOnTab();
		up.validUsn(flib.readExcelData(EXCEL_PATH, "uservaliddata", 1, 0));
	}

}
