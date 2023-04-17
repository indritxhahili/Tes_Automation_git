@RicercaTestNegativo
Feature: Qui dobbiamo Cercare un nome che non e valido

Scenario: Questo e un test negativo nella Ricerca

Given User deve aprire la pagina Home Page
Then User deve clicare nella Ricerca
And User deve scrivere un nome non valido
Then User deve Fare Assertions se questo nome esiste !!
