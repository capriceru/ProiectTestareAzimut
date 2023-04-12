Feature: Azimut Demo page

  Scenario: Apasare buton login
    Given Open Azimut "Index" page
    But I enter email "adresa de email"
    And I click the Login button

  ###############     ALERTS SECTION

  ########            Alert with OK

  Scenario: Alerts page OK Tab section
    Given Open Azimut "Alerts" page
    Then Select section "OKTab"
    And Click on section "OKTab" button
    And Accept alert

  #######              Alert with OK & Cancel

  Scenario: Alerts page CancelTab section dismiss
    Given Open Azimut "Alerts" page
    Then Select section "CancelTab"
    And Click on section "CancelTab" button
    And Cancel alert and read confirmation text

  Scenario: Alerts page CancelTab section accept
    Given Open Azimut "Alerts" page
    Then Select section "CancelTab"
    And Click on section "CancelTab" button
    And Accept alert and read confirmation text

  #######               Alert with Textbox

  Scenario: Alerts page Textbox section accept
    Given Open Azimut "Alerts" page
    Then Select section "Textbox"
    And Click on section "Textbox" button
    And Accept alert and add confirmation text "Am acceptat alerta"

    Scenario: Alerts page Textbox section veryfy confirmation message
      Given Open Azimut "Alerts" page
      Then Select section "Textbox"
      And Click on section "Textbox" button
      And Accept alert and add confirmation text "Azimut"
      And Verify acceptance message "Hello Azimut How are you today"

  Scenario: Alerts page Textbox section dismiss
    Given Open Azimut "Alerts" page
    Then Select section "Textbox"
    And Click on section "Textbox" button
    And Accept alert and add confirmation text "andreea"

    ########         iFRAME

  Scenario: Frames page for Single iframe
    Given Open Azimut "Frames" page
    Then Select section "Single"
    And Write "andreea" in 0 iframe

  Scenario: Frames page for Multiple iframe
    Given Open Azimut "Frames" page
    Then Select section "Multiple"
    And Write "andreea alina" in 0 iframe in multiple iframes

        ##########       MULTIPLE WINDOWS
  Scenario: Windows page Tabbed section
    Given Open Azimut "Windows" page
    Then Select section "Tabbed"
    And Click on section "Tabbed" button
    And Close other window tabs

  Scenario: Windows page Seperate section
    Given Open Azimut "Windows" page
    Then Select section "Seperate"
    And Click on section "Seperate" button
    And Close other window tabs

  Scenario: Windows page Multiple section
    Given Open Azimut "Windows" page
    Then Select section "Multiple"
    And Click on section "Multiple" button
    And Close other window tabs

    #https://www.selenium.dev/
    #https://demo.automationtesting.in/Index.html
  Scenario: Windows page Multiple section closing specific tabs having url
    Given Open Azimut "Windows" page
    Then Select section "Multiple"
    And Click on section "Multiple" button
    And Close window tab having url: "https://demo.automationtesting.in/Index.html"
