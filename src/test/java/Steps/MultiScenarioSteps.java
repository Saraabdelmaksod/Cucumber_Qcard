package Steps;

import ActualPages.LoginPage;
import Pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;


public class MultiScenarioSteps extends BasePage {

    LoginPage loginObject;

    @Given("User open site and go to login page")
    public void User_open_site_and_go_to_login_page ()
    {
       launchBrowser();
    }
 @When("user fill data as {string} and {string} and click on login")
 public void user_fill_email_and_password_and_click_on_login(String username,String password)
 {
     loginObject=new LoginPage(driver);
    // driver.findElement(By.id("username")).sendKeys(username);
     //driver.findElement(By.id("password")).sendKeys(password);
    // driver.findElement(By.xpath("//button[@class=\"radius\"]")).click();
     loginObject.performlogin(username, password);

 }

    @Then("Success message will be displayed")
    public void Success_Message_should_appear()
    {
        //driver.findElement(By.id("flash-messages")).isDisplayed();
        //Assert.assertTrue(  driver.findElement(By.xpath("//a[@class=\"button secondary radius\"]")).isDisplayed());
        loginObject.assertlogin();
    }
    @Then("Error Message will be displayed")
    public void Error_Message_should_appear()
    {
        //driver.findElement(By.id("flash-messages")).isDisplayed();
        //Assert.assertTrue(driver.findElement(By.xpath("//button[@class=\"radius\"]")).isDisplayed());
        loginObject.assertlogin();
    }

}
