Feature: Site-ul de anunturi oLx.ro

  Background:
    Given     Accesare Prima Pagina OLX
    Then      Acceptare cookie-uri
    And       Inchidere anuntul: Vreau RCA!

  Scenario:   Inregistrarea unui utilizator cu credentiale incorecte si extragerea textului din eroarea afisata
    When      Click pe Contul tău
    Then      Click pe Creează un cont
    Then      Introducere e-mail: "AlexTest@test.com"
    Then      Insereaza parola: "Parola123"
    And       Click pe: Sunt de acord ci folosirea mijloacelor de comunicare
    And       Click pe butonul: Creează un cont
    And       Extragere eroare text

  Scenario:   Aplicarea filtrelor pentru cautarea anunturilor din categorie Imobiliare
    When      Selectarea zonei: "Bucuresti - Ilfov"
    Then      Click pe butonu: Cauta acum
    Then      Click pe alegerea categoriei
    Then      Aplicare filtru: Imobiliare
    And       Aplicare filtru: Pret De la "100.000"
    And       Aplicare filtru: Pret Pana la "300.000"
    And       Folosirea scroll-ului pentru vizualizarea anunturilor

  Scenario:   Cautare unui produs in bara de Cautare cu ajutorul Cagoriilor principale
    When      Selectarea categoriei de: "Auto, moto si ambarcatiuni"
    Then      Click pe subcategoria: "Autoturisme"
    Then      Introducerea "Lamborghini Urus" in bara de cautare
    And       Click pe butonul: Căutare
    And       Folosirea scroll-ului pentru vizualizarea anunturilor



  #In lucru
  Scenario: Olx servicii
    When Click pe servicii
    Then click pe afla mai multe
    Then click pe video
    Then select iframe video
    Then play video

  Scenario: Autentificare cu credentiale valide si schimbarea datelor facturarii
    When Click pe Contul tău
    Then Introducere email valid: "capriceru90@gmail.com"
    Then Introducere parola valida: "Parol@123"
    Then Click pe Intră în cont


#        Then Setari
#        Then Date de facturare
    Then Schimba datele facturii
#        Then Adaugare date