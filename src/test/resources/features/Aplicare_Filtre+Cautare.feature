Feature:
  Testarea functionalitatii de cautare
  Utilizatorul cauta anunturi cu ajutorul filtrelor pe care le ofera site-ul

  Background:
    Given     Accesare Prima Pagina "https://www.olx.ro/"
    Then      Acceptare cookie-uri
#    And       Inchidere anuntul: Află mai multe


  Scenario:   Aplicarea filtrelor pentru cautarea anunturilor din categoria Imobiliare
    When      Selectarea zonei: "Bucuresti - Ilfov"
    Then      Click pe butonu: Cauta acum
    Then      Click pe alegerea categoriei
    Then      Aplicare filtru: Imobiliare
    And       Aplicare filtru: Pret De la "300.000"
    And       Aplicare filtru: Pret Pana la "300.000"
    And       Folosirea scroll-ului pentru vizualizarea anunturilor

  Scenario:   Cautare unui produs in bara de Cautare cu ajutorul Categoriilor principale
    When      Selectarea categoriei de: "Auto, moto si ambarcatiuni"
#    Then      Click pe subcategoria: "Autoturisme"
    Then      Introducerea "Lamborghini Urus" in bara de cautare
    And       Click pe butonul: Căutare
    And       Folosirea scroll-ului pentru vizualizarea anunturilor








