package genericPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WorkLib extends BestTest{
	
	public void handleFrameByIndex(int index)
	{
		driver.switchTo().frame(index);
	}
	
	public void handleFrameByFrameElement(WebElement frameEelement)
	{
		driver.switchTo().frame(frameEelement);
	}
	
	
	public void handleFrameByNameOrId(String name)
	{
		driver.switchTo().frame(name);
	}
	
	public void rightClick(WebElement target)
	{
		Actions act = new Actions(driver);
		act.contextClick().perform();
	}

}
