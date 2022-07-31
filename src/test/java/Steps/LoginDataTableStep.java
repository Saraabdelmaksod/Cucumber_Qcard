package Steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginDataTableStep {
    private WebDriver driver;

    @Given("User open The Website and go to Login2 Page")
    public void user_open_the_website_and_go_to_login2_page() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

    }
    @When("User fill email  and password and click on login2")
    public void user_fill_email_and_password_and_click_on_login2(DataTable whenData)
    {
        driver.findElement(By.id("username")).sendKeys(whenData.cell(0,0));
        driver.findElement(By.id("password")).sendKeys(whenData.cell(0,1));
        driver.findElement(By.xpath("//button[@class=\"radius\"]")).click();
    }
    @Then("User should navigate to home2 page")
    public void user_should_navigate_to_home2_page()
    {
        driver.findElement(By.id("flash-messages")).isDisplayed();
        System.out.println(driver.findElement(By.id("flash-messages")).getText());

    }
}
