package stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;

import static java.lang.Thread.sleep;

public class ProiectOLX {


//-------------------------------------- Background "Prima pagina OLX" -----------------------------------------------\\
    @Given("Accesare Prima Pagina {string}")
    public void Home_Page_OLX(String pageName) throws InterruptedException {
        StartDriver.setup(pageName);
        sleep(3000);
    }

    @Then("Acceptare cookie-uri")
    public void acceptareCookieUri() throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")).click();
//        sleep(1000);
    }


//------------------------- Scenariul 1: "Inregistrarea unui utilizator cu e-mail incorect" --------------------------\\

    @When("Accesare {string}")
    public void Click_pe_Contul_tau(String contulTau) throws InterruptedException {
        StartDriver.getDriver().findElement(By.linkText(contulTau)).click();
        sleep(3000);
    }

    @Then("Click pe Creează un cont")
    public void Click_pe_Creeaza_un_cont() throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//*[@data-testid='select-register-tab']")).click();
        sleep(3000);
    }


    @Then("Introducere e-mail: {string}")
    public void introducere_mail(String email) throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//input[@type='email']")).click();
        StartDriver.getDriver().findElement(By.xpath("//input[@type='email']")).sendKeys(email);
        sleep(3000);
    }

    @Then("Introducere parola: {string}")
    public void introducere_parola(String password) throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//input[@type='password']")).click();
        StartDriver.getDriver().findElement(By.xpath("//input[@type='password']")).sendKeys(password);
        sleep(3000);
    }

    @And("Click pe: Sunt de acord ci folosirea mijloacelor de comunicare")
    public void acord_mijloace_de_comunicare() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@data-testid='tick']")).click();
        StartDriver.getDriver().findElement(By.xpath("//div[@role='checkbox']//*[name()='svg']")).click();
        sleep(3000);
    }

    @And("Click pe butonul: Creează un cont")
    public void Creaza_cont() throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//*[@data-testid='register-button']")).click();
        sleep(3000);
    }
    // Extragere Text
    public boolean XpathExists(String xpath)
    {
        try
        {
            String text1 = StartDriver.getDriver().findElement(By.xpath(xpath)).getText();
            System.out.println("Textul preluat este: " + text1);
            return true;
        }
        catch(NoSuchElementException exception)
        {
            System.out.println(xpath + "Nu exista");
            return false;
        }
    }

    @And("Extragere eroare text")
    public void Extragere_text() throws InterruptedException {

        boolean firstTry =  XpathExists("//*[@class='css-rdovvl']");
        if(firstTry == false)
        {
            boolean secondTry = XpathExists("//*[@data-testid='message-container']");
            if(secondTry == false)
            {
                boolean thirdTry = XpathExists("//p[@class='css-ssrkmt e1ldhips0']");
                if(thirdTry == false)
                    System.out.println("Niciunul nu functioneaza");
            }
        }
        sleep(3000);
    }

//------------- Scenariul 2: "Aplicarea filtrelor pentru cautarea anunturilor din categorie Imobiliare" --------------\\

    @When("Selectarea zonei: {string}")
    public void Localitate(String location) throws InterruptedException {
        StartDriver.getDriver().findElement(By.id("cityField")).sendKeys(location);
        sleep(300);
    }

    @Then("Click pe butonu: Cauta acum")
    public void clickPeButonuCautaAcum() {
        StartDriver.getDriver().findElement(By.id("submit-searchmain")).click();
    }

    @Then("Click pe alegerea categoriei")
    public void clickPeAlegereaCategoriei() throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//div[@class='css-12snx2d']")).click();
        sleep(300);
    }

    @Then("Aplicare filtru: Imobiliare")
    public void alegereaCategoriei() throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//li[@data-categoryid='3']")).click();
        sleep(300);
    }

    @And("Aplicare filtru: Pret De la {string}")
    public void aplicareFiltruPret(String Price) throws InterruptedException {
        StartDriver.getDriver().
                findElement(By.xpath("//input[@data-testid='range-from-input']")).sendKeys(Price);
        sleep(300);
    }

    @And("Aplicare filtru: Pret Pana la {string}")
    public void aplicareFiltruPretPanaLa(String Price2) throws InterruptedException {
        StartDriver.getDriver().
                findElement(By.xpath("//input[@data-testid='range-to-input']")).sendKeys(Price2);
        sleep(300);
    }

    @And("Folosirea scroll-ului pentru vizualizarea anunturilor")
    public void folosireaScrollUluiPentruAVizualizareAnunturilor() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) StartDriver.getDriver();
        js.executeScript("window.scrollBy(0,2000)", "");
        sleep(10000);
    }

//-------------- Scenariul 3: "Cautare unui produs in bara de Cautare cu ajutorul Categoriilor principale" -----------\\

    @When("Selectarea categoriei de: {string}")
    public void selectareCategorie(String autoCategory) throws InterruptedException {
        StartDriver.getDriver().findElement(By.linkText(autoCategory)).click();
        sleep(3000);
    }

    @Then("Introducerea {string} in bara de cautare")
    public void cautareAutoInSearch(String lambo) throws InterruptedException {
        StartDriver.getDriver().findElement(By.id("search")).sendKeys(lambo);
        sleep(3000);
    }

    @And("Click pe butonul: Căutare")
    public void click_buton_cautare() throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//*[@data-testid='search-submit']")).click();
        sleep(3000);
    }
}
  //============================================== FINAL ==========================================================\\

