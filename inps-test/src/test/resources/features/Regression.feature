
@Regression
Feature: Qui dobbiamo fare un Script Automatico di tutte le pagine di INPS

Scenario: Dobbiamo navigare nelle tutte le pagine del home page
Given User deve aprire home page
Then User deve clicare nella ricerca
And User deve testare il metodo di slash e spazio
When User deve navigare Pensione e Previdenza
Then User deve clicare e verificare Esplora Pensione e Previdenza
And User deve clicare nella verificare Esplora Pensione e Previdenza Vedi tutti
And User deve clicare e verificare Approfondisci
Then User deve aprire e clicare Utilizza il servizio

Scenario: User deve tornare nel Home Page e Navigare nella Pagina di Lavoro e verificare tutti step possibili
Given User deve Clicare di nuova la Pagina Pensione e Previdenza
Then User si deve navigare nella Pagina Lavoro
And User deve clicare e verificare Esplora Lavoro
And User deve clicare Lavoro Vedi tutti
Then User deve clicare nella Pagina Approfondisci
And User deve verificare Utilizza il servizio

Scenario: User deve tornare Home Page e Navigare nella Pagina di Sostegni Sussidi e Indennità e verificare tutti step possibili
Given User deve Tornare nella pagina Home Page
When User deve Verificaree e clicare Approfondisci
And User deve verificare e clicare Utilizza il servizio

Scenario: User deve tornare Home Page e Navigare nella Pagina di Imprese e Liberi Professionisti e verificare tutti step possibili
Then User deve clicare prese e Liberi Professionisti
And User deve Clicare e Verificare prese e Liberi Professionisti Vedi Tutti
And User deve Aprire la pagina di Approfondisci
Then User deve Clicare Utilizza il servizio

Scenario: User deve tornare nella Pagina Home page, deve scroll down fino alla fine
Given User deve clicare nella Pagina di Software e clicare   Per i CAF ed i liberi professionisti
And User deve clicare complilare e fare un Inserimento puoi Applica e Cancella

Scenario: User deve navigare nella Pagina di Software e clicare Per i medici certificatori e Medici di Famiglia
Given User deve clicare nella Pagina Per i medici certificatori e Medici di Famiglia
And User deve Aprire la Pagina e fare un Inserimento puoi fare una Cancellazione

Scenario: User deve User deve navigare nella Pagina di Software e clicare Per il cittadino
Given User deve clicare Per il cittadino
And User deve Aprire la Pagina e fare un Inserimento puoi fare una Cancellazione ,puoi tornare nel Home Page


Scenario: User deve User deve navigare nella Pagina di Software e clicare Per il Per le aziende ed i Consulenti
Given User deve clicare Per il Per le aziende ed i Consulenti
And User deve Aprire la Pagina di Per le aziende ed i Consulenti e fare un Inserimento puoi fare una Cancellazione ,puoi tornare nel Home Page