package java.com.github.muhin007.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    protected WebDriver driver;

    private NavigationHelper navigationHelper;

    private GroupHelper groupHelper;

    private SessionHelper sessionHelper;

    public void init() {
        System.setProperty("webdriver.gecko.driver", "C://work/firefoxdrv/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://localhost/addressbook/");
        groupHelper = new GroupHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        sessionHelper = new SessionHelper(driver);
        sessionHelper.login("admin", "secret");
    }



    public void stop() {
        driver.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
