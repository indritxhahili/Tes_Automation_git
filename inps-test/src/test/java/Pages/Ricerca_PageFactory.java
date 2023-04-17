package Pages;

import org.jsoup.helper.W3CDom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Ricerca_PageFactory {

    public Ricerca_PageFactory() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//*[@id=\"acceptAllBtn\"]")
    public WebElement AccetaTutto;


   @FindBy(xpath = "//input[@id='inputsearch']")
    public WebElement Ricerca;

   @FindBy(xpath = "//span[@class='d-none d-lg-block']")
    public WebElement ClickNellaRicerca;


   @FindBy(xpath = "//*[@id=\"modalInputError\"]/div/div/div[2]/div/div[1]/p")
    public WebElement GetOutputNellaRicerca;





}
