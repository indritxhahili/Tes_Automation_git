package Step_Definitions;

import Pages.Notizie_PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.io.IOException;

public class Notizie_Step_Definitions {
Notizie_PageFactory notizie_pageFactory = new Notizie_PageFactory();
    String strPassed = "PASSED";
    String strFailed = "FAILED";
    @Given("User deve aprire e clicare AccettaTutti")
    public void user_deve_aprire_e_clicare_accetta_tutti() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("INPSURL.IN.LAVORAZIONE"));

        notizie_pageFactory.AccetaTutto.click();
        Thread.sleep(1000);
        notizie_pageFactory.ClickINPS_Comunica.click();
        Thread.sleep(1000);
    }
    @Then("User deve andare sul la Pagina di INPS")
    public void user_deve_andare_sul_la_pagina_di_inps() {
     if (notizie_pageFactory.ClickINPS_Comunica.equals(null)){
         System.out.println(" Error : INPS Comunica non e clicabile "+strFailed );
     }else
         System.out.println("INPS Comunica e clicabile " +strPassed);
    }
    @Then("User deve capire e seguire tutti li step che ci servono nella Pagina")
    public void user_deve_capire_e_seguire_tutti_li_step_che_ci_servono_nella_pagina() throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(1000);

    }
    @Then("User deve clicare nella INPS Comunica")
    public void user_deve_clicare_nella_inps_comunica() throws InterruptedException {
        if (!notizie_pageFactory.ClickNotizie.isEnabled()){
            System.out.println(strFailed);
        }else
            System.out.println(strPassed);
     notizie_pageFactory.ClickNotizie.click();
     Thread.sleep(1000);
    }
    @Then("User deve Fare scroll down and clicare su Notizie")
    public void user_deve_fare_scroll_down_and_clicare_su_notizie() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,300)", "");
        Thread.sleep(1000);

        notizie_pageFactory.DAL_DATA_Filtri.click();
        Thread.sleep(3000);
    }
    @Then("User deve testare il dropdows")
    public void user_deve_testare_il_dropdows() throws InterruptedException {
        notizie_pageFactory.ClickDATA_14.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notizie_pageFactory.Applicca_Notizie.click();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,1000)", "");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,-1000)", "");
        Thread.sleep(3000);

        notizie_pageFactory.CancellaFiltri_Notize.click();
        Thread.sleep(3000);

        notizie_pageFactory.Click_SearchNotizie.click();
        Thread.sleep(3000);
        notizie_pageFactory.Click_SearchNotizie.sendKeys("Prestazioni a sostegno del nucleo familiare");
        Thread.sleep(3000);
        notizie_pageFactory.Applicca_Notizie.click();
        js.executeScript("window.scrollBy(0,1000)", "");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,-1000)", "");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notizie_pageFactory.CancellaFiltri_Notize.click();
        Thread.sleep(3000);
    }
    @Then("User deve vedere se tutto funziona nella tabela")
    public void user_deve_vedere_se_tutto_funziona_nella_tabela() throws InterruptedException {
        notizie_pageFactory.AL_Data_Notizie.click();
        Thread.sleep(3000);
        notizie_pageFactory.Click21_Data.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
   notizie_pageFactory.Applicca_Notizie.click();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,1000)", "");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,-1000)", "");
        Thread.sleep(3000);
        if (!notizie_pageFactory.CancellaFiltri_Notize.isEnabled()){
            System.out.println("Test Error: "+strFailed );
        }else
            System.out.println("Test " + strPassed);
        notizie_pageFactory.CancellaFiltri_Notize.click();
        Thread.sleep(4000);

        Driver.getDriver().close();



    }




}
