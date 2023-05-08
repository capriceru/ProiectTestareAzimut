package stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class ImobiliareOLX {


//-------------------------------------------- Categoria Imobiliare OLX ----------------------------------------------\\
    @Given("{string}")
    public void anuntOlx(String imobiliare) throws InterruptedException {
        StartDriver.setup(imobiliare);
        sleep(10000);
    }

    @Then("Click pe Doar cu poze")
    public void DoarCuPoze() throws InterruptedException {
        StartDriver.getDriver().findElement(By.id("photos")).click();
        sleep(2000);
    }

    @Then("Introducere filtru Pret De la {string}")
    public void filtrarePret1(String price9) throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//*[@data-testid='range-from-input']"))
                .sendKeys(price9);
        sleep(3000);
    }

    @Then("Introducere filtru Pret Pana la {string}")
    public void filtrarePret2(String price10) throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//*[@data-testid='range-to-input']"))
                .sendKeys(price10);
        sleep(3000);
    }

    @Then("Introducere Suprafata utila m² de la {string}")
    public void suprafataUtilia1(String surface1) throws InterruptedException {
        StartDriver.getDriver().findElement(By.cssSelector(".css-1y0lxug:nth-child(3) > .css-1lrk3cc >" +
                " div:nth-child(1)" +
                " .css-ygy1px")).sendKeys(surface1);
        sleep(3000);
    }

    @Then("Introducere Suprafata utila m² pana la {string}")
    public void suprafataUtila2(String surface2) throws InterruptedException {
        StartDriver.getDriver().findElement(By.cssSelector(".css-1y0lxug:nth-child(3) > .css-1lrk3cc >" +
                " div:nth-child(2)" +
                " .css-ygy1px")).sendKeys(surface2);
        sleep(3000);
    }

    @Then("Click pe Vanzare-Inchriere")
    public void VanzareInchiriere() throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//*[@data-testid='dropdown-head']")).click();
        sleep(3000);
    }

    @Then("Selectare Vanzare")
    public void Vanzare() throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath(
                "(//*[@class='checkbox-unselected css-18tv77n']/..)[2]")).click();
        sleep(3000);
    }

    @Then("Alegerea monedei Lei")
    public void monedaLei() throws InterruptedException {
        StartDriver.getDriver().findElement(By.cssSelector(".css-ezm5nj")).click();
        sleep(3000);
    }

    @Then("Selectare anunt")
    public void selectareAnunt() throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//h6[contains(text(),'Vand')]")).click();
            sleep(10000);

    }
}
