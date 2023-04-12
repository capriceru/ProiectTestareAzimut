Feature: Site-ul de anunturi oLx.ro

  Background:
    Given     Accesare Prima Pagina OLX
    Then      Acceptare cookie-uri
    And       Inchidere anuntul: Vreau RCA!


  Scenario:   Promovare oLx Business
    When      Click pe -Oferi servicii? Pune anunț!-
    Then      Click pe -Acceptare Cookies-
    Then      Click pe -Află mai multe-
    Then      Click pe -Video cu promovare-
    And       Select iframe video
    And       Click pe Pornire clip promovare