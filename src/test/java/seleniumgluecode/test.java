package seleniumgluecode;

import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;

public class test {

    public static WebDriver driver;
    @Given("^user is on homepage$")
    public void user_is_on_homepage() throws Throwable {
//        String user_dir = System.getProperty("user.dir");
//        System.setProperty("webdriver.chrome.driver", user_dir + "/chromedriver 2");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.webpagetest.org/");
    }

    @When("user Clicks on {string} Section")
    public void userClicksOnSection(String sectionName) {
        switch (sectionName) {
            case "Advanced Configuration":
                HomePage hp = PageFactory.initElements(driver, HomePage.class);
                hp.advancedConfigurationsSection.click();
                break;
            default:
                break;
        }
    }

    @Then("Verify Basic Fields on {string} Section")
    public void verifyBasicFieldsOnSection(String sectionName) {
        switch (sectionName) {
            case "Advanced Configuration":
                HomePage hp = PageFactory.initElements(driver, HomePage.class);
                Assert.assertTrue(hp.browserDropdown.isDisplayed());
                Assert.assertTrue(hp.testLocationDropdown.isDisplayed());
                Assert.assertTrue(hp.selectFromMapIcon.isDisplayed());
                Assert.assertTrue(hp.startTestButton.isDisplayed());
                break;
            default:
                break;
        }
    }

    @When("user Clicks on {string} Tab")
    public void userClicksOnTab(String tabName) {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        switch (tabName) {
            case "Test Settings":
                hp.testSettingsTab.click();
                break;
            case "Advanced":
                hp.advancedTab.click();
                break;
            case "Chromium":
                hp.chromiumTab.click();
                break;
            case "Script":
                hp.scriptTab.click();
                break;
            case "Block":
                hp.blockTab.click();
                break;
            case "SPOF":
                hp.spofTab.click();
                break;
            case "Custom":
                hp.customTab.click();
                break;
            default:
                break;
        }
    }

    @Then("Verify Basic Fields on {string} Tab")
    public void verifyBasicFieldsOnTab(String tabName) {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        switch (tabName) {
            case "Test Settings":
                Assert.assertTrue(hp.viewFirstCheckBox.isSelected());
                break;
            case "Advanced":
                int numberOfCheckBoxesInAdvancedTab  = driver.findElements(hp.advancedTabCheckBoxes).size();
                Assert.assertEquals(numberOfCheckBoxesInAdvancedTab, 9);
                break;
            case "Chromium":
                Assert.assertEquals(hp.mobileDeviceDropdownFirstValue.getText(), "Motorola G (gen 4)");
                break;
            case "Script":
                int numberOfCheckBoxInScriptTab = driver.findElements(hp.scriptTabCheckBoxes).size();
                Assert.assertEquals(numberOfCheckBoxInScriptTab, 2);
                break;
            case "Block":
                Assert.assertTrue(hp.blockRequestsTextArea.isDisplayed());
                break;
            case "SPOF":
                Assert.assertTrue(hp.hostsToFailTextArea.isDisplayed());
                break;
            case "Custom":
                Assert.assertTrue(hp.customMetricsTextArea.isDisplayed());
                break;
            default:
                break;
        }
    }
}
