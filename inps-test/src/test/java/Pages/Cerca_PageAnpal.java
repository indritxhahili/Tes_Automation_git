package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Cerca_PageAnpal {
    public Cerca_PageAnpal (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

       @FindBy(xpath = "//input[@id='_com_liferay_portal_search_web_portlet_SearchPortlet_keywords']")
    public WebElement Search_Anpal;

     @FindBy(xpath = "//*[@id=\"_it_gov_anpal_portlet_ricercaSportello_ItGovAnpalPortletRicercaSportelloPortlet_INSTANCE_slwJY2JhL0C3_provincia\"]")
    public WebElement Click_Nella_DropDowns;

     @FindBy(xpath = "//*[@id=\"_it_gov_anpal_portlet_ricercaSportello_ItGovAnpalPortletRicercaSportelloPortlet_INSTANCE_slwJY2JhL0C3_provincia\"]/option[6]")
    public WebElement Click_Nome;
}
