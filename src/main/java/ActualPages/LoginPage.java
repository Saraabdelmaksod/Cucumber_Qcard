package ActualPages;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }
    By username= By.id("username");
    By password=By.id("password");
    By loginBtn= By.xpath("//button[@class=\"radius\"]");
    By message=By.xpath("//*[@id=\"flash\"]");

    public void performlogin(String name, String pass)
    {
        driver.findElement(username).sendKeys(name);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
    }

    public boolean assertlogin()
    {
       return driver.findElement(message).isDisplayed();
    }
}
