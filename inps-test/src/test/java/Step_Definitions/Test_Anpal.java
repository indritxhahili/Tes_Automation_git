package Step_Definitions;

import Pages.Cerca_PageAnpal;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.Driver;

public class Test_Anpal {

Cerca_PageAnpal cerca_pageAnpal= new Cerca_PageAnpal();
String strPassed = "PASSED";
String strFAILED = "FAILED";
    @Given("User deve aprire il browsers e seguire i step per Anpal")
    public void user_deve_aprire_il_browsers_e_seguire_i_step_per_anpal() throws InterruptedException {
        Driver.getDriver().get("https://www.anpal.gov.it/cerca-sportello");
       Thread.sleep(2000);
       cerca_pageAnpal.Search_Anpal.click();
       Thread.sleep(3000);
    }
    @Then("User deve andare sul la Pagina e seguire Anpal")
    public void user_deve_andare_sul_la_pagina_e_seguire_anpal() throws InterruptedException {

        if (!cerca_pageAnpal.Click_Nella_DropDowns.isEnabled()){
            System.out.println("Error : Test " + strFAILED);
        }else
            System.out.println("Test " + strPassed);
          cerca_pageAnpal.Click_Nella_DropDowns.click();

          cerca_pageAnpal.Click_Nome.click();
        cerca_pageAnpal.Click_Nome.click();
        Thread.sleep(2000);


        cerca_pageAnpal.Search_Anpal.click();

        Thread.sleep(2000);
        Driver.getDriver().close();
    }
    @Then("User deve capire e seguire tutti li step che ci servono A Anpal")
    public void user_deve_capire_e_seguire_tutti_li_step_che_ci_servono_a_anpal() {

    }
    @Then("User deve clicare nella home page e cercare un caratero speziale per Anpal")
    public void user_deve_clicare_nella_home_page_e_cercare_un_caratero_speziale_per_anpal() {

    }

}
