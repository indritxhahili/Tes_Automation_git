package Step_Definitions;

import Pages.TestNegativoNellaRicerca_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class TestNegativoNellaRicerca_Step_Definitons {

TestNegativoNellaRicerca_Page testNegativoNellaRicerca_page = new TestNegativoNellaRicerca_Page();
    @Given("User deve aprire la pagina Home Page")
    public void user_deve_aprire_la_pagina_home_page() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("INPSURL.IN.LAVORAZIONE"));

        Thread.sleep(2000);
        testNegativoNellaRicerca_page.AccetaTutto.click();


    }
    @Then("User deve clicare nella Ricerca")
    public void user_deve_clicare_nella_ricerca() throws InterruptedException {
        Thread.sleep(2000);
       if( testNegativoNellaRicerca_page.Ricerca.isEnabled()){
           testNegativoNellaRicerca_page.Ricerca.click();
       }else
           System.out.println(" Qualcosa Male");
    Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Then("User deve scrivere un nome non valido")
    public void user_deve_scrivere_un_nome_non_valido() throws InterruptedException {
        Thread.sleep(2000);
        if(testNegativoNellaRicerca_page.Ricerca.isDisplayed()){
            testNegativoNellaRicerca_page.Ricerca.sendKeys("Circolare numero 85 del 26-4-2028");
            System.out.println("La Ricerca Funziona ,Pero questo nome non esiste ");
            Thread.sleep(2000);
            Driver.getDriver().close();
        }else
            System.out.println("La ricerca e anadata male");

    }
    @Then("User deve Fare Assertions se questo nome esiste !!")
    public void user_deve_fare_assertions_se_questo_nome_esiste() {

    }
}
