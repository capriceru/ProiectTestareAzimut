Feature:
  Testarea inregistrarii unui cont
  Utilizatorul introduce un e-mail fictiv, dar cu parola corecta conform cerintelor site-ului

  Background:
    Given     Accesare Prima Pagina "https://www.olx.ro/"
    Then      Acceptare cookie-uri


  Scenario:   Inregistrare utilizator si extragerea textului din eroarea afisata
    When      Accesare "Contul tău"
    Then      Click pe Creează un cont
    Then      Introducere e-mail: "AlexTest@test.com"
    Then      Introducere parola: "AzimutVision123"
    And       Click pe: Sunt de acord ci folosirea mijloacelor de comunicare
    And       Click pe butonul: Creează un cont
    And       Extragere eroare text