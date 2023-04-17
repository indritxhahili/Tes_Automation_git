
Feature: Dobbiamo fare un semplice sul la pagina di INPS

    @Notizie
     Scenario: Prima User deve andare nella Home Page
     Given User deve aprire e clicare AccettaTutti
     Then User deve andare sul la Pagina di INPS
     And User deve capire e seguire tutti li step che ci servono nella Pagina
     Then User deve clicare nella INPS Comunica
     And User deve Fare scroll down and clicare su Notizie
     Then User deve testare il dropdows
     And User deve vedere se tutto funziona nella tabela