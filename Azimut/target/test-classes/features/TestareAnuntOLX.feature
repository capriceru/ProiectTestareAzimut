Feature:
  Vizualizarea anuntului fara autentificare, adagarea anuntului la Favorite, stergerea anuntului de la Favorite

  Background:
    Given     Adresa anuntului OLX
    And       Se accepta cookie-uri


  Scenario:   Se testeaza glisarea pozelor din anunt
    Then      Click glisare poze anunt
    And       Folosirea scroll-ului pentru vizualizare Descriere anunt

  Scenario:
    Then      Suna Vanzatorul

  Scenario:   Se testeaza adaugarea anuntului la Favorite si stergerea lui de la Favorite
    Then      Se adauga anunt la Favorite
    Then      Click pe butonul Favorite
    And       Stergere anunt de la Favorite
    And       Confirmare sterge anunt de la Favorite





