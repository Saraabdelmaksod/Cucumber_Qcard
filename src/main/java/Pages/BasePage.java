package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BasePage {
    public static WebDriver driver;
    public static Properties props=new Properties();
    public BasePage(WebDriver driver)
    {
        this.driver=driver;
    }
   public BasePage()
   {
       try{
           File file=new File("src/main/java/Properties/config.properities");
           FileInputStream fis= new FileInputStream(file);
            props.load(fis);

       }
        catch (FileNotFoundException e)
        {
           throw new RuntimeException(e);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }

   }
    public static void launchBrowser()
    {

        if(props.getProperty("browser").equalsIgnoreCase("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        else if (props.getProperty("browser").equalsIgnoreCase("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
        else {
            throw new Error("Browser not Supported");
        }
      //  WebDriverManager.chromedriver().setup();
       // driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(props.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    }

}
