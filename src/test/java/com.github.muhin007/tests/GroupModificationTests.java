package java.com.github.muhin007.tests;

import org.testng.annotations.Test;
import java.com.github.muhin007.model.GroupData;

public class GroupModificationTests extends TestBase {
    @Test
    public void testGroupModification() {
        app.getNavigationHelper().goToGroupPage("groups");
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupFields(new GroupData("test1", "test2", "test2"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
    }
}
