package stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static java.lang.Thread.sleep;

public class AnuntOLX {


//---------------------------------- Background "Anunt OLX si Cookie-uri" --------------------------------------------\\
    @Given("Adresa anuntului OLX")
    public void anuntOlx() throws InterruptedException {
        StartDriver.setup("https://www.olx.ro/d/oferta/se-vinde-vila-exclusivista-IDh5qQL.html");
//        StartDriver.setup("https://www.olx.ro/d/oferta/laptop-gaming-hp-omen-15-dh-0008nq-IDgMTp1.html");
        sleep(4000);
    }

    @And("Se accepta cookie-uri")
    public void CoockieAccept() throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")).click();
        sleep(3000);
    }

//-------------------------------------------- Scenarii oLx anunt ----------------------------------------------------\\

    @Then("Click glisare foto anunt")
    public void glisarePoze() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) StartDriver.getDriver();
        js.executeScript("window.scrollBy(0,350)", "");

        StartDriver.getDriver().findElement(By.cssSelector(".swiper-button-next > .css-pyu9k9")).click();
        sleep(3000);
        StartDriver.getDriver().findElement(By.cssSelector(".swiper-button-next > .css-pyu9k9")).click();
        sleep(3000);
        StartDriver.getDriver().findElement(By.cssSelector(".swiper-button-next > .css-pyu9k9")).click();
        sleep(3000);
    }

    @And("Folosirea scroll-ului pentru vizualizare Descriere anunt")
    public void ContinutAnunt() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) StartDriver.getDriver();
        js.executeScript("window.scrollBy(0,900)", "");
        sleep(3000);
    }

    @Then("Se adauga anunt la Favorite")
    public void anuntFavorite() throws InterruptedException {
        StartDriver.getDriver().findElement(By.cssSelector(".css-1lx5q7o > .css-pyu9k9")).click();
        sleep(3000);
    }

    @Then("Click pe butonul Favorite")
    public void butonFavorite() throws InterruptedException {
        StartDriver.getDriver().findElement(By.cssSelector(".css-l9chfa")).click();
        sleep(3000);
    }

    @And("Stergere anunt de la Favorite")
    public void stergereAnunt() throws InterruptedException {
        StartDriver.getDriver().findElement(By.cssSelector(".css-1phmm16")).click();
        sleep(3000);
    }

    @And("Confirmare sterge anunt de la Favorite")
    public void confirmare_Stergere_Anunt() throws InterruptedException {
        StartDriver.getDriver().switchTo().alert().accept();
        sleep(9000);
    }
}

  //============================================== FINAL ==========================================================\\