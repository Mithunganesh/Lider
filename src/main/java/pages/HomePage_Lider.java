package pages;

import java.awt.AWTException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class HomePage_Lider extends ProjectMethods{
	
	public HomePage_Lider() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//*[contains(@href,'/electrohogar/info/NuestrosLocales')]")
	private WebElement localeslink;
	
	public HeaderlinkNavigation Locales()
	{
		highLighterMethod(driver, localeslink);
		click(localeslink);
		return new HeaderlinkNavigation();
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@alt,'Lider Logo')]")
	private WebElement homepagelogo;
	
	
	public HomePage_Lider verifyhomepage()
	{
		highLighterMethod(driver, homepagelogo);
		verifyDisplayed(homepagelogo);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'compra-anterior')]")
	private WebElement comprasanterioreslink;
	
	public HeaderlinkNavigation comprasanteriores()
	{
		highLighterMethod(driver, comprasanterioreslink);
		click(comprasanterioreslink);
		return new HeaderlinkNavigation();
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'seguimiento-compra')]")
	private WebElement seguimientodecompraslink;
	
	public HeaderlinkNavigation seguimientodecompras()
	{
		highLighterMethod(driver, seguimientodecompraslink);
		click(seguimientodecompraslink);
		return new HeaderlinkNavigation();
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'click-retira')]")
	private WebElement pickuplink;
	
	public HeaderlinkNavigation pickup()
	{
		highLighterMethod(driver, pickuplink);
		click(pickuplink);
		return new HeaderlinkNavigation();
	}

}