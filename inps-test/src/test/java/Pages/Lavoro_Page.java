package Pages;

import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Lavoro_Page {


    public Lavoro_Page() {
        PageFactory.initElements(Driver.getDriver(), this );
    }

    @FindBy(xpath = "//*[@id=\"acceptAllBtn\"]")
    public WebElement AccetaTutto;

    @FindBy(xpath = "//a[@aria-label='Apri menu Lavoro']")
    public WebElement ClickLavoro;

    @FindBy(xpath = "//div[@class='col-lg-7 p-5 bg-lavoro-nav']//a[@class='megamenu-item font-weight-bold text-primary'][contains(text(),'Esplora')]")
    public WebElement ClickEsploraTutto;

    @FindBy(xpath = "//a[@title='Vedi tutti']")
    public WebElement VediTuttiClick;

    @FindBy(xpath = "//a[@id='carica-altro']")
    public WebElement CaricaAltri10Servizi;

    @FindBy(xpath = "//a[@aria-label='Approfondisci Versamento tramite avviso di pagamento PagoPA (emissione massiva lavoratori domestici)']")
    public WebElement UltimoServizioNellaRicercaDiLavoro;

    @FindBy(xpath = "//button[normalize-space()='Utilizza il servizio']")
    public WebElement UtilizzaIlServizio;

}
