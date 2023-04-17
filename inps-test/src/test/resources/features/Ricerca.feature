@Ricerca
Feature: dobbiamo cercare un nome sulla Ricerca

Scenario: qui e il primo step che User cerca qualcosa valida
When user deve aprire home page
Then user devere cercare un nome valido
# And user deve fare Assert Equal se questo nome esiste nella Ricerca