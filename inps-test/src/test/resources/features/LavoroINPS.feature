@LavoroINPS
Feature: Qui dobbiamo automatizzare INPS , pero deve essere un step che ti porta nel ultimo servizio di Lavoro

Scenario: User deve clicare nelle tutte pagine una alla volta anche in modo sistemato
Given User deve aprire Home Page
Then User deve Clivare nel Lavoro
Then User deve clicare Esplora Lavoro
And User deve clicare Vedi Tutti
When User deve usare il metodo di JavaScript di fare  Scroll down
And User deve Clicare Carica Altri dieci Servizi