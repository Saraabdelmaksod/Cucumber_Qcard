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

public class LoginWithExamplesSteps {

    private WebDriver driver;

    @Given("User open The Website with More Data and go to Login Page")
    public void User_open_The_Website_with_More_Data_and_go_to_Login_Page () {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

    }
    @When("User fill email as {string} and {string} and click on login Examples")
    public void user_fill_email_and_password_and_click_on_login2_Examples(String username,String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@class=\"radius\"]")).click();

    }
    @Then("Error Message should appear")
    public void Error_Message_should_appear()
    {
        driver.findElement(By.id("flash-messages")).isDisplayed();
        System.out.println(driver.findElement(By.id("flash-messages")).getText());

    }
}
