#Feature: Promovare oLx Business
#
#  Background:
#    Given     Accesare Prima Pagina "https://www.olx.ro/"
#    Then      Acceptare cookie-uri
#    And       Inchidere anuntul: Află mai multe



#  Scenario:   Verificarea paginii de Promovare oLx Business
#    When      Accesare pagina "Oferi servicii? Pune anunț!"
#    Then      Click pe -Acceptare Cookies-
#    Then      Click pe "Află mai multe"
#    Then      Click pe -Video cu promovare-
#    And       Select iframe video
#    And       Click pe Pornire clip promovare





  //------------------------------- Scenariul 2: "Promovare oLx Business" ----------------------------------------------\\


  //    @When("Accesare pagina {string}")
  //    public void Servicii_anunt(String promovare) throws InterruptedException {
  ////        StartDriver.getDriver().findElement(By.cssSelector(".category-1")).click();
  //        StartDriver.getDriver().findElement(By.linkText(promovare)).click();
  //        sleep(3000);
  //    }
  //
  //    @Then("Click pe -Acceptare Cookies-")
  //    public void accept_cookies() throws InterruptedException {
  //        StartDriver.getDriver().findElement(By.id("hs-eu-confirmation-button")).click();
  //        sleep(3000);
  //    }
  //
  //    @Then("Click pe {string}")
  //    public void Afla_mai_multe(String anuntPromovare) throws InterruptedException {
  ////        StartDriver.getDriver().findElement(By.xpath("//*[@href='#sec1']")).click();
  //        StartDriver.getDriver().findElement(By.linkText(anuntPromovare)).click();
  //        sleep(3000);
  //    }
  //
  //    @Then("Click pe -Video cu promovare-")
  //    public void videoPromovare() throws InterruptedException {
  //        StartDriver.getDriver().findElement(By.xpath("//*[@class='eicon-play']")).click();
  //        sleep(3000);
  //    }
  //
  //    @And("Select iframe video")
  //    public void iframeVideo() throws InterruptedException {
  //        StartDriver.getDriver().switchTo().frame(StartDriver.getDriver().
  //                findElement(By.cssSelector(".elementor-fit-aspect-ratio > iframe:nth-child(1)")));
  //        sleep(2000);
  //    }
  //
  //    @And("Click pe Pornire clip promovare")
  //    public void playVideo() throws InterruptedException {
  //        StartDriver.getDriver().findElement(By.xpath(
  //                "//*[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")).click();
  //        sleep(17000);
  //    }
