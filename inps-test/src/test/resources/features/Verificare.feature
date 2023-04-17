Feature: Verificare funzionamento Scarica Stampa Condividi: premere pulsante Stampa


    @Verificare
     Scenario:  Navigazione pagina dettaglio Nota Operativa Verifica presenza
      delle seguenti proprieta Titolo Oggetto Mittenti Destinatari Sommario
      Testo completo Allegati
     Given User deve Collegarsi all'indirizzo https://www.wmo.inps.it/da Browser Edge
     Then User deve Accesso al portale pubblico
     And User  deve Premere icona hamburger menu per accesso alla sezione di riferimento
     Then User Apertura menu
     And User deve Navigazione menu: selezionare la voce INPS Comunica
     Then User deve Apertura menu INPS Comunica
      When user Navigazione menu INPS Comunica: selezionare la voce Atti
      And User Apertura menu Atti
       Then User Navigazione menu Atti: selezionare la voce Circolari Messaggi e Normativa
       When User Accesso alla sezione Circolari Messaggi e Normativa. Visualizzazione: Breadcrumb menu sezione Filtra Ordinamento elenco Elenco Paginazione
       And User Navigazione Breadcrumb menu: selezionare la voce Home
       Then User Ritorno alla pagina del portale pubblico
       And User Navigazione Breadcrumb menu: selezionare la voce Atti
       Then User Ritorno alla pagina Atti
       And User Navigazione Breadcrumb menu: verificare presenza della voce non selezionabile Circolari Messaggi e Normativa
       Then User Verifica effettuata


