package Step_Definitions;

import Pages.INPS_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class INPS_StepDefinitions {
    INPS_Page pageFactory = new INPS_Page();

    @Given("User deve aprire il browsers")
    public void user_deve_aprire_il_browsers() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("INPSURL.IN.LAVORAZIONE"));
        pageFactory.AccetaTutto.click();
        Thread.sleep(3000);

       pageFactory.UserShouldClickOnPensioneEPrevidenza.click();
        Thread.sleep(3000);

       pageFactory.EsploraPensioneEPrevidenza.click();
        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,1500)","");
        Thread.sleep(3000);

        pageFactory.VediTutto.click();
        // pageFactory.VediTutto.getText();
        // pageFactory.VediTutto.isDisplayed();

        Thread.sleep(3000);

    }
    @Then("User deve andare sul la Pagina")
    public void user_deve_andare_sul_la_pagina() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,600)","");
        Thread.sleep(3000);



    }
    @Then("User deve capire e seguire tutti li step che ci servono")
    public void user_deve_capire_e_seguire_tutti_li_step_che_ci_servono() {
     pageFactory.Approfondisci.click();
     //pageFactory.Approfondisci.getText();
       // pageFactory.Approfondisci.isDisplayed();

    }
    @Then("User deve clicare nella home page")
    public void user_deve_clicare_nella_home_page() throws InterruptedException {
    //pageFactory.utilizzaServizi.isDisplayed();

        if (pageFactory.utilizzaServizi.isDisplayed()){
            pageFactory.utilizzaServizi.click();
            Thread.sleep(3000);
            Driver.getDriver().close();
            System.out.println("E ANDATA TUTTO BENE");
        }else{
            System.out.println("ERRORE NELLA PAGINA , QUALCOSA E ANDATA MALE!!");
        }

    }
}
