package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    @FindBy(how= How.XPATH, using="//label[@for='advanced']")
    public WebElement advancedConfigurationsSection;

    @FindBy(how= How.XPATH, using="//select[@id='location']")
    public WebElement testLocationDropdown;

    @FindBy(how= How.XPATH, using="//select[@id='browser']")
    public WebElement browserDropdown;

    @FindBy(how= How.XPATH, using="//button[@id='change-location-btn']")
    public WebElement selectFromMapIcon;

    @FindBy(how= How.XPATH, using="//input[@class='start_test']")
    public WebElement startTestButton;

    @FindBy(how= How.XPATH, using="//a[text()='Test Settings']")
    public WebElement testSettingsTab;

    @FindBy(how= How.XPATH, using="//a[text()='Advanced']")
    public WebElement advancedTab;

    @FindBy(how= How.XPATH, using="//a[text()='Chromium']")
    public WebElement chromiumTab;

    @FindBy(how= How.XPATH, using="//a[text()='Script']")
    public WebElement scriptTab;

    @FindBy(how= How.XPATH, using="//a[text()='Block']")
    public WebElement blockTab;

    @FindBy(how= How.XPATH, using="//a[text()='SPOF']")
    public WebElement spofTab;

    @FindBy(how= How.XPATH, using="//a[text()='Custom']")
    public WebElement customTab;

    @FindBy(how= How.XPATH, using="//input[@id='viewFirst']")
    public WebElement viewFirstCheckBox;

    public By advancedTabCheckBoxes = By.xpath("//div[@id='advanced-settings']//input[@type='checkbox']");

    @FindBy(how= How.XPATH, using="//select[@id='mobileDevice']//optgroup[@label='Android']//option[1]")
    public WebElement mobileDeviceDropdownFirstValue;

    public By scriptTabCheckBoxes = By.xpath("//div[@id='script']//input[@type='checkbox']");

    @FindBy(how= How.XPATH, using="//textarea[@id='block_requests_containing']")
    public WebElement blockRequestsTextArea;

    @FindBy(how= How.XPATH, using="//textarea[@id='spof_hosts']")
    public WebElement hostsToFailTextArea;

    @FindBy(how= How.XPATH, using="//textarea[@id='custom_metrics']")
    public WebElement customMetricsTextArea;

}
