package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Lettere_PageFactory {
    public Lettere_PageFactory(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@id=\"acceptAllBtn\"]")
    public WebElement AccetaTutto;

    @FindBy(xpath = "//a[@aria-label='Apri menu Imprese e Liberi Professionisti']")
    public WebElement Click_Nella_Imprese_ELiberi_Professionisti;

    @FindBy(xpath = "//div[@class='col-lg-7 p-5 bg-imprese-e-liberi-professionisti-nav']//a[@class='megamenu-item font-weight-bold text-primary'][contains(text(),'Esplora')]")
     public WebElement Esplora_Liberi_Professionisti;

    @FindBy(xpath = "//a[@title='Vedi tutti']")
    public WebElement Click_Vedi_Tutti;

    @FindBy(xpath = "//a[@data-letter='A']")
    public WebElement Click_A;

    @FindBy(xpath = "//a[@data-letter='C']")
    public WebElement Click_C;

    @FindBy(xpath = "//a[@data-letter='D']")
    public WebElement Click_D;

    @FindBy(xpath = "//a[@data-letter='E']")
    public WebElement Click_E;

    @FindBy(xpath = "//a[@data-letter='F']")
    public WebElement Click_F;

    @FindBy(xpath = "//a[@data-letter='G']")
    public WebElement Click_G;

    @FindBy(xpath = "//a[@data-letter='I']")
    public WebElement Click_I;

    @FindBy(xpath = "//a[@data-letter='L']")
    public WebElement Click_L;

    @FindBy(xpath = "//a[@data-letter='O']")
    public WebElement Click_O;

    @FindBy(xpath = "//a[@data-letter='P']")
    public WebElement Click_P;

    @FindBy(xpath = "//a[@data-letter='R']")
    public WebElement Click_R;

    @FindBy(xpath = "//a[@data-letter='S']")
    public WebElement Click_S;

    @FindBy(xpath = "//a[@data-letter='T']")
    public WebElement Click_T;

    @FindBy(xpath = "//a[@data-letter='V']")
    public WebElement Click_V;















}

