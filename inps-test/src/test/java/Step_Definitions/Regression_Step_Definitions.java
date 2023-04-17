package Step_Definitions;

import Pages.Regression_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import utilities.ConfigurationReader;
import utilities.Driver;
public class Regression_Step_Definitions {
    String strFAILED = "FAILED";
    String strPASSED = "PASSED";
    Regression_Page regression_page = new Regression_Page();
    @Given("User deve aprire home page")
    public void user_deve_aprire_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("INPSURL.IN.LAVORAZIONE"));
        regression_page.AccetaTutto.click();
    }
    @Then("User deve clicare nella ricerca")
    public void user_deve_clicare_nella_ricerca() throws InterruptedException {
        // regression_page.Search_Carateri_Speziali.click();
        Thread.sleep(4000);
        regression_page.Search_Carateri_Speziali.sendKeys("//Pensione");
        regression_page.Click_Nella_Ricerca.click();
        Thread.sleep(4000);
    }
    @Then("User deve testare il metodo di slash e spazio")
    public void user_deve_testare_il_metodo_di_slash_e_spazio() {
        String str = "  Pensione";
        if (!regression_page.Risposta_Della_Ricerca.getText().matches(str)) {
            System.out.println("Error : Something went wrong , La RICERCA NON FUNZIONA CON CARATERI SPEZIALI!!");
            // Driver.getDriver().close();
        } else
            System.out.println("E Andata tutto bene , Next Step");
    }
    @When("User deve navigare Pensione e Previdenza")
    public void user_deve_navigare_pensione_e_previdenza() throws InterruptedException {
        regression_page.User_Click_Pensione_Previdenza.click();
        Thread.sleep(4000);
        if (!regression_page.User_Click_Pensione_Previdenza.isEnabled()) {
            System.out.println("Error : When CLICK PENSIONE E PREVIDENZA ");

        } else System.out.println("PENSIONE E PREVIDENZA FUNZIONA E CORRETTO");
    }
    @Then("User deve clicare e verificare Esplora Pensione e Previdenza")
    public void user_deve_clicare_e_verificare_esplora_pensione_e_previdenza() throws InterruptedException {

        regression_page.Click_Esplora_Pensione_Previdenza.click();
        Thread.sleep(4000);
    }
    @Then("User deve clicare nella verificare Esplora Pensione e Previdenza Vedi tutti")
    public void user_deve_clicare_nella_verificare_esplora_pensione_e_previdenza_vedi_tutti() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,1500)", "");
        Thread.sleep(3000);
        regression_page.Click_Vedi_Tutti.click();
        Thread.sleep(2000);
    }
    @Then("User deve clicare e verificare Approfondisci")
    public void user_deve_clicare_e_verificare_approfondisci() throws InterruptedException {
        regression_page.Click_Approfondisci.click();
        Thread.sleep(4000);
        // if(!regression_page.Click_Approfondisci.getText().contains("Approfondisci")){
        //  System.out.println("Error: QUALCOSA E ANDATA MALE CON LA RICERCA DI \"Approfondisci\" ");
        // }else
        // System.out.println("Approfondisci   FUNZIONA CORRETTO  (:");
    }
    @Then("User deve aprire e clicare Utilizza il servizio")
    public void user_deve_aprire_e_clicare_utilizza_il_servizio() throws InterruptedException {
        regression_page.Click_Utilizza_Servizio.click();
        Thread.sleep(4000);
        // if (!regression_page.Click_Utilizza_Servizio.isEnabled()){
        //   System.out.println("Error: SOMETHING WENT WORNG CON UTILIZZA IL SERVIZIO");
        // }else
        //   System.out.println("IL SERVIZIO E ANDATO TUTTO BENE ");
        Driver.getDriver().navigate().back();

        Thread.sleep(4000);
        if (!regression_page.Click_Lavoro.isEnabled()) {
            System.out.println("Error: Lavoro is not Enable");
            Driver.getDriver().close();
        } else
            regression_page.Click_Lavoro.click();
        System.out.println("Lavoro is Enable");
        Thread.sleep(4000);

        if (!regression_page.Click_Esplora_Lavoro.isEnabled()) {
            System.out.println("Error: Esplora Lavoro Is not Enable  ");
        } else
            System.out.println("Esplora Lavoro Is Enable");
        regression_page.Click_Esplora_Lavoro.click();
        Thread.sleep(4000);
    }
    @Given("User deve Clicare di nuova la Pagina Pensione e Previdenza")
    public void user_deve_clicare_di_nuova_la_pagina_pensione_e_previdenza() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,1500)", "");
        Thread.sleep(4000);
        regression_page.Click_Vedi_Tutti_Lavoro.click();
    }
    @Then("User si deve navigare nella Pagina Lavoro")
    public void user_si_deve_navigare_nella_pagina_lavoro() throws InterruptedException {
        if (!regression_page.Click_Approfondisci_Lavoro.isEnabled()) {
            System.out.println("Error : Nella Navigazione");
        } else
            System.out.println("Test Passed");
        regression_page.Click_Approfondisci_Lavoro.click();
        Thread.sleep(3000);
    }
    @Then("User deve clicare e verificare Esplora Lavoro")
    public void user_deve_clicare_e_verificare_esplora_lavoro() throws InterruptedException {
        // String strFAILED = "TEST FAILED";
       // String strPASSED = "TEST PASSED";
        if (!regression_page.Click_Utilizza_Servizio_Lavoro.isEnabled()) {
            System.out.println("Error: Nella Ricerca Servizio di Lavoro! " + strFAILED);
        } else
            regression_page.Click_Utilizza_Servizio_Lavoro.click();
        System.out.println("TEST PASSED SUCCESFULLY! " + strPASSED);
        Thread.sleep(3000);
    }
    @Then("User deve clicare Lavoro Vedi tutti")
    public void user_deve_clicare_lavoro_vedi_tutti() throws InterruptedException {
        Driver.getDriver().navigate().back();

        Thread.sleep(3000);
        regression_page.Click_Sostegni_Sussidi.click();
    }
    @Then("User deve clicare nella Pagina Approfondisci")
    public void user_deve_clicare_nella_pagina_approfondisci() throws InterruptedException {
        Thread.sleep(2000);
        regression_page.Click_Sostegni_Sussidi_E_Indenntita.click();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,1500)", "");
        Thread.sleep(3000);
    }
    @Then("User deve verificare Utilizza il servizio")
    public void user_deve_verificare_utilizza_il_servizio() throws InterruptedException {
        // String strFAILED = "TEST FAILED";
        //String strPASSED = "TEST PASSED";
        if (!regression_page.Vedi_Tutti_Click_Sostegni_Sussidi.isEnabled()) {
            System.err.println("Error: Click Tutti is not Enable " + strFAILED);
        } else
            regression_page.Vedi_Tutti_Click_Sostegni_Sussidi.click();
        System.out.println("Click Tutti Is Enable " + strPASSED);
        Thread.sleep(2000);
        regression_page.Click_Approfondisci_Sostegni_Sussidi.click();
        Thread.sleep(2000);
    }
    @Given("User deve Tornare nella pagina Home Page")
    public void user_deve_tornare_nella_pagina_home_page() throws InterruptedException {
        //  String strFAILED = "TEST FAILED";
        //  String strPASSED = "TEST PASSED";
        if (!regression_page.Click_Utilizza_Servizio_Sostegni_Sussidi.isEnabled()) {

            System.out.println("ERROR: CLICK UTILIZZA IL SERVIZIO NON FUNZIONA " + strFAILED);
        } else
            regression_page.Click_Utilizza_Servizio_Sostegni_Sussidi.click();
        System.out.println("Click Utilizza Il Servizio E Andata Tutto Bene " + strPASSED);
        Thread.sleep(2000);
    }
    @When("User deve Verificaree e clicare Approfondisci")
    public void user_deve_verificaree_e_clicare_approfondisci() {
        regression_page.Utilizza_Last_Servizio.click();
    }
    @When("User deve verificare e clicare Utilizza il servizio")
    public void user_deve_verificare_e_clicare_utilizza_il_servizio() throws InterruptedException {
        regression_page.Click_Imprese_E_Liberi_Professionisti_Back.click();
        Thread.sleep(3000);
    }
    // io.cucumber.junit.UndefinedStepException: The step 'User deve tornare nella Pagina Home Page' and 4 other step(s) are undefined.
    // You can implement these steps using the snippet(s) below:

    @Given("User deve tornare nella Pagina Home Page")
    public void user_deve_tornare_nella_pagina_home_pages() {
        regression_page.Click_Imprese_E_Liberi_Professionisti.click();
    }

    @Then("User deve clicare prese e Liberi Professionisti")
    public void user_deve_clicare_prese_e_liberi_professionisti() throws InterruptedException {
        // String strFAILED = "TEST FAILED";
        //  String strPASSED = "TEST PASSED";
        if (!regression_page.Click_Imprese_E_Liberi_Professionisti.isEnabled()) {
            System.out.println("Esplora_Imprese_E_Liberi_Professionisti IS NOT ENABLE " + strFAILED);
        } else
            //  regression_page.Esplora_Imprese_E_Liberi_Professionisti.click();
            System.out.println("Esplora_Imprese_E_Liberi_Professionisti " + strPASSED);
        Thread.sleep(3000);
    }
    @Then("User deve Clicare e Verificare prese e Liberi Professionisti Vedi Tutti")
    public void user_deve_clicare_e_verificare_prese_e_liberi_professionisti_vedi_tutti() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,1500)", "");
        regression_page.Esplora_Imprese_E_Liberi_Professionisti_VediTutti.click();
        Thread.sleep(2000);
    }
    @Then("User deve Aprire la pagina di Approfondisci")
    public void user_deve_aprire_la_pagina_di_approfondisci() throws InterruptedException {
        //  String strFAILED = "TEST FAILED";
        // String strPASSED = "TEST PASSED";
        if (!regression_page.Approfondisci_Accesso_AI_Servizi.isEnabled()) {
            System.out.println("Approfondisci Accesso ai servizi E Andata Male !! " + strFAILED);
        } else
            regression_page.Approfondisci_Accesso_AI_Servizi.click();
        System.out.println("Approfondisci Accesso ai servizi PASSED " + strPASSED);
        Thread.sleep(2000);
    }
    @Then("User deve Clicare Utilizza il servizio")
    public void user_deve_clicare_utilizza_il_servizio() throws InterruptedException {
        //   String strFAILED = "TEST FAILED";
        //   String strPASSED = "TEST PASSED";

        if (!regression_page.Pensione_E_Previdenza_Last_Back.isEnabled()) {
            System.out.println(strFAILED);
        } else
            System.out.println(strPASSED);
        regression_page.Pensione_E_Previdenza_Last_Back.click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,3500)", "");
        Thread.sleep(2000);
    }
    // io.cucumber.junit.UndefinedStepException: The step 'User deve clicare nella Pagina di Software e clicare   Per i CAF ed i liberi professionisti' and 1 other step(s) are undefined.
    //  You can implement these steps using the snippet(s) below:
    @Given("User deve clicare nella Pagina di Software e clicare   Per i CAF ed i liberi professionisti")
    public void user_deve_clicare_nella_pagina_di_software_e_clicare_per_i_caf_ed_i_liberi_professionisti() throws InterruptedException {
        regression_page.Per_CAF_Liberi_Prefessionisti.click();
        Thread.sleep(2000);
        regression_page.Per_CAF_Liberi_Prefessionisti_DropDowns.click();
        Thread.sleep(2000);
        regression_page.Per_CAF_Liberi_Prefessionisti_Select.click();
        Thread.sleep(2000);
        regression_page.Sottotipologia_click.click();
        Thread.sleep(2000);
        regression_page.Click_Modeli_Software.click();
        Thread.sleep(2000);
        regression_page.Click_Anno.click();
        Thread.sleep(2000);
        regression_page.SelectAnno.click();
        Thread.sleep(2000);
        regression_page.ApplicaFiltri.click();
        Thread.sleep(2000);
    }
    @Given("User deve clicare complilare e fare un Inserimento puoi Applica e Cancella")
    public void user_deve_clicare_complilare_e_fare_un_inserimento_puoi_applica_e_cancella() {
        //  String strFAILED = "TEST FAILED";
        //  String strPASSED = "TEST PASSED";
        if (!regression_page.Cancella_Filtri.isEnabled()) {
            System.out.println("Cancella Filtri 1  " + strFAILED);
        } else
            System.out.println("Cancella Filtri 1  " + strPASSED);
        regression_page.Cancella_Filtri.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //  io.cucumber.junit.UndefinedStepException: The step 'User deve clicare nella Pagina Per i medici certificatori e Medici di Famiglia' and 1 other step(s) are undefined.
    //  You can implement these steps using the snippet(s) below:
    @Given("User deve clicare nella Pagina Per i medici certificatori e Medici di Famiglia")
    public void user_deve_clicare_nella_pagina_per_i_medici_certificatori_e_medici_di_famiglia() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,2500)", "");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        regression_page.Medici_Certificatori_E_Medici_Di_Famiglia.click();
        Thread.sleep(2000);
        regression_page.Medici_Certificatori_E_Medici_Di_Famiglia_DropDowns.click();
        Thread.sleep(2000);
        regression_page.Medici_Certificatori_E_Medici_Select.click();
        Thread.sleep(2000);
        regression_page.Sottotipologia_click_Medici_Certificatori.click();
        Thread.sleep(2000);
        regression_page.Select_Sottotipologia.click();
        Thread.sleep(2000);
        regression_page.AnnoDrop_Downs.click();
        Thread.sleep(2000);
        regression_page.Select_Year_Medici_Certificatori.click();
        Thread.sleep(2000);
        regression_page.Applica_Filtri_Medici_Certificatori.click();
        Thread.sleep(2000);
        regression_page.CancellaFiltri_Medici.click();
        Thread.sleep(2000);
    }
    @Given("User deve Aprire la Pagina e fare un Inserimento puoi fare una Cancellazione")
    public void user_deve_aprire_la_pagina_e_fare_un_inserimento_puoi_fare_una_cancellazione() {
        //  String strFAILED = "TEST FAILED";
        //  String strPASSED = "TEST PASSED";
        if (!regression_page.CancellaFiltri_Medici.isEnabled()) {
            System.out.println("Cancella Filtri Medici " + strFAILED);
        } else
            System.out.println("Cancella Filtri Medici " + strPASSED);
        regression_page.CancellaFiltri_Medici.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //  Driver.getDriver().close();
    }
    // io.cucumber.junit.UndefinedStepException: The step 'User deve clicare Per il cittadino' and 1 other step(s) are undefined.
    // You can implement these steps using the snippet(s) below:
    @Given("User deve clicare Per il cittadino")
    public void user_deve_clicare_per_il_cittadino() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,2500)", "");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        regression_page.Click_Per_I_Cittado.click();
        Thread.sleep(2000);
        regression_page.Topologia_Il_Cittadino.click();
        Thread.sleep(2000);
        regression_page.Select_On_Tipologia.click();
        Thread.sleep(2000);
        regression_page.ClickDropDowns_Sottotipologia.click();
        Thread.sleep(3000);
        regression_page.Select_Sottotipologia_Modelli.click();
        Thread.sleep(3000);
        regression_page.ClickYear_Cittadino_Sototipologia.click();
        Thread.sleep(3000);
        regression_page.Select_Cittadino_Sototipologia.click();
        Thread.sleep(2000);
        regression_page.ApplicaFiltri_Cittadino_Sototipologia.click();
        Thread.sleep(3000);
    }
    @Given("User deve Aprire la Pagina e fare un Inserimento puoi fare una Cancellazione ,puoi tornare nel Home Page")
    public void user_deve_aprire_la_pagina_e_fare_un_inserimento_puoi_fare_una_cancellazione_puoi_tornare_nel_home_page() {
        //   String strFAILED = "FAILED";
        //  String strPASSED = "PASSED";

        if (!regression_page.Click_Cancella_Filtri_Cittadino.isEnabled()) {
            System.out.println("CANCELLA FILTRI CITTADINO Error: " + strFAILED);
        } else
            System.out.println("CANCELLA FILTRI CITTADINO " + strPASSED);
        regression_page.Click_Cancella_Filtri_Cittadino.click();
    }
    // io.cucumber.junit.UndefinedStepException: The step 'User deve clicare Per il Per le aziende ed i Consulenti' and 1 other step(s) are undefined.
    // You can implement these steps using the snippet(s) below:

    @Given("User deve clicare Per il Per le aziende ed i Consulenti")
    public void user_deve_clicare_per_il_per_le_aziende_ed_i_consulenti() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,2500)", "");

        if (!regression_page.Aziende_Ed_I_Consulenti.isEnabled()){
            regression_page.Aziende_Ed_I_Consulenti.click();
            System.out.println("Aziende E Consulenti " + strFAILED);
    }else
        System.out.println("Aziende E Consulenti " + strPASSED);
        regression_page.Aziende_Ed_I_Consulenti.click();
        Thread.sleep(3000);
        regression_page.Aziende_Ed_I_Consulenti_Tipologia.click();
        Thread.sleep(2000);
        regression_page.Select_Tipologia_Consulenti_Tipologia.click();
        Thread.sleep(3000);
       regression_page.DropDowdns_Sottotipologia_Consulenti_Tipologia.click();
       Thread.sleep(3000);
       regression_page.DropDowns_Anno_Consulenti_Tipologia.click();
       Thread.sleep(3000);
       regression_page.Select_Year_Consulenti_Tipologia.click();
       Thread.sleep(3000);
       regression_page.Applica_Filtri_Consulenti_Tipologia.click();
       Thread.sleep(3000);
}
    @Given("User deve Aprire la Pagina di Per le aziende ed i Consulenti e fare un Inserimento puoi fare una Cancellazione ,puoi tornare nel Home Page")
    public void user_deve_aprire_la_pagina_di_per_le_aziende_ed_i_consulenti_e_fare_un_inserimento_puoi_fare_una_cancellazione_puoi_tornare_nel_home_page() {
        if (!regression_page.Cancella_Consulenti_Tipologia.isEnabled()){
            System.out.println("Cancella Filtri Per le aziende ed i Consulenti " + strFAILED);

        }else
            System.out.println("Cancella Filtri Per le aziende ed i Consulenti " + strPASSED);
        regression_page.Cancella_Consulenti_Tipologia.click();
        System.out.println("All Step Passed With Success!!");
        System.out.println("Congrats");
        Driver.getDriver().close();
    }

}