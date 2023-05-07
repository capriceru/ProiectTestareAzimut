Feature:
  Utilizatorul vizualizeaza anuntul pe site-ul oLx fara sa fie autentificat

  Background:
    Given     Adresa anuntului OLX
    And       Se accepta cookie-uri


  Scenario:   Se testeaza glisarea fotografiilor din anunt si vizualizarea descrierii
    Then      Click glisare foto anunt
    And       Folosirea scroll-ului pentru vizualizare Descriere anunt

  Scenario:   Se testeaza adaugarea anuntului la Favorite si stergerea lui de la Favorite
    Then      Se adauga anunt la Favorite
    Then      Click pe butonul Favorite
    And       Stergere anunt de la Favorite
    And       Confirmare sterge anunt de la Favorite





