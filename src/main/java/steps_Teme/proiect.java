//package stepsDefinition;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import org.openqa.selenium.By;
//import org.openqa.selenium.PageLoadStrategy;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import static java.lang.Thread.sleep;
//
//
//public class proiect {
//
//    private WebDriver driver;
//

//    @Before
//    public void setup(){
//        System.setProperty("webdriver.chrome.driver",
//                System.getProperty("user.dir") +"/src/main/java/driver/chromedriver.exe");
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//        driver = new ChromeDriver(chromeOptions);
//        driver.manage().window().maximize();
//    }
//    @After
//    public void tearDown(){
//        driver.quit();
//    }
//
//    @Given("Open login")
//    public void Open_login_page() throws InterruptedException {
//        driver.get("https://demo.automationtesting.in/Index.html");
//    sleep(3000);
//}
//
//
//    @Then("I enter Email {string}")
//    public void i_enter_email(String adresaDeEmail) throws InterruptedException {
//
//
//    driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Email");
//    sleep(300);
//
//    }
//    @Then("I click the login button")
//    public void i_click_the_login_button() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id='enterimg']")).click();
//
//        sleep(3000);
//
//    }
//
//}
