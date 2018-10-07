package pages;

import java.awt.AWTException;

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


	private WebElement InformaciónÚtil;
	
	
	public HomePage_Lider footerlinksize()
	{
		scrollBottom();
		footerlink();
		return this;
	}
	
	
	
	

	@FindBy(how=How.XPATH,using="//*[contains(@class,'icon-new icon-menu')]")
	private WebElement departmentslink;
	
	
	public HomePage_Lider departmenticon()
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mouseHover(departmentslink);
		highLighterMethod(driver, departmentslink);
		verifyDisplayed(departmentslink);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@data-target,'#catSubMenu0')]")
	private WebElement electronicalink;
	
	
	public HomePage_Lider electronica()
	{
		mouseHover(electronicalink);
		highLighterMethod(driver, electronicalink);
		verifyDisplayed(electronicalink);
		return this;
	}
	
	
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@data-target,'#catSubMenu1')]")
	private WebElement computacianlink;
	
	
	public HomePage_Lider computacian()
	{
		mouseHover(computacianlink);
		highLighterMethod(driver, computacianlink);
		verifyDisplayed(computacianlink);
		return this;
	}
	
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@data-target,'#catSubMenu2')]")
	private WebElement TelefoníayFotografíalink;
	
	
	public HomePage_Lider TelefoníayFotografía()
	{
		mouseHover(TelefoníayFotografíalink);
		highLighterMethod(driver, TelefoníayFotografíalink);
		verifyDisplayed(TelefoníayFotografíalink);
		return this;
	}
	
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@data-target,'#catSubMenu3')]")
	private WebElement Electrohogarlink;
	
	
	public HomePage_Lider Electrohogar()
	{
		mouseHover(Electrohogarlink);
		highLighterMethod(driver, Electrohogarlink);
		verifyDisplayed(Electrohogarlink);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@data-target,'#catSubMenu4')]")
	private WebElement Hogarlink;
	
	
	public HomePage_Lider Hogar()
	{
		mouseHover(Hogarlink);
		highLighterMethod(driver, Hogarlink);
		verifyDisplayed(Hogarlink);
		return this;
	}
	
	
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@data-target,'#catSubMenu5')]")
	private WebElement Muebleslink;
	
	
	public HomePage_Lider Muebles()
	{
		mouseHover(Muebleslink);
		highLighterMethod(driver, Muebleslink);
		verifyDisplayed(Muebleslink);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@data-target,'#catSubMenu6')]")
	private WebElement Dormitoriolink;
	
	
	public HomePage_Lider Dormitorio()
	{
		mouseHover(Dormitoriolink);
		highLighterMethod(driver, Dormitoriolink);
		verifyDisplayed(Dormitoriolink);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@data-target,'#catSubMenu7')]")
	private WebElement Deporteslink;
	
	
	public HomePage_Lider Deportes()
	{
		mouseHover(Deporteslink);
		highLighterMethod(driver, Deporteslink);
		verifyDisplayed(Deporteslink);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@data-target,'#catSubMenu8')]")
	private WebElement AireLibrelink;
	
	
	public HomePage_Lider AireLibre()
	{
		mouseHover(AireLibrelink);
		highLighterMethod(driver, AireLibrelink);
		verifyDisplayed(AireLibrelink);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@data-target,'#catSubMenu9')]")
	private WebElement MundoBebélink;
	
	
	public HomePage_Lider MundoBebé()
	{
		mouseHover(MundoBebélink);
		highLighterMethod(driver, MundoBebélink);
		verifyDisplayed(MundoBebélink);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@data-target,'#catSubMenu10')]")
	private WebElement Jugueteríalink;
	
	
	public HomePage_Lider Juguetería()
	{
		mouseHover(Jugueteríalink);
		highLighterMethod(driver, Jugueteríalink);
		verifyDisplayed(Jugueteríalink);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@data-target,'#catSubMenu11')]")
	private WebElement Automóvillink;
	
	
	public HomePage_Lider Automóvil()
	{
		mouseHover(Automóvillink);
		highLighterMethod(driver, Automóvillink);
		verifyDisplayed(Automóvillink);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@data-target,'#catSubMenu12')]")
	private WebElement CampañaTerrazaslink;
	
	
	public HomePage_Lider CampañaTerrazas()
	{
		mouseHover(CampañaTerrazaslink);
		highLighterMethod(driver, CampañaTerrazaslink);
		verifyDisplayed(CampañaTerrazaslink);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'main-item supermercado')]")
	private WebElement supermarcadolink;
	
	
	public Supermarket supermarcado()
	{
		click(supermarcadolink);
		
		return new Supermarket();
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class, 'https://www.lider.cl/electrohogar/MundoBebe') and contains(@class ,'item')]")
	private WebElement mondobebelink;
	
	
	public HomePage_Lider mondobebe()
	{
		click(mondobebelink);
		
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'container ctn-pd mw-lg mt-15')]")
	private WebElement verifymondobebelink;
	
	
	public HomePage_Lider verifymondobebe()
	{
		verifyDisplayed(verifymondobebelink);
		highLighterMethod(driver, verifymondobebelink);
		
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@href,'/electrohogar/category/Campaña-Terrazas/Especial-Terrazas/Ver-Todos/_/N-i0u53e') and contains(@class ,'item')]")
	private WebElement EspecialTerrazaslink;
	
	
	public HomePage_Lider EspecialTerrazas()
	{
		click(EspecialTerrazaslink);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@href, '#related-categories')]")
	private WebElement verifyEspecialTerrazaslink;
	
	
	public HomePage_Lider verifyEspecialTerrazas()
	{
		verifyDisplayed(verifyEspecialTerrazaslink);
		highLighterMethod(driver, verifyEspecialTerrazaslink);
		
		return this;
	}
	
	
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@href, '/electrohogar/category/Computación/Computación/Notebooks/_/N-8ca5vv')]")
	private WebElement notebooklink;
	
	
	public Notebook notebook()
	{
		highLighterMethod(driver, notebooklink);
		click(notebooklink);
		
		return new Notebook();
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@data-target,'#userLogin')]")
	private WebElement loginbutton;
	
	
	public HomePage_Lider clicklogin()
	{
		highLighterMethod(driver, loginbutton);
		click(loginbutton);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@data-msg-loginemail,'Email debe tener máximo 65 caracteres. ')]")
	private WebElement emailfield;
	
	
	public HomePage_Lider enteremail(String email)
	{
		highLighterMethod(driver, emailfield);
		type(emailfield,email);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@data-msg-passwordrule,'La clave debe contener al menos un número y una letra.')]")
	private WebElement passwordfield;
	
	
	public HomePage_Lider enterpassword(String password)
	{
		highLighterMethod(driver, passwordfield);
		type(passwordfield,password);
		
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'loginsubmitbutton')]")
	private WebElement enterbutton;
	
	
	public HomePage_Lider login()
	{
		highLighterMethod(driver, enterbutton);
		click(enterbutton);
		
		return this;
	}
	
	
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'name-initials')]")
	private WebElement initials;
	
	
	public HomePage_Lider initialsdisplayed()
	{
		verifyDisplayed(initials);
		highLighterMethod(driver, initials);
		
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'logoutLink')]")
	private WebElement logoutbutton;
	
	
	public HomePage_Lider logout()
	{
		highLighterMethod(driver, logoutbutton);
		click(logoutbutton);
		
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}