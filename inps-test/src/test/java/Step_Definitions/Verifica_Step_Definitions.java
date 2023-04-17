package Step_Definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Verifica_Step_Definitions {

    @Given("User deve Collegarsi all'indirizzo https:\\/\\/www.wmo.inps.it\\/da Browser Edge")
    public void user_deve_collegarsi_all_indirizzo_https_www_wmo_inps_it_da_browser_edge() {
        Driver.getDriver().get(ConfigurationReader.getProperty("INPSURL.IN.LAVORAZIONE"));

    }
    @Then("User deve Accesso al portale pubblico")
    public void user_deve_accesso_al_portale_pubblico() {

    }
    @Then("User  deve Premere icona hamburger menu per accesso alla sezione di riferimento")
    public void user_deve_premere_icona_hamburger_menu_per_accesso_alla_sezione_di_riferimento() {

    }
    @Then("User Apertura menu")
    public void user_apertura_menu() {

    }
    @Then("User deve Navigazione menu: selezionare la voce INPS Comunica")
    public void user_deve_navigazione_menu_selezionare_la_voce_inps_comunica() {

    }
    @Then("User deve Apertura menu INPS Comunica")
    public void user_deve_apertura_menu_inps_comunica() {

    }
    @When("user Navigazione menu INPS Comunica: selezionare la voce Atti")
    public void user_navigazione_menu_inps_comunica_selezionare_la_voce_atti() {

    }
    @When("User Apertura menu Atti")
    public void user_apertura_menu_atti() {

    }
    @Then("User Navigazione menu Atti: selezionare la voce Circolari Messaggi e Normativa")
    public void user_navigazione_menu_atti_selezionare_la_voce_circolari_messaggi_e_normativa() {

    }
    @When("User Accesso alla sezione Circolari Messaggi e Normativa. Visualizzazione: Breadcrumb menu sezione Filtra Ordinamento elenco Elenco Paginazione")
    public void user_accesso_alla_sezione_circolari_messaggi_e_normativa_visualizzazione_breadcrumb_menu_sezione_filtra_ordinamento_elenco_elenco_paginazione() {

    }
    @When("User Navigazione Breadcrumb menu: selezionare la voce Home")
    public void user_navigazione_breadcrumb_menu_selezionare_la_voce_home() {
    }
    @Then("User Ritorno alla pagina del portale pubblico")
    public void user_ritorno_alla_pagina_del_portale_pubblico() {

    }
    @Then("User Navigazione Breadcrumb menu: selezionare la voce Atti")
    public void user_navigazione_breadcrumb_menu_selezionare_la_voce_atti() {


    }
    @Then("User Ritorno alla pagina Atti")
    public void user_ritorno_alla_pagina_atti() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("User Navigazione Breadcrumb menu: verificare presenza della voce non selezionabile Circolari Messaggi e Normativa")
    public void user_navigazione_breadcrumb_menu_verificare_presenza_della_voce_non_selezionabile_circolari_messaggi_e_normativa() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("User Verifica effettuata")
    public void user_verifica_effettuata() {

    }

}
