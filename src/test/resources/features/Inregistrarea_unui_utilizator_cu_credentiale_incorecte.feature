Feature: Site-ul de anunturi oLx.ro

  Background:
    Given     Accesare Prima Pagina OLX
    Then      Acceptare cookie-uri
    And       Inchidere anuntul: Vreau RCA!


  Scenario:   Inregistrarea unui utilizator cu credentiale incorecte si extragerea textului din eroarea afisata
    When      Click pe Contul tău
    Then      Click pe Creează un cont
    Then      Introducere e-mail: "AlexTest@test.com"
    Then      Introducere parola: "Parola123"
    And       Click pe: Sunt de acord ci folosirea mijloacelor de comunicare
    And       Click pe butonul: Creează un cont
    And       Extragere eroare text