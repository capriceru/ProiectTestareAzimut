Feature:
  Testarea categoriei Imobiliare

  Scenario:     Aplicarea filtrelor disponibile si selectarea unui anunt
    Given       "https://www.olx.ro/imobiliare/birouri-spatii-comerciale/"
    And         Acceptare cookie-uri
    Then        Click pe Doar cu poze
    Then        Introducere filtru Pret De la "20000"
    Then        Introducere filtru Pret Pana la "450000"
    Then        Introducere Suprafata utila m² de la "300"
    Then        Introducere Suprafata utila m² pana la "800"
    Then        Click pe Vanzare-Inchriere
    Then        Selectare Vanzare
    Then        Alegerea monedei Lei
    And         Folosirea scroll-ului pentru vizualizarea anunturilor
    Then        Selectare anunt
    Then        Click glisare foto anunt


