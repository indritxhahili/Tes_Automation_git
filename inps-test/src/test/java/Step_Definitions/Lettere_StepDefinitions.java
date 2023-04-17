package Step_Definitions;

import Pages.Lettere_PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.io.filefilter.ConditionalFileFilter;
import org.openqa.selenium.JavascriptExecutor;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Lettere_StepDefinitions {
    Lettere_PageFactory lettere_pageFactory = new Lettere_PageFactory();
    String strPASSED = "PASSED";
    String strFAILED = "FAILED";
    @Given("User deve fare un test sulle lettere nella Imprese e Liberi Professionisti")
    public void user_deve_fare_un_test_sulle_lettere_nella_imprese_e_liberi_professionisti() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("INPSURL.IN.LAVORAZIONE"));
      lettere_pageFactory.AccetaTutto.click();
      Thread.sleep(3000);
      if (!lettere_pageFactory.Click_Nella_Imprese_ELiberi_Professionisti.isEnabled()){
          System.out.println(" Error: TEST " +strFAILED);
      }else
          System.out.println("TEST " +strPASSED);
        lettere_pageFactory.Click_Nella_Imprese_ELiberi_Professionisti.click();
        Thread.sleep(3000);
    }
    @Then("User deve Navigare e seguire Imprese e Liberi Professionisti")
    public void user_deve_navigare_e_seguire_imprese_e_liberi_professionisti() throws InterruptedException {
    lettere_pageFactory.Esplora_Liberi_Professionisti.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,1500)","");
        Thread.sleep(3000);
    }
    @Then("User deve fare scroll down e clicare Esplora Imprese e Liberi Professionisti")
    public void user_deve_fare_scroll_down_e_clicare_esplora_imprese_e_liberi_professionisti() throws InterruptedException {
     lettere_pageFactory.Click_Vedi_Tutti.click();
     Thread.sleep(3000);
    }
    @Then("User deve verificare le lettere")
    public void user_deve_verificare_le_lettere() throws InterruptedException {
        // Qui stiamo testando la lettera A
        if (!lettere_pageFactory.Click_A.isEnabled()){
            System.out.println("Error: Test" + strFAILED);
        }else
            System.out.println("Test " + strPASSED);
        lettere_pageFactory.Click_A.click();
        Thread.sleep(3000);

        // Qui stiamo testando la lettera C
        if (!lettere_pageFactory.Click_C.isEnabled()){
            System.out.println("Error: Test" + strFAILED);
        }else
            System.out.println("Test " + strPASSED);
        lettere_pageFactory.Click_C.click();
        Thread.sleep(3000);

     // Qui stiamo testando la lettera D
        if (!lettere_pageFactory.Click_D.isEnabled()){
            System.out.println("Error: Test" + strFAILED);
        }else
            System.out.println("Test " + strPASSED);
        lettere_pageFactory.Click_D.click();
        Thread.sleep(3000);

        // Qui stiamo testando la lettera E
        if (!lettere_pageFactory.Click_E.isEnabled()){
            System.out.println("Error: Test" + strFAILED);
        }else
            System.out.println("Test " + strPASSED);
        lettere_pageFactory.Click_E.click();
        Thread.sleep(3000);

        // Qui stiamo testando la lettera F
        if (!lettere_pageFactory.Click_F.isEnabled()){
            System.out.println("Error: Test" + strFAILED);
        }else
            System.out.println("Test " + strPASSED);
        lettere_pageFactory.Click_F.click();
        Thread.sleep(3000);

        // Qui stiamo testando la lettera G
        if (!lettere_pageFactory.Click_G.isEnabled()){
            System.out.println("Error: Test" + strFAILED);
        }else
            System.out.println("Test " + strPASSED);
        lettere_pageFactory.Click_G.click();
        Thread.sleep(3000);

        // Qui stiamo testando la lettera I
        if (!lettere_pageFactory.Click_I.isEnabled()){
            System.out.println("Error: Test" + strFAILED);
        }else
            System.out.println("Test " + strPASSED);
        lettere_pageFactory.Click_I.click();
        Thread.sleep(3000);

        // Qui stiamo testando la lettera L
        if (!lettere_pageFactory.Click_L.isEnabled()){
            System.out.println("Error: Test" + strFAILED);
        }else
            System.out.println("Test " + strPASSED);
        lettere_pageFactory.Click_L.click();
        Thread.sleep(3000);

        // Qui stiamo testando la lettera L
        if (!lettere_pageFactory.Click_O.isEnabled()){
            System.out.println("Error: Test" + strFAILED);
        }else
            System.out.println("Test " + strPASSED);
        lettere_pageFactory.Click_O.click();
        Thread.sleep(3000);

        // Qui stiamo testando la lettera L
        if (!lettere_pageFactory.Click_P.isEnabled()){
            System.out.println("Error: Test" + strFAILED);
        }else
            System.out.println("Test " + strPASSED);
        lettere_pageFactory.Click_P.click();
        Thread.sleep(3000);

        // Qui stiamo testando la lettera L
        if (!lettere_pageFactory.Click_R.isEnabled()){
            System.out.println("Error: Test" + strFAILED);
        }else
            System.out.println("Test " + strPASSED);
        lettere_pageFactory.Click_R.click();
        Thread.sleep(3000);

        // Qui stiamo testando la lettera L
        if (!lettere_pageFactory.Click_S.isEnabled()){
            System.out.println("Error: Test" + strFAILED);
        }else
            System.out.println("Test " + strPASSED);
        lettere_pageFactory.Click_S.click();
        Thread.sleep(3000);

        // Qui stiamo testando la lettera L
        if (!lettere_pageFactory.Click_T.isEnabled()){
            System.out.println("Error: Test" + strFAILED);
        }else
            System.out.println("Test " + strPASSED);
        lettere_pageFactory.Click_T.click();
        Thread.sleep(3000);

        // Qui stiamo testando la lettera L
        if (!lettere_pageFactory.Click_V.isEnabled()){
            System.out.println("Error: Test" + strFAILED);
        }else
            System.out.println("Test " + strPASSED);
        lettere_pageFactory.Click_V.click();
        Thread.sleep(3000);
        Driver.getDriver().close();
    }



}
