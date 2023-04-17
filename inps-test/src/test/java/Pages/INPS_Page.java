package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class INPS_Page {
public INPS_Page(){

            PageFactory.initElements(Driver.getDriver(),this);
        }

@FindBy(xpath = "//a[@aria-label='Apri menu Pensione e Previdenza']")
    public WebElement UserShouldClickOnPensioneEPrevidenza;

@FindBy(xpath = "//*[@id=\"acceptAllBtn\"]")
public WebElement AccetaTutto;

@FindBy(xpath = "//div[@class='col-lg-7 p-5 bg-previdenza-nav']//a[@class='megamenu-item font-weight-bold text-primary'][contains(text(),'Esplora')]")
public WebElement EsploraPensioneEPrevidenza;

@FindBy(xpath = "//a[@title='Vedi tutti']")
    public WebElement VediTutto;

@FindBy(xpath = "//*[@id=\"result-container\"]/div[2]/div[1]/div[3]/a")
    public WebElement Approfondisci;

@FindBy(xpath = "//a[@id='utilizzaSticky_dettScheda']")
    public WebElement utilizzaServizi;













}

