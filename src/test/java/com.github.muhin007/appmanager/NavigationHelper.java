package java.com.github.muhin007.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void goToGroupPage(String groups) {
        click(By.linkText(groups));
    }
}
