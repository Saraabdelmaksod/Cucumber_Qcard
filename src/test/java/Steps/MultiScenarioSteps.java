package Steps;

import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class MultiScenarioSteps extends BasePage {

    @Given("User open site and go to login page")
    public void User_open_site_and_go_to_login_page ()
    {
       launchBrowser();
    }
 @When("user fill data as {string} and {string} and click on login")
 public void user_fill_email_and_password_and_click_on_login(String username,String password)
 {
     driver.findElement(By.id("username")).sendKeys(username);
     driver.findElement(By.id("password")).sendKeys(password);
     driver.findElement(By.xpath("//button[@class=\"radius\"]")).click();

 }

    @Then("Success message will be displayed")
    public void Success_Message_should_appear()
    {
        driver.findElement(By.id("flash-messages")).isDisplayed();
        Assert.assertTrue(  driver.findElement(By.xpath("//a[@class=\"button secondary radius\"]")).isDisplayed());

    }
    @Then("Error Message will be displayed")
    public void Error_Message_should_appear()
    {
        driver.findElement(By.id("flash-messages")).isDisplayed();
        Assert.assertTrue(driver.findElement(By.xpath("//button[@class=\"radius\"]")).isDisplayed());

    }

}
