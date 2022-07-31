package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LogoutSteps {

    @And("User click on Logout Button")
    public void User_click_on_Logout_Button()
        {
            //driver.findElement(By.xpath("//a[@class=\"button secondary radius\"]")).click();

        }
     @Then("username filed will be displayed")
     public void username_filed_will_be_displayed()
        {
          //  Assert.assertTrue( driver.findElement(By.id("username")).isDisplayed());
        }
}
