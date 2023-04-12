package steps_Teme;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import static java.lang.Thread.sleep;

public class tema_azimut {
    private WebDriver driver;


//    @Before
//    public void setup() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver",
//                System.getProperty("user.dir") + "/src/main/java/driver/chromedriver.exe");
//        ChromeOptions chromeOptions = new ChromeOptions();
//
//        chromeOptions.addExtensions(new File("src/main/java/driver/Adblock1.crx"));
//        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//        driver = new ChromeDriver(chromeOptions);
//        driver.manage().window().maximize();
//        sleep(9000);
//        String MainWindowHandle=driver.getWindowHandle();
//        Set<String> allWindowHandles = driver.getWindowHandles();
//        Iterator<String> iterator = allWindowHandles.iterator();
//        while (iterator.hasNext())
//        {String ChildWindow = iterator.next();
//            if (!MainWindowHandle.equalsIgnoreCase(ChildWindow)) {
//                driver.switchTo().window(ChildWindow);
//                driver.close();
//            }
//        }
//        driver.switchTo().window(MainWindowHandle);
//    }


//
//    @After
//    public void tearDown() {
//        driver.quit();
//    }


    @Given("Deschidere pagina index")
    public void Deschidere_pagina_index() throws InterruptedException {
        driver.get("https://demo.automationtesting.in/Index.html");
        sleep(300);
    }

    @And("Email id: {string}")
    public void Email_id(String Id_name) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys(Id_name);
        sleep(800);
    }

    @And("Click Enter si navigheaza inapoi")
    public void Click_Enter_si_navigheaza_inapoi() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='enterimg']")).click();
        sleep(800);
        driver.navigate().back();
    }

    @When("Click pe Sign In")
    public void CLick_on_Sign_In() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='btn1']")).click();
        sleep(800);
    }

    @Then("Introducere email: {string}")
    public void Introducere_email(String Email) throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder='E mail']")).sendKeys(Email);
        sleep(800);
    }

    @Then("Introducere parola: {string}")
    public void Introducere_parola(String Parola) throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Parola);
        sleep(800);
    }

    @And("Apasare ENTER")
    public void Apasare_ENTER() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='enterbtn']")).click();
        sleep(800);
        driver.navigate().back();
    }

    @And("Click pe butonul Skip Sign In")
    public void Click_pe_butonul_Skip_Sign_In() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='btn2']")).click();
        driver.navigate().back();
        sleep(1200);
    }

//--------------------------------------------------------------------------------------------------------------------

    @Given("Deschidere pagina Register")
    public void Deschidere_pagina_Register() throws InterruptedException {
        driver.get("https://demo.automationtesting.in/Register.html");
        sleep(300);
    }

    @Then("Introducere First Name: {string}")
    public void Adaugare_First_Name(String FirstName) {
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(FirstName);
    }

    @Then("Introducere Last Name: {string}")
    public void Adaugare_Last_Name(String LastName) {
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(LastName);
    }


    @Then("Introducere adresa: {string}")
    public void Introducere_adresa(String Address) {
        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(Address);
    }

    @Then("Introducere email gresit: {string}")
    public void Enter_email(String Email_Adress) {
        driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys(Email_Adress);
    }

    @Then("Numar telefon: {string}")
    public void Numar_telefon(String Phone_number) {
        driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys(Phone_number);
    }

    @And("Click pe Gender si Hobbies")
    public void Click_pe_Gender_si_Hobbies() throws InterruptedException {
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        driver.findElement(By.xpath("//*[@id='checkbox2']")).click();
        driver.findElement(By.xpath("//*[@id='checkbox3']")).click();
        driver.findElement(By.xpath("//*[@id='checkbox1']")).click();
        sleep(3000);
    }

    @Then("Languages")
    public void Languages() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='msdd']")).click();
        driver.findElement(By.xpath("//*[a='Romanian']")).click();
        sleep(3000);
    }

    @Then("Skills")
    public void Skills() {
        driver.findElement(By.xpath("//*[@id='Skills']/option [@value='HTML']")).click();
    }

    @Then("Selectarea Country random")
    public void Select_Country() {
        driver.findElement(By.xpath("//select[@id='country']/option[@value='Australia']")).click();
    }

    @Then("Date of Birth")
    public void Date_of_Birth() {
        driver.findElement(By.xpath("//*[@id='yearbox']/option [@value='2000']")).click();
        driver.findElement(By.xpath("//select[@placeholder='Month']/option [@value='February']")).click();
        driver.findElement(By.xpath("//*[@id='daybox']/option [@value='1']")).click();
    }

    @Then("Parola: {string}")
    public void Parola(String Password) {
        driver.findElement(By.xpath("//*[@id='firstpassword']")).sendKeys(Password);
    }

    @Then("Confirma parola: {string}")
    public void Confirma_parola(String Password_confirm) {
        driver.findElement(By.xpath("//*[@id='secondpassword']")).sendKeys(Password_confirm);
    }

    @Then("Confirm")
    public void Confirm() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='submitbtn']")).click();
        sleep(1500);
    }

//-----------------------------------------------------------------------------------------------------------------

    @Given("Deschidere pagina SwitchTo Alerts")
    public void Deschidere_pagina_SwitchTo_Alerts() throws InterruptedException {
        driver.get("https://demo.automationtesting.in/Alerts.html");
        sleep(1200);
    }

    @When("Click pe butonul Display an Alert Box")
    public void Alert_Box() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='OKTab']/button")).click();
        sleep(1300);
        driver.switchTo().alert().dismiss();
        sleep(1300);
    }

    @Then("Alert with ok and cancel")
    public void Alert_with_ok_and_cancel() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id='CancelTab']/button")).click();
        driver.switchTo().alert().accept();
        sleep(2000);
    }

    @And("Textbox Alert: {string}")
    public void Textbox_Alert(String EU) throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
        driver.switchTo().alert().sendKeys(EU);
        driver.switchTo().alert().accept();
        sleep(3000);
    }

    @Then("Switch to Windows")
    public void Switch_to_Windows() throws InterruptedException {
        driver.get("https://demo.automationtesting.in/Windows.html");
        sleep(3000);
    }

    @Then("CLick to _blank")
    public void Click_to_blank() throws InterruptedException {
        String originalWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//*[@id='Tabbed']/a/button")).click();
        driver.switchTo().window(originalWindow);
        sleep(3000);
    }

    @Then("Open New Separate Windows")
    public void Open_New_Separate_Windows () throws InterruptedException {
        String originalWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id='Seperate']/button")).click();
        driver.switchTo().window(originalWindow);
        sleep(3000);
    }

    @Then("Open Seperate Multiple Windows")
    public void Open_Seperate_Multiple_Windows() throws InterruptedException {
        String originalWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id='Multiple']/button")).click();
        driver.switchTo().window(originalWindow);
        sleep(3000);
    }

    @Then("First Frame")
    public void First_Frame() throws InterruptedException {
        driver.get("https://demo.automationtesting.in/Frames.html");

        driver.switchTo().frame("SingleFrame");
        driver.findElement(By.xpath("/html/body/section/div/div/div/input"))
                .sendKeys("Sunt primul Frame");
        sleep(3000);

        WebElement iframe = driver.findElement(By.cssSelector("#Multiple>iframe"));
        driver.switchTo().frame(iframe);
        driver.switchTo().frame(0);
        sleep(3000);
    }
}

