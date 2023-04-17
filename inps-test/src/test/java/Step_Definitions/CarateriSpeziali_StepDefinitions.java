package Step_Definitions;
import Pages.CarateriSpeziali_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import utilities.ConfigurationReader;
import utilities.Driver;
import javax.management.loading.PrivateClassLoader;
import java.util.Random;

public class CarateriSpeziali_StepDefinitions {
Random random = new Random();
CarateriSpeziali_Page carateriSpeziali_page = new CarateriSpeziali_Page();

    @Given("User deve aprire il browsers e seguire i step")
    public void user_deve_aprire_il_browsers_e_seguire_i_step() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("INPSURL.IN.LAVORAZIONE"));

        carateriSpeziali_page.AccetaTutto.click();
        Thread.sleep(2000);

       if(carateriSpeziali_page.ClickNellaRicerca.isEnabled()){
           carateriSpeziali_page.ClickNellaRicerca.click();
       }else
           System.out.println("La Ricerca non e valida!!");
        Thread.sleep(4000);
      //  carateriSpeziali_page.CancellazioneINPS.click();
        Thread.sleep(2000);
    }
    @Then("User deve andare sul la Pagina e seguire")
    public void user_deve_andare_sul_la_pagina_e_seguire() throws InterruptedException {
        carateriSpeziali_page.ClickNellaRicerca.sendKeys("//Reddito");
        Thread.sleep(2000);
        carateriSpeziali_page.BTNClick.click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,-500)","");
        Thread.sleep(4000);
        carateriSpeziali_page.Cancella_La_Ricerca.click();

        //  Qui aspettiamo il risultato sensa // pero con 2 spazi
        String srt = "  Reddito";

        Thread.sleep(2000);
        if (!carateriSpeziali_page.RisultatoSLash.getText().contains(srt)){
            System.out.println("Resultato non e correto!!!!");
            System.out.println("Aspettiamo questo risultato---->" + srt +"<----- che deve essere inculso nella riga: " + "----> " + carateriSpeziali_page.RisultatoSLash.getText());
            System.out.println("Error : ");
            Thread.sleep(3000);
            //Driver.getDriver().close();
        }else
        System.out.println("Resultato e correto ");
        Thread.sleep(3000);
        // Driver.getDriver().close();
    }
    @Then("User deve capire e seguire tutti li step che ci servono.")
    public void user_deve_capire_e_seguire_tutti_li_step_che_ci_servono() throws InterruptedException {

      //  carateriSpeziali_page.AccetaTutto.click();
      //  Thread.sleep(2000);

        if(carateriSpeziali_page.ClickNellaRicerca.isEnabled()){
            carateriSpeziali_page.ClickNellaRicerca.click();
        }else
            System.out.println("La Ricerca non e valida!!");

        Thread.sleep(3000);

    }
    @Then("User deve clicare nella home page e cercare un caratero speziale")
    public void user_deve_clicare_nella_home_page_e_cercare_un_caratero_speziale() throws InterruptedException {
        carateriSpeziali_page.ClickNellaRicerca.sendKeys("Pensione<!>Lavoro");
        Thread.sleep(2000);
        carateriSpeziali_page.BTNClick.click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,-500)","");
        Thread.sleep(4000);
      carateriSpeziali_page.Cancella_La_Ricerca.click();
        //  Qui aspettiamo il risultato sensa // pero con 2 spazi
        String srt = "Pensione   Lavoro";


        if (!carateriSpeziali_page.RisultatoSLash.getText().contains(srt)){
            System.out.println("Resultato non e correto!!!!");
            System.out.println("Aspettiamo questo risultato---->" + srt +"<----- che deve essere inculso nella riga: " + "----> " + carateriSpeziali_page.RisultatoSLash.getText());
            System.out.println("Error : ");
            Thread.sleep(3000);
            //  Driver.getDriver().close();
        }else
        System.out.println("Resultato e correto ");
        Thread.sleep(3000);
        // Driver.getDriver().close();


        if(carateriSpeziali_page.ClickNellaRicerca.isEnabled()){
            carateriSpeziali_page.ClickNellaRicerca.click();
        }else
            System.out.println("La Ricerca non e valida!!");

        Thread.sleep(2000);
        carateriSpeziali_page.ClickNellaRicerca.sendKeys("Pensione{}Lavoro");
        Thread.sleep(2000);
        carateriSpeziali_page.BTNClick.click();
        js.executeScript("window.scrollBy(0,-500)","");
        Thread.sleep(4000);
        carateriSpeziali_page.Cancella_La_Ricerca.click();
        //  Qui aspettiamo il risultato sensa // pero con 2 spazi
        String srt1 = "Pensione  Lavoro";


        if (!carateriSpeziali_page.RisultatoSLash.getText().contains(srt)){
            System.out.println("Resultato non e correto!!!!");
            System.out.println("Aspettiamo questo risultato---->" + srt1 +"<----- che deve essere inculso nella riga: " + "----> " + carateriSpeziali_page.RisultatoSLash.getText());
            System.out.println("Error : ");
             Thread.sleep(3000);
            // Driver.getDriver().close();
        }else
        System.out.println("Resultato e correto ");
        Thread.sleep(3000);
        //  Driver.getDriver().close();


        if(carateriSpeziali_page.ClickNellaRicerca.isEnabled()){
            carateriSpeziali_page.ClickNellaRicerca.click();
        }else
            System.out.println("La Ricerca non e valida!!");

        Thread.sleep(2000);
        carateriSpeziali_page.ClickNellaRicerca.sendKeys("Pensione!!!!====Lavoro");
        Thread.sleep(2000);
        carateriSpeziali_page.BTNClick.click();
        js.executeScript("window.scrollBy(0,-500)","");
        Thread.sleep(4000);
        carateriSpeziali_page.Cancella_La_Ricerca.click();
        //  Qui aspettiamo il risultato sensa // pero con 2 spazi
        String srt2 = "Pensione        Lavoro";


        if (!carateriSpeziali_page.RisultatoSLash.getText().contains(srt2)){
            System.out.println("Resultato non e correto!!!!");
            System.out.println("Aspettiamo questo risultato---->" + srt2 +"<----- che deve essere inculso nella riga: " + "----> " + carateriSpeziali_page.RisultatoSLash.getText());
            System.out.println("Error : ");
            Thread.sleep(3000);
            //  Driver.getDriver().close();
        }else
        System.out.println("Resultato e correto ");
        Thread.sleep(3000);
        //   Driver.getDriver().close();

        if(carateriSpeziali_page.ClickNellaRicerca.isEnabled()){
            carateriSpeziali_page.ClickNellaRicerca.click();
        }else
            System.out.println("La Ricerca non e valida!!");

        Thread.sleep(2000);
        carateriSpeziali_page.ClickNellaRicerca.sendKeys("Pensione()Lavoro");
        Thread.sleep(2000);
        carateriSpeziali_page.BTNClick.click();
        js.executeScript("window.scrollBy(0,-500)","");
        Thread.sleep(4000);
       carateriSpeziali_page.Cancella_La_Ricerca.click();
        //  Qui aspettiamo il risultato sensa // pero con 2 spazi
        String srt3 = "Pensione()Lavoro";

        if (!carateriSpeziali_page.RisultatoSLash.getText().contains(srt3)){
            System.out.println("Resultato non e correto!!!!");
            System.out.println("Aspettiamo questo risultato---->" + srt3 +"<----- che deve essere inculso nella riga: " + "----> " + carateriSpeziali_page.RisultatoSLash.getText());
            System.out.println("Error : ");
            Thread.sleep(3000);
           // Driver.getDriver().close();
        }else
            System.out.println("Resultato e correto ");
        Thread.sleep(3000);
       // Driver.getDriver().close();

        if(carateriSpeziali_page.ClickNellaRicerca.isEnabled()){
            carateriSpeziali_page.ClickNellaRicerca.click();
        }else
            System.out.println("La Ricerca non e valida!!");

        Thread.sleep(2000);
        carateriSpeziali_page.ClickNellaRicerca.sendKeys("//Pensione Lavoro//");
        Thread.sleep(2000);
        carateriSpeziali_page.BTNClick.click();
        js.executeScript("window.scrollBy(0,-500)","");
        Thread.sleep(4000);
       carateriSpeziali_page.Cancella_La_Ricerca.click();
        //  Qui aspettiamo il risultato sensa // pero con 2 spazi
        String srt4 = "//Pensione Lavoro//";


        if (!carateriSpeziali_page.RisultatoSLash.getText().contains(srt4)){
            System.out.println("Resultato non e correto!!!!");
            System.out.println("Aspettiamo questo risultato---->" + srt4 +"<----- che deve essere inculso nella riga: " + "----> " + carateriSpeziali_page.RisultatoSLash.getText());
            Thread.sleep(3000);
            System.out.println("Error : ");
            Driver.getDriver().close();
        }else
            System.out.println("Resultato e correto ");
        Thread.sleep(3000);
        Driver.getDriver().close();
    }
    }


