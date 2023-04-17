package Pages;

import io.cucumber.java.de.Wenn;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CarateriSpeziali_Page {

    public CarateriSpeziali_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//input[@id='inputsearch']")
    public WebElement ClickNellaRicerca;

    @FindBy(xpath = "//*[@id=\"acceptAllBtn\"]")
    public WebElement AccetaTutto;

    @FindBy(xpath = "//span[@class='d-none d-lg-block']")
    public WebElement BTNClick;

    @FindBy(xpath = "//*[@id=\"main\"]")
    public WebElement RisultatoSLash;

    @FindBy(xpath = "//a[@id='resetsearch']//i[@class='fas fa-times']")
    public WebElement Cancella_La_Ricerca;


}
