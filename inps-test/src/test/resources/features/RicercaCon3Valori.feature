@RicercaCon3Valori
Feature: Qui dobbiamo testare tutti 3 valori con scroll Down 20, 50 , 100

Scenario: Prima dobbiamo cercare un nome gia esistente nella ricerca e testarlo
Given User deve aprire Home Page e cercare
Then User deve clicare Nella Ricerca
And User deve clicra sendKey
When User deve scroll Down fino nella ultima riga e vedere i 3 valori
And User deve applicare e verificare tutti 3 valori