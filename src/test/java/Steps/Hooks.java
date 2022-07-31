package Steps;

import Pages.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BasePage {
    @Before
    public void setupDriver()
    {

    }
    @After
    public void closeDriver()
    {
      driver.quit();
    }

}
