Feature: Tema azimut

  Scenario: Testarea functiinalitatii de conectare cu date incorecte
    Given Deschidere pagina index
    And Email id: "ALEX"
    And Click Enter si navigheaza inapoi
    When Click pe Sign In
    Then Introducere email: "alex@email.ro"
    Then Introducere parola: "123456"
    Then Apasare ENTER
    And Click pe butonul Skip Sign In


  Scenario: Testarea functionalitatii de inregistrare utilizator cu date incorecte
    Given Deschidere pagina Register
    Then Introducere First Name: "Alexandru"
    Then Introducere Last Name: "Capriceru"
    Then Introducere adresa: "Bucuresti"
    Then Introducere email gresit: "alex@email.ro"
    Then Numar telefon: "0720000000"
    And Click pe Gender si Hobbies
    Then Languages
    Then Skills
    Then Selectarea Country random
    Then Date of Birth
    Then Parola: "123456"
    Then Confirma parola: "123456"
    Then Confirm


  Scenario: Test meniu SwitchTo
    Given Deschidere pagina SwitchTo Alerts
    When Click pe butonul Display an Alert Box
    Then Alert with ok and cancel
    And Textbox Alert: "Alexandru Capriceru"
    Then Switch to Windows
    Then CLick to _blank
    Then Open New Separate Windows
    Then Open Seperate Multiple Windows
    Then First Frame


