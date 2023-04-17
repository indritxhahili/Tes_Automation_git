package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestNegativoNellaRicerca_Page {


   public  TestNegativoNellaRicerca_Page() {
       PageFactory.initElements(Driver.getDriver(), this);

   }
    @FindBy(xpath = "//*[@id=\"acceptAllBtn\"]")
    public WebElement AccetaTutto;


    @FindBy(xpath = "//*[@id=\"inputsearch\"]")
    public WebElement Ricerca;







}
