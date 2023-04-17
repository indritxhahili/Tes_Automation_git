package Step_Definitions;

import Pages.RicercaCon3Valori_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import utilities.ConfigurationReader;
import utilities.Driver;

public class RicercaCon3Valori_StepDefinitions {
     String strFAILED = "TEST FAILED";
     String strPASSED = "TEST PASSED";
      RicercaCon3Valori_Page ricercaCon3Valori_page = new RicercaCon3Valori_Page();
    @Given("User deve aprire Home Page e cercare")
    public void user_deve_aprire_home_page_e_cercare() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("INPSURL.IN.LAVORAZIONE"));
        ricercaCon3Valori_page.AccetaTutto.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Then("User deve clicare Nella Ricerca")
    public void user_deve_clicare_nella_ricerca() {
        ricercaCon3Valori_page.Ricerca.click();
    }
    @Then("User deve clicra sendKey")
    public void user_deve_clicra_send_key() throws InterruptedException {
        Thread.sleep(3000);
        ricercaCon3Valori_page.Ricerca.sendKeys("Imprese e Liberi Professionisti");
        Thread.sleep(3000);
        ricercaCon3Valori_page.ClickNellaRicerca.click();
        Thread.sleep(3000);
    }
    @When("User deve scroll Down fino nella ultima riga e vedere i {int} valori")
    public void user_deve_scroll_down_fino_nella_ultima_riga_e_vedere_i_valori(Integer int1) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,3500)", "");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,3500)", "");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @When("User deve applicare e verificare tutti {int} valori")
    public void user_deve_applicare_e_verificare_tutti_valori(Integer int1) throws InterruptedException {
        ricercaCon3Valori_page.ChooseDropDownsOptions.click();
        Thread.sleep(2000);
        if (!ricercaCon3Valori_page.ChooseOptions20.isEnabled()) {
            Thread.sleep(2000);
            ricercaCon3Valori_page.ChooseOptions20.click();
            Thread.sleep(3000);
            ricercaCon3Valori_page.Click_Avanti.click();
            Thread.sleep(4000);
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("window.scrollBy(0,2800)", "");
            ricercaCon3Valori_page.Click_Avanti.click();
            Thread.sleep(4000);
            js.executeScript("window.scrollBy(0,2800)", "");
            Thread.sleep(3000);
            ricercaCon3Valori_page.Click_Avanti.click();
            Thread.sleep(4000);
            js.executeScript("window.scrollBy(0,2800)", "");
            Thread.sleep(3000);
            ricercaCon3Valori_page.Click_Avanti.click();
            Thread.sleep(1000);
            Thread.sleep(4000);
            js.executeScript("window.scrollBy(0,2800)", "");
            Thread.sleep(3000);
            //ricercaCon3Valori_page.Click_Avanti.click();
        } else if (ricercaCon3Valori_page.ChooseOptions50.isEnabled()) {
            ricercaCon3Valori_page.ChooseOptions50.click();
            Thread.sleep(3000);
            ricercaCon3Valori_page.Click_Avanti.click();
            Thread.sleep(3000);
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("window.scrollBy(0,1500)", "");
            js.executeScript("window.scrollBy(0,1500)", "");
            Thread.sleep(3000);
            ricercaCon3Valori_page.Click_Avanti.click();
            Thread.sleep(3000);
            js.executeScript("window.scrollBy(0,1500)", "");
            js.executeScript("window.scrollBy(0,1500)", "");
            Thread.sleep(3000);
          //  ricercaCon3Valori_page.Click_Avanti.click();
        } else if (ricercaCon3Valori_page.ChooseOptions100.isEnabled()) {
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            ricercaCon3Valori_page.ChooseOptions100.click();
            Thread.sleep(3000);
            ricercaCon3Valori_page.Click_Avanti.click();
            Thread.sleep(3000);
            js.executeScript("window.scrollBy(0,4500)", "");
            js.executeScript("window.scrollBy(0,4500)", "");
            Thread.sleep(3000);
           // ricercaCon3Valori_page.Click_Avanti.click();
        }
        Driver.getDriver().close();
        System.out.println(strPASSED);
    }


}