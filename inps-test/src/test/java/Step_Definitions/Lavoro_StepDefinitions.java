package Step_Definitions;

import Pages.Lavoro_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.apache.commons.lang3.ObjectUtils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.io.IOError;
import java.io.IOException;

public class Lavoro_StepDefinitions {


    Lavoro_Page lavoro_page = new Lavoro_Page();

    @Given("User deve aprire Home Page")
    public void user_deve_aprire_home_page() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("INPSURL.IN.LAVORAZIONE"));

        lavoro_page.AccetaTutto.click();
        Thread.sleep(3000);
    }
    @Then("User deve Clivare nel Lavoro")
    public void user_deve_clivare_nel_lavoro() throws InterruptedException {
        lavoro_page.ClickLavoro.click();
        String ActuallLavoroText = lavoro_page.ClickLavoro.getText();
        String ExpectedLavoroText = "Lavoro";
        if (!ActuallLavoroText.equals(ExpectedLavoroText)){
            System.out.println("Qualcosa e andata male nel step 1, Something went wrong ");
            Driver.getDriver().quit();
        }else
            System.out.println("Script 1 passed , NEXT ONE (;");

        Thread.sleep(3000);
    }
    @Then("User deve clicare Esplora Lavoro")
    public void user_deve_clicare_esplora_lavoro() throws InterruptedException {
        lavoro_page.ClickEsploraTutto.click();
        String ActuallLavoroText = lavoro_page.ClickEsploraTutto.getText();
        String ExpectedLavoroText = "Esplora Lavoro";


        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,1500)","");
        Thread.sleep(3000);
       //Assert.assertEquals(ExpectedLavoroText, ActuallLavoroText); Non che Text

        if (!lavoro_page.ClickEsploraTutto.isEnabled()){
            System.out.println("Qualcosa e andata male nel step 2, Something went wrong ");
           // Driver.getDriver().quit();
        }else
            System.out.println("Script 2 passed , NEXT ONE (;");

        Thread.sleep(3000);


    }
    @Then("User deve clicare Vedi Tutti")
    public void user_deve_clicare_vedi_tutti() throws InterruptedException {
        String ActuallVediTutti = lavoro_page.VediTuttiClick.getText();
        String ExpectedVediTutti = "Vedi tutti";

        Assert.assertEquals(ExpectedVediTutti, ActuallVediTutti);
        if ( !ActuallVediTutti.equals(ExpectedVediTutti)){
            System.out.println("Qualcosa e andata male nel step 3, Something went wrong ");
        }else
            lavoro_page.VediTuttiClick.click();
            System.out.println("Script 3 passed , NEXT ONE (;");
            Thread.sleep(3000);
    }
    @When("User deve usare il metodo di JavaScript di fare  Scroll down")
    public void user_deve_usare_il_metodo_di_java_script_di_fare_scroll_down() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,2200)","");
        Thread.sleep(3000);

        lavoro_page.CaricaAltri10Servizi.click();

        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,1800)","");
        Thread.sleep(3000);

        lavoro_page.CaricaAltri10Servizi.click();

        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,1800)","");
        Thread.sleep(3000);

        lavoro_page.CaricaAltri10Servizi.click();
        Thread.sleep(3000);
    }
    @When("User deve Clicare Carica Altri dieci Servizi")
    public void user_deve_clicare_carica_altri_dieci_servizi() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,1800)", "");
        Thread.sleep(3000);
        lavoro_page.CaricaAltri10Servizi.click();

        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,1800)", "");
        Thread.sleep(3000);

        lavoro_page.CaricaAltri10Servizi.click();

        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,1800)", "");

        Thread.sleep(3000);
        lavoro_page.CaricaAltri10Servizi.click();

        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,800)", "");

        Thread.sleep(3000);
        lavoro_page.CaricaAltri10Servizi.click();


        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,800)", "");

        Thread.sleep(3000);
        lavoro_page.CaricaAltri10Servizi.click();

        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,600)", "");

        String ActuallUltimoServizio = lavoro_page.UltimoServizioNellaRicercaDiLavoro.getText();
        String ExpectedUltimoServizio = "Approfondisci\n" +
                "Versamento tramite avviso di pagamento PagoPA (emissione massiva lavoratori domestici)";

        Assert.assertEquals(ExpectedUltimoServizio, ActuallUltimoServizio);

        if (!ActuallUltimoServizio.equals(ExpectedUltimoServizio)) {
            System.out.println("Something went wrong nel Ultimo Servizio !!");
            Driver.getDriver().quit();
        } else
            System.out.println("Everything OK (:");
        lavoro_page.UltimoServizioNellaRicercaDiLavoro.click();

        String ActuallUtilizzaServizio = lavoro_page.UtilizzaIlServizio.getText();
        String ExpectedUtilizzaServizio = "Approfondisci\n" +
                "Versamento tramite avviso di pagamento PagoPA (emissione massiva lavoratori domestici)";
        Assert.assertEquals(ExpectedUtilizzaServizio, ActuallUltimoServizio);



        if (!lavoro_page.UtilizzaIlServizio.isEnabled()) {
            System.out.println("Something went wrong nel Ultimo Servizio !!");
            Driver.getDriver().quit();
        } else
            lavoro_page.UtilizzaIlServizio.click();
        System.out.println("Congratulations hai passato tutto con successo!!");
        Thread.sleep(4000);

            if (lavoro_page.UtilizzaIlServizio.equals(null)) {
                System.out.println("Il nome di servizio e Null");
            } else
                System.out.println("Tutto bene ");
            Thread.sleep(2000);
            Driver.getDriver().close();
    }
    /*
try {

        if (lavoro_page.UtilizzaIlServizio.equals(null)) {
            System.out.println("Il nome di servizio e Null");
            IOException.class.equals(null);

        } else
            System.out.println("Tutto bene ");
        Driver.getDriver().close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

     */
}