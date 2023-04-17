package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RicercaCon3Valori_Page {
    public RicercaCon3Valori_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@id=\"acceptAllBtn\"]")
    public WebElement AccetaTutto;

    @FindBy(xpath = "//input[@id='inputsearch']")
    public WebElement Ricerca;

    @FindBy(xpath = "//span[@class='d-none d-lg-block']")
    public WebElement ClickNellaRicerca;

    @FindBy(xpath = "//button[@title='50']")
    public WebElement ChooseDropDownsOptions;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/nav[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    public WebElement ChooseOptions20;

    @FindBy(xpath = "//span[@class='text'][normalize-space()='50']")
    public WebElement ChooseOptions50;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/nav[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/span[1]")
    public WebElement ChooseOptions100;

    @FindBy(xpath = "//*[@id=\"frecciaDx\"]")
    public  WebElement Click_Avanti;


}
