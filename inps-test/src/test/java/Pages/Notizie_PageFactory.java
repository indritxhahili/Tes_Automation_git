package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Notizie_PageFactory {
    public Notizie_PageFactory(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@id=\"acceptAllBtn\"]")
    public WebElement AccetaTutto;


    @FindBy(xpath = "//a[@title='INPS Comunica']")
    public WebElement ClickINPS_Comunica;

    @FindBy(xpath = "//a[@id='menu-notizie-8']")
     public WebElement ClickNotizie;

    @FindBy(xpath = "//div[@id='filter-block']//div[2]//div[1]//div[1]//a[1]//span[1]")
    public WebElement DAL_DATA_Filtri;

    @FindBy(xpath = "//*[@id=\"page-9fde670de1\"]/div[4]/div[1]/table/tbody/tr[3]/td[2]/span")
    public WebElement ClickDATA_14;

    @FindBy(xpath = "//a[@id='searchFilterLink']")
    public WebElement Applicca_Notizie;

    @FindBy(xpath = "//a[@id='resetFilterLink']")
    public WebElement CancellaFiltri_Notize;

    @FindBy(xpath = "//main[@class='container responsivegrid aem-GridColumn aem-GridColumn--default--12']//div[3]//div[1]//div[1]//a[1]//span[1]")
    public WebElement AL_Data_Notizie;

    @FindBy(xpath = "//span[normalize-space()='21']")
    public WebElement Click21_Data;

     @FindBy(xpath ="//input[@id='input-text']")
    public WebElement Click_SearchNotizie;
}
