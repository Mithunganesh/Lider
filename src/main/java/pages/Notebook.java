package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Notebook extends ProjectMethods{
	
	public Notebook() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//*[contains(@title,'Notebook 15.6 / Intel Core i7 / 8 GB / 1 TB / T. Video 2 GB')]")
	private WebElement clickaproduct;
	
	public Productdetails clickingaproduct()
	{
		highLighterMethod(driver, clickaproduct);
		click(clickaproduct);
		return new Productdetails();
	}

}
