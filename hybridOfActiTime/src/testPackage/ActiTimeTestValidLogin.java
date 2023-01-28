package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BestTest;
import genericPackage.CustomListner;
import genericPackage.Flib;
import pagePackage.LoginPage;

public class ActiTimeTestValidLogin extends BestTest {
	
		@Test
		public void validTest() throws IOException, InterruptedException
		{
			Flib flib = new Flib();
			LoginPage lp = new LoginPage(driver);
			lp.actiTimeValidLogin(flib.readPropertydata(PROP_PATH,"Username"),flib.readPropertydata(PROP_PATH, "Password"));
			
		}
	}


