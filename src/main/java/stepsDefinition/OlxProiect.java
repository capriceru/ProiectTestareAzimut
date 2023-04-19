//package stepsDefinition;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import java.io.File;
//import java.util.Set;
//import static java.lang.Thread.sleep;
//
//public class OlxProiect {
//
//    private WebDriver driver;
//
//    @Before
//    public void setup() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver",
//                System.getProperty("user.dir") + "/src/main/java/driver/chromedriver.exe");
//        ChromeOptions chromeOptions = new ChromeOptions();
//
//        chromeOptions.addExtensions(new File("src/main/java/driver/Adblock1.crx"));
//        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//        chromeOptions.addArguments("--remote-allow-origins=*");
//        driver = new ChromeDriver(chromeOptions);
//        driver.manage().window().maximize();
//        sleep(5000);
//        String MainWindowHandle=driver.getWindowHandle();
//        Set<String> allWindowHandles = driver.getWindowHandles();
//        for (String ChildWindow : allWindowHandles) {
//            if (!MainWindowHandle.equalsIgnoreCase(ChildWindow)) {
//                driver.switchTo().window(ChildWindow);
//                driver.close();
//            }
//        }
//        driver.switchTo().window(MainWindowHandle);
//    }
//
//    @After
//    public void tearDown(){
//        driver.quit();
//    }
//
////-------------------------------------- Background "Prima pagina OLX" -----------------------------------------------\\
//
//    @Given("Accesare Prima Pagina OLX")
//    public void Home_Page_OLX() throws InterruptedException {
//        driver.get("https://www.olx.ro/");
//        sleep(300);
//    }
//
//    @Then("Acceptare cookie-uri")
//    public void acceptareCookieUri() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")).click();
//        sleep(300);
//    }
//
//    @And("Inchidere anuntul: Vreau RCA!")
//    public void Inchidere_anunt() throws InterruptedException {
//        driver.findElement(By.xpath("//button[@class='closeIcon']")).click();
//        sleep(400);
//    }
//
////------------------------ Scenariul 1: "Inregistrarea unui utilizator cu credentiale incorecte" ---------------------\\
//
//    @When("Click pe Contul tău")
//    public void Click_pe_Contul_tau() throws InterruptedException {
//        driver.findElement(By.linkText("Contul tău")).click();
//        sleep(3000);
//    }
//
//    @Then("Click pe Creează un cont")
//    public void Click_pe_Creeaza_un_cont() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@data-testid='select-register-tab']")).click();
//        sleep(3000);
//    }
//
//
//    @Then("Introducere e-mail: {string}")
//    public void introducere_mail(String email) throws InterruptedException {
//        driver.findElement(By.xpath("//input[@type='email']")).click();
//        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
//        sleep(3000);
//    }
//
//    @Then("Introducere parola: {string}")
//    public void introducere_parola(String password) throws InterruptedException {
//        driver.findElement(By.xpath("//input[@type='password']")).click();
//        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
//        sleep(3000);
//    }
//
//    @And("Click pe: Sunt de acord ci folosirea mijloacelor de comunicare")
//    public void acord_mijloace_de_comunicare() throws InterruptedException {
////        driver.findElement(By.xpath("//*[@data-testid='tick']")).click();
//        driver.findElement(By.xpath("//div[@role='checkbox']//*[name()='svg']")).click();
//        sleep(3000);
//    }
//
//    @And("Click pe butonul: Creează un cont")
//    public void Creaza_cont() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@data-testid='register-button']")).click();
//        sleep(3000);
//    }
//// Extragere Text
//    public boolean XpathExists(String xpath)
//    {
//        try
//        {
//            String text1 = driver.findElement(By.xpath(xpath)).getText();
//            System.out.println("Textul preluat este: " + text1);
//            return true;
//        }
//        catch(NoSuchElementException exception)
//        {
//            System.out.println(xpath + "Nu exista");
//            return false;
//        }
//    }
//
//    @And("Extragere eroare text")
//    public void Extragere_text() throws InterruptedException {
//
//       boolean firstTry =  XpathExists("//*[@class='css-rdovvl']");
//       if(firstTry == false)
//       {
//            boolean secondTry = XpathExists("data-testid='message-container'");
//            if(secondTry == false)
//            {
//                boolean thirdTry = XpathExists("//p[@class='css-ssrkmt e1ldhips0']");
//                if(thirdTry == false)
//                System.out.println("Niciunul nu functioneaza");
//            }
//       }
//        sleep(3000);
//    }
//
//
////------------------------------- Scenariul 2: "Promovare oLx Business" ----------------------------------------------\\
//    @When("Click pe -Oferi servicii? Pune anunț!-")
//    public void Servicii_anunt() throws InterruptedException {
//        driver.findElement(By.cssSelector(".category-1")).click();
//        sleep(3000);
//    }
//
//    @Then("Click pe -Acceptare Cookies-")
//    public void accept_cookies() throws InterruptedException {
//        driver.findElement(By.id("hs-eu-confirmation-button")).click();
//        sleep(3000);
//    }
//
//    @Then("Click pe -Află mai multe-")
//    public void Afla_mai_multe() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@href='#sec1']")).click();
//        sleep(3000);
//    }
//
//    @Then("Click pe -Video cu promovare-")
//    public void videoPromovare() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@class='eicon-play']")).click();
//        sleep(3000);
//    }
//
//    @And("Select iframe video")
//    public void iframeVideo() throws InterruptedException {
//        driver.switchTo().frame(driver.findElement(By.cssSelector(".elementor-fit-aspect-ratio > iframe:nth-child(1)")));
//        sleep(2000);
//    }
//
//    @And("Click pe Pornire clip promovare")
//    public void playVideo() throws InterruptedException {
//        driver.findElement(By.xpath(
//                "//*[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")).click();
//        sleep(17000);
//    }
//
//
////------------- Scenariul 3: "Aplicarea filtrelor pentru cautarea anunturilor din categorie Imobiliare" --------------\\
//
//    @When("Selectarea zonei: {string}")
//    public void Localitate(String location) throws InterruptedException {
//        driver.findElement(By.id("cityField")).sendKeys(location);
//        sleep(300);
//    }
//
//    @Then("Click pe butonu: Cauta acum")
//    public void clickPeButonuCautaAcum() {
//        driver.findElement(By.id("submit-searchmain")).click();
//    }
//
//    @Then("Click pe alegerea categoriei")
//    public void clickPeAlegereaCategoriei() throws InterruptedException {
//        driver.findElement(By.xpath("//div[@class='css-12snx2d']")).click();
//        sleep(300);
//    }
//
//    @Then("Aplicare filtru: Imobiliare")
//    public void alegereaCategoriei() throws InterruptedException {
//        driver.findElement(By.xpath("//li[@data-categoryid='3']")).click();
//        sleep(300);
//    }
//
//    @And("Aplicare filtru: Pret De la {string}")
//    public void aplicareFiltruPret(String Price) throws InterruptedException {
//        driver.findElement(By.xpath("//input[@data-testid='range-from-input']")).sendKeys(Price);
//        sleep(300);
//    }
//
//    @And("Aplicare filtru: Pret Pana la {string}")
//    public void aplicareFiltruPretPanaLa(String Price2) throws InterruptedException {
//        driver.findElement(By.xpath("//input[@data-testid='range-to-input']")).sendKeys(Price2);
//        sleep(300);
//    }
//
//    @And("Folosirea scroll-ului pentru vizualizarea anunturilor")
//    public void folosireaScrollUluiPentruAVizualizareAnunturilor() throws InterruptedException {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,2000)", "");
//        sleep(10000);
//    }
//
//
////--------------- Scenariul 4: "Cautare unui produs in bara de Cautare cu ajutorul Cagoriilor principale" ------------\\
//
//    @When("Selectarea categoriei de: {string}")
//    public void selectareCategorie(String autoCategory) throws InterruptedException {
//        driver.findElement(By.linkText(autoCategory)).click();
//        sleep(3000);
//    }
//
//    @Then("Click pe subcategoria: {string}")
//    public void clickCategorie(String auto) throws InterruptedException {
//        driver.findElement(By.linkText(auto)).click();
//        sleep(3000);
//    }
//
//
//    @Then("Introducerea {string} in bara de cautare")
//    public void cautareAutoInSearch(String lambo) throws InterruptedException {
//        driver.findElement(By.id("search")).sendKeys(lambo);
//        sleep(3000);
//    }
//
//    @And("Click pe butonul: Căutare")
//    public void click_buton_cautare() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@data-testid='search-submit']")).click();
//        sleep(3000);
//    }
//
//   //============================================== FINAL ==========================================================\\
//
//
//
//
//
//
//
//
//
//
//
////----------------------------------IN CAZ DE NEVOIE--------------------------------------
//
//    @Then("Introducere email valid: {string}")
//    public void Introducere_email_valid(String emailAddress) throws InterruptedException {
//        driver.findElement(By.xpath("//input[@type='email']")).click();
//        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(emailAddress);
//        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Keys.TAB);
//        sleep(3000);
//    }
//
//    @Then("Introducere parola valida: {string}")
//    public void Introducere_parola(String truePassword) throws InterruptedException {
////        driver.findElement(By.xpath("//input[@class='css-1t8ketc']")).click();
//        driver.findElement(By.xpath("//input[@class='css-1t8ketc']")).sendKeys(truePassword);
//        sleep(3000);
//    }
//
//    @Then("Click pe Intră în cont")
//    public void Intra_in_cont() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@data-testid='login-submit-button']")).click();
//        sleep(9000);
//    }
//
//    @Then("Setari")
//    public void setari() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@data-testid='tabs-settings']")).click();
//        sleep(300);
//    }
//
//    @Then("Date de facturare")
//    public void dateDeFacturare() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id='settings.invoice_data__toggle']")).click();
//        sleep(3000);
//    }
//
//    @Then("Schimba datele facturii")
//    public void schimbaDateleFacturii() throws InterruptedException {
//        driver.findElement(By.linkText("Schimbă datele facturii")).click();
//        sleep(3000);
//    }
//
//    @Then("Adaugare date")
//    public void adaugareDate() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id='name']")).sendKeys(Keys.CONTROL, "a", Keys.DELETE);
//        driver.findElement(By.xpath("//*[@id='name']")).sendKeys("Alex");
//
//        driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys("Alexandru");
//        driver.findElement(By.xpath("//*[@id='phone']")).sendKeys("072 1111 1111");
//        driver.findElement(By.xpath("//*[@id='address']")).sendKeys("Strada Matei Basarab");
//        //Salveaza
//        driver.findElement(By.xpath("//*[@id='saveInvoiceData']")).click();
//
//        sleep(4000);
//    }
//
//
////        driver.findElement(By.id("cityField")).click();
////        driver.findElement(By.xpath("//*[@data-id='46']")).click();
////        driver.findElement(By.id("a-region-1")).click();
////        driver.findElement(By.id("submit-searchmain")).click();
////
////        driver.findElement(By.xpath("//div[@class='css-12snx2d']")).click();                                 //click pe alegerea categoriei
////        driver.findElement(By.xpath("//li[@data-categoryid='3']")).click();                                  // aplicare filtru "Imobiliare"
////
////        driver.findElement(By.xpath("//input[@data-testid='range-from-input']")).sendKeys("20000");
////        driver.findElement(By.xpath("//input[@data-testid='range-to-input']")).sendKeys("85000");
////
////        driver.findElement(By.xpath("//span[@data-testid='currency-item']")).click();
//
//
//
//
//
//
//
//
//}
//
//
//// In caz de nevoie
////        driver.findElement(By.id("headerSearch")).sendKeys("apartament bucuresti");
////        driver.findElement(By.id("submit-searchmain")).click();
//
////Arata si ascunde parola
////driver.findElement(By.xpath("//*[@data-testid='toggle-password']")).click();
////driver.findElement(By.xpath("//*[@data-testid='toggle-password']")).click();
//
//
//
////Iframe Video
////        driver.findElement(By.xpath("//*[@class='ytp-play-button ytp-button']")).click();
////        driver.findElement(By.xpath("//*[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")).click();
////        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='elementor-lightbox-bd80340']/div/div[3]/div/div/iframe")));           //functional
////        driver.switchTo().frame(driver.findElement(By.cssSelector("#elementor-lightbox-bd80340 > div > div.dialog-message.dialog-lightbox-message > div > div > iframe")));
////functional
//
//// Get text creeaza cont
////        String eroareText = driver.findElement(By.xpath("//*[@class='css-rdovvl']")).getText();
////        String eroareText = driver.findElement(By.xpath("data-testid='message-container'")).getText();
//
//////        String eroareText = driver.findElement(By.xpath("//p[@class='css-ssrkmt e1ldhips0']")).getText();
////            System.out.println("Textul preluat este: "+eroareText);
//
//// Click pe Oferi servicii
////        driver.findElement(By.linkText("Oferi servicii? Pune anunț!")).click();