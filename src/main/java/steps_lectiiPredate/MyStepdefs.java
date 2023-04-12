package steps_lectiiPredate;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.lang.Thread.sleep;

public class MyStepdefs {
        public WebDriver driver;

//        @Before
//        public void setup(){
//                System.setProperty("webdriver.chrome.driver",
//                        System.getProperty("user.dir") + "/src/main/java/driver/chromedriver.exe");
//
//                ChromeOptions chromeOptions = new ChromeOptions();
//                //se adauga o linie noua
//                chromeOptions.addArguments("--remote-allow-origins=*");
//                chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//                driver = new ChromeDriver(chromeOptions);
//                driver.manage().window().maximize();
//        }
//        @After
//        public void tearDown(){
//                driver.quit();
//        }


        @Given("Open Azimut {string} page")
        public void open_Azimut_demo_pages(String pageName) throws InterruptedException {
                driver.get("https://demo.automationtesting.in/"+pageName+".html");
                sleep(3000);
        }

        //Steps for Login page
        @Then("I enter email {string}")
        public void iEnterEmailForString(String adresaDeEmail) throws InterruptedException {

                driver.findElement(By.xpath("//*[@id='email']"))
                        .sendKeys(adresaDeEmail);
                sleep(3000);
        }

        @And("I click the Login button")
        public void iClickTheLoginButton() throws InterruptedException {
                driver.findElement(By.xpath("//*[@id='enterimg']")).click();
                sleep(3000);
        }


        //sectiunea din switchTo
        @Then("Select section {string}")
        public void selectSection(String section) throws InterruptedException {
                driver.findElement(By.xpath("//*[@href='#"+section+"']")).click();
                sleep(3000);
        }

        @Then("Click on section {string} button")
        public void clickOnSectionButton(String section) throws InterruptedException {
                driver.findElement(By.xpath("//*[@id='"+section+"']//button")).click();
                sleep(3000);
        }

        //Alerts and using alerts in testing automation

        // ACCEPTING ALERTS
        @And("Accept alert")
        public void acceptAlert() throws InterruptedException {
                driver.switchTo().alert().accept();
                sleep(3000);
        }

        @And("Accept alert and read confirmation text")
        public void acceptAlertReadConfirmationText() throws InterruptedException {
                acceptAlert();
                System.out.println(driver.findElement(By.id("demo")).getText());
                sleep(3000);
        }

        @And("Accept alert and add confirmation text {string}")
        public void acceptAlertAndAddConfirmationText(String alertConfirmationText) throws InterruptedException {
                //acceptAlert();
                driver.switchTo().alert().sendKeys(alertConfirmationText);
                driver.switchTo().alert().accept();
                System.out.println(driver.findElement(By.id("demo1")).getText());
                sleep(3000);
        }

//        @And("Verify acceptance message {string}")
//        public void verifyAcceptanceMessage(String confirmationMessage) throws InterruptedException {
//               Assert.assertEquals(driver.findElement(By.id("demo1")).getText(), confirmationMessage);
//               sleep(3000);
//        }


        //DISMISS ALERTS
        @And("Cancel alert")
        public void cancelAlert() throws InterruptedException {
                driver.switchTo().alert().dismiss();
                sleep(3000);
        }

        @And("Cancel alert and read confirmation text")
        public void cancelAlertReadConfirmationText() throws InterruptedException {
                cancelAlert();
                System.out.println(driver.findElement(By.id("demo")).getText());
                sleep(3000);
        }

        @And("Cancel alert and add confirmation text {string}")
        public void cancelAlertAddConfirmationText(String alertConfirmationText) throws InterruptedException {
                cancelAlert();
                driver.switchTo().alert().sendKeys(alertConfirmationText);
                driver.switchTo().alert().dismiss();
                sleep(3000);
        }

        //IFRAMES
        @And("Write {string} in {int} iframe")
        public void writeInIframe(String inputText, int idIFrame) throws InterruptedException {
                driver.switchTo().frame(idIFrame);
                driver.findElement(By.xpath("//input"));
                driver.switchTo().parentFrame();
                sleep(3000);
        }

        @And("Write {string} in {int} iframe in multiple iframes")
        public void writeInMultipleIframe(String inputText, int idIFrame) throws InterruptedException {
                driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='Multiple']/iframe")));

                writeInIframe(inputText, idIFrame);
        }


        //WINDOWS
        @And("Close other window tabs")
        public void closeNewTabWindow() throws InterruptedException {
                //se salveaza tab-ul principal intr-o variabila, ca sa stim tot timpul unde este
                String tabPrincipal = driver.getWindowHandle();
                System.out.println(tabPrincipal);

                for (String windowHandle : driver.getWindowHandles()) {
                        //sa il putem compara cu alte tab-uri
                        if(!tabPrincipal.contentEquals(windowHandle)) {
                                //ii spunem driverului de celelalt window tab
                                driver.switchTo().window(windowHandle);

                                //putem sa "scoatem" url-ul acelui tab
                                System.out.println(driver.getCurrentUrl());

                                //si sa il inchida
                                driver.close();
                        }
                }
                sleep(3000);
                driver.switchTo().window(tabPrincipal);
        }

        @And("Close window tab having url: {string}")
        public void closeNewTabWindow(String url) throws InterruptedException {
                String tabPrincipal = driver.getWindowHandle();
                for (String windowHandle : driver.getWindowHandles()) {
                        if(!tabPrincipal.contentEquals(windowHandle)) {
                                //ii spunem driverului de celelalt window tab
                                driver.switchTo().window(windowHandle);

                                //ii preluam url-ul
                                String adresaPaginaCurenta = driver.getCurrentUrl();
                                System.out.println(driver.getCurrentUrl());

                                //comparam url-ul tab-ului cu ce a primit de la user
                                if(adresaPaginaCurenta.equalsIgnoreCase(url)){
                                        driver.close();
                                        sleep(3000);
                                }
                        }
                }
                sleep(3000);
                driver.switchTo().window(tabPrincipal);
        }


}
