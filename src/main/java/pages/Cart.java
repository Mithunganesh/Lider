package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Cart extends ProjectMethods{
	
	public Cart() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'icon-new icon-cart')]")
	private WebElement cartpage;
	
	public Cart clickcart()
	{
		
		
		click(cartpage);
		return this;
	}
	
	
	

	@FindBy(how=How.XPATH,using="//*[contains(@id,'cartgotocartbutton')]")
	private WebElement viewCartbutton;
	
	public Cartdetails viewcart()
	{
		
		highLighterMethod(driver, viewCartbutton);
		click(viewCartbutton);
		return new Cartdetails();
	}
	

}
