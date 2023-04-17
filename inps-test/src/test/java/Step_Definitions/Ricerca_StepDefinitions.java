package Step_Definitions;

import Pages.Ricerca_PageFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Ricerca_StepDefinitions {

    Ricerca_PageFactory ricerca_pageFactory = new Ricerca_PageFactory();

    @When("user deve aprire home page")
    public void user_deve_aprire_home_page() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("INPSURL.IN.LAVORAZIONE"));

        ricerca_pageFactory.AccetaTutto.click();
        Thread.sleep(3000);
    }

    @Then("user devere cercare un nome valido")
    public void user_devere_cercare_un_nome_valido() throws InterruptedException {

          ricerca_pageFactory.Ricerca.click();

          Thread.sleep(2000);


       String Output = ricerca_pageFactory.ClickNellaRicerca.getText();

        ricerca_pageFactory.Ricerca.sendKeys("Pe");
        ricerca_pageFactory.ClickNellaRicerca.click();
        Thread.sleep(3000);
        System.out.println(ricerca_pageFactory.ClickNellaRicerca.getText());
        System.out.println(ricerca_pageFactory.ClickNellaRicerca.getLocation());

        System.out.println(ricerca_pageFactory.Ricerca.getText());

        Driver.getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        if (ricerca_pageFactory.ClickNellaRicerca.equals(Output)){
            System.out.println("La Ricerca,  puoi cercare anche 2 charatteri ");


        }else System.out.println(ricerca_pageFactory.GetOutputNellaRicerca.getText());

        Thread.sleep(3000);

        String ActuallText = ricerca_pageFactory.GetOutputNellaRicerca.getText();
        String ExpectedText = "È necessario digitare almeno 3 caratteri.";
       Assert.assertEquals(ActuallText,ExpectedText);

       if(ActuallText.matches(ExpectedText)){
           System.out.println("Test Passed (:");
           Driver.getDriver().close();
       }else
           System.err.println("Something went wrong, qualcosa e andata male!!");

    }


/*
    @Then("user deve fare Assert Equal se questo nome esiste nella Ricerca")
    public void user_deve_fare_assert_equal_se_questo_nome_esiste_nella_ricerca() {

        // ricerca_pageFactory.Ricerca.getText();
         ricerca_pageFactory.Ricerca.clear();
        if (ricerca_pageFactory.Ricerca.isDisplayed()) {
            ricerca_pageFactory.Ricerca.click();
            System.out.println("LA RICERCA E ANDATA IN BUON FINE CONGRTATS!!");
        } else
            System.out.println("La Ricerca non e valida , prova di nuovo.");


 */

    }
