package Pages;

import com.fasterxml.jackson.annotation.JsonFilter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.logging.XMLFormatter;

public class Regression_Page {

    public Regression_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"acceptAllBtn\"]")
    public WebElement AccetaTutto;

    @FindBy(xpath = "//input[@id='inputsearch']")
    public WebElement Search_Carateri_Speziali;

    @FindBy(xpath = "//span[@class='d-none d-lg-block']")
    public WebElement Click_Nella_Ricerca;

    @FindBy(xpath = "//a[@aria-label='Apri menu Pensione e Previdenza']")
    public WebElement Risposta_Della_Ricerca;

    @FindBy(xpath = "//a[@aria-label='Apri menu Pensione e Previdenza']")
    public WebElement User_Click_Pensione_Previdenza;

    @FindBy(xpath = "//div[@class='col-lg-7 p-5 bg-previdenza-nav']//a[@class='megamenu-item font-weight-bold text-primary'][contains(text(),'Esplora')]")
    public WebElement Click_Esplora_Pensione_Previdenza;

    @FindBy(xpath = "//a[@title='Vedi tutti']")
    public WebElement Click_Vedi_Tutti;

    @FindBy(xpath = "//a[@aria-label=\"Approfondisci 730 pre-compilato: accesso ai servizi dell'Agenzia delle Entrate\"]")
    public WebElement Click_Approfondisci;

    @FindBy(xpath = "//a[@id='utilizzaSticky_dettScheda']")
    public WebElement Click_Utilizza_Servizio;

    @FindBy(xpath = "//a[@aria-label='Apri menu Lavoro']")
    public WebElement Click_Lavoro;

    @FindBy(xpath = "//div[@class='col-lg-7 p-5 bg-lavoro-nav']//a[@class='megamenu-item font-weight-bold text-primary'][contains(text(),'Esplora')]")
    public WebElement Click_Esplora_Lavoro;

    @FindBy(xpath = "//a[@title='Vedi tutti']")
    public WebElement Click_Vedi_Tutti_Lavoro;

    @FindBy(xpath = "//a[@aria-label=\"Approfondisci 730 pre-compilato: accesso ai servizi dell'Agenzia delle Entrate\"]")
    public WebElement Click_Approfondisci_Lavoro;

    @FindBy(xpath = "//a[@id='utilizzaSticky_dettScheda']")
    public WebElement Click_Utilizza_Servizio_Lavoro;

    @FindBy(xpath = "//*[@id=\"menu-top\"]/div/ul/li[3]/a")
    public WebElement Click_Sostegni_Sussidi;

   @FindBy(xpath = "//div[@class='col-lg-7 p-5 bg-sostegni-sussidi-indennita-nav']//a[@class='megamenu-item font-weight-bold text-primary'][contains(text(),'Esplora')]")
    public WebElement Click_Sostegni_Sussidi_E_Indenntita;

   @FindBy(xpath = "//a[@title='Vedi tutti']")
    public WebElement Vedi_Tutti_Click_Sostegni_Sussidi;

   @FindBy(xpath = "//a[@aria-label='Approfondisci ASDI - Assegno Sociale di Disoccupazione per i beneficiari di NASpI']")
    public WebElement Click_Approfondisci_Sostegni_Sussidi;

   @FindBy(xpath = "//div[@class='text-md-right d-lg-block d-none']//button[@type='button'][normalize-space()='Utilizza il servizio']")
    public WebElement Click_Utilizza_Servizio_Sostegni_Sussidi;


   @FindBy(xpath = "//*[@id=\"utilizzaUtenza-0-0_dettScheda\"]")
   public WebElement Utilizza_Last_Servizio;

   @FindBy(xpath = "//a[@id='id_Imprese e Liberi Professionisti']")
    public WebElement Click_Imprese_E_Liberi_Professionisti_Back;

   @FindBy(xpath = "//a[@aria-label='Apri menu Imprese e Liberi Professionisti']")
    public WebElement Click_Imprese_E_Liberi_Professionisti;

   @FindBy(xpath = "//div[@class='col-lg-7 p-5 bg-imprese-e-liberi-professionisti-nav']//a[@class='megamenu-item font-weight-bold text-primary'][contains(text(),'Esplora')]")
    public WebElement Esplora_Imprese_E_Liberi_Professionisti;

   @FindBy(xpath = "//a[@title='Vedi tutti']")
    public WebElement Esplora_Imprese_E_Liberi_Professionisti_VediTutti;

   @FindBy(xpath = "//a[@id='utilizza_00']")
    public WebElement Approfondisci_Accesso_AI_Servizi;

   @FindBy(xpath = "//a[@id='utilizzaSticky_dettScheda']")
    public WebElement   Utilizza_Servizio_Approfondisci_Accesso;

   @FindBy(xpath = "//a[@id='id_Imprese e Liberi Professionisti']")
    public WebElement Imprese_E_Liberi_Professionisti_Back;

   @FindBy(xpath = "//a[@id='id_Pensione e Previdenza']")
    public WebElement Pensione_E_Previdenza_Last_Back;

   @FindBy(xpath = "//a[@title='Per i CAF ed i liberi professionisti']")
    public WebElement Per_CAF_Liberi_Prefessionisti;

   @FindBy(xpath = "//*[@id=\"filter-block\"]/div[1]/div[1]/div/div/button")
    public WebElement Per_CAF_Liberi_Prefessionisti_DropDowns;

   @FindBy(xpath = "//*[@id=\"bs-select-1-3\"]")
    public WebElement Per_CAF_Liberi_Prefessionisti_Select;

   @FindBy(xpath = "//button[@title='Qualsiasi']")
    public WebElement Sottotipologia_click;

   @FindBy(xpath = "//a[@id='bs-select-2-1']//span[@class='text'][contains(text(),'Modelli e Software per le Dichiarazioni di Respons')]")
    public WebElement Click_Modeli_Software;

   @FindBy(xpath = "//input[@id='datepicker-year']")
    public WebElement Click_Anno;

   @FindBy(xpath = "//span[@class='year focused']")
    public WebElement SelectAnno;

   @FindBy(xpath = "//a[@id='searchFilterLink']")
    public WebElement ApplicaFiltri;

   @FindBy(xpath = "//a[@id='resetFilterLink']")
    public WebElement Cancella_Filtri;

    @FindBy(xpath = "//a[@title='Per i medici certificatori e Medici di Famiglia']")
    public WebElement Medici_Certificatori_E_Medici_Di_Famiglia;

    @FindBy(xpath = "//*[@id=\"filter-block\"]/div[1]/div[1]/div/div/button/span")
    public WebElement Medici_Certificatori_E_Medici_Di_Famiglia_DropDowns;

    @FindBy(xpath = "//*[@id=\"bs-select-1-2\"]")
    public WebElement Medici_Certificatori_E_Medici_Select;

    @FindBy(xpath = "//*[@id=\"filter-block\"]/div[1]/div[2]/div/div/button/span")
    public WebElement Sottotipologia_click_Medici_Certificatori;

    @FindBy(xpath = "//a[@id='bs-select-2-4']")
    public WebElement Select_Sottotipologia;

    @FindBy(xpath = "//*[@id=\"filter-block\"]/div[1]/div[4]/div/div/a")
    public WebElement AnnoDrop_Downs;

    @FindBy(xpath = "//*[@id=\"page-0d9e24f7de\"]/div[3]/div[3]/table/tbody/tr/td/span[5]")
    public WebElement Select_Year_Medici_Certificatori;

    @FindBy(xpath = "//a[@id='searchFilterLink']")
    public WebElement Applica_Filtri_Medici_Certificatori;

    @FindBy(xpath = "//a[@id='resetFilterLink']")
    public WebElement CancellaFiltri_Medici;

    @FindBy(xpath = "//a[@title='Per il cittadino']")
    public WebElement Click_Per_I_Cittado;

    @FindBy(xpath = "//*[@id=\"filter-block\"]/div[1]/div[1]/div/div/button/span")
    public WebElement Topologia_Il_Cittadino;

    @FindBy(xpath = "//*[@id=\"bs-select-1-2\"]")
    public WebElement Select_On_Tipologia;

    @FindBy(xpath = "//*[@id=\"filter-block\"]/div[1]/div[2]/div/div/button/span")
    public WebElement ClickDropDowns_Sottotipologia;

    @FindBy(xpath = "//*[@id=\"bs-select-2-11\"]/span[2]")
    public WebElement Select_Sottotipologia_Modelli;

     @FindBy(xpath = "//*[@id=\"filter-block\"]/div[1]/div[4]/div/div/a")
    public WebElement ClickYear_Cittadino_Sototipologia;

     @FindBy(xpath = "//*[@id=\"page-0d9e24f7de\"]/div[3]/div[3]/table/tbody/tr/td/span[5]")
    public WebElement Select_Cittadino_Sototipologia;

     @FindBy(xpath = "//a[@id='searchFilterLink']")
    public WebElement ApplicaFiltri_Cittadino_Sototipologia;

     @FindBy(xpath = "//a[@id='resetFilterLink']")
    public WebElement Click_Cancella_Filtri_Cittadino;

     @FindBy(xpath = "//a[@title='Per le aziende ed i Consulenti']")
    public WebElement Aziende_Ed_I_Consulenti;

     @FindBy(xpath = "//*[@id=\"filter-block\"]/div[1]/div[1]/div/div/button/span")
    public WebElement Aziende_Ed_I_Consulenti_Tipologia;

     @FindBy(xpath = "//*[@id=\"bs-select-1-2\"]")
    public WebElement Select_Tipologia_Consulenti_Tipologia;

     @FindBy(xpath = "//*[@id=\"filter-block\"]/div[1]/div[2]/div/div/button/span")
    public WebElement DropDowdns_Sottotipologia_Consulenti_Tipologia;

     @FindBy(xpath = "//*[@id=\"filter-block\"]/div[1]/div[4]/div/div/a")
    public WebElement DropDowns_Anno_Consulenti_Tipologia;

     @FindBy(xpath = "//*[@id=\"page-0d9e24f7de\"]/div[3]/div[3]/table/tbody/tr/td/span[5]")
    public WebElement Select_Year_Consulenti_Tipologia;

     @FindBy(xpath = "//a[@id='searchFilterLink']")
    public WebElement Applica_Filtri_Consulenti_Tipologia;

     @FindBy(xpath = "//a[@id='resetFilterLink']")
    public WebElement Cancella_Consulenti_Tipologia;









}

