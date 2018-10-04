package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_Lider;
import wdMethods.ProjectMethods;

public class AddToCart extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Add to cart section";
		testDescription="Verify the add to cart section";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test
	public void addtocart()  {
		
		new HomePage_Lider()
		.departmenticon()
		.computacian()
		.notebook()
.clickingaproduct()
.addingtocart()
.clickcart()
.viewcart()
.cartmessage();
		
	}
}