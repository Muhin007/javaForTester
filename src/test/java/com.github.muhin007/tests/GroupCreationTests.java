package java.com.github.muhin007.tests;

import org.testng.annotations.*;
import java.com.github.muhin007.model.GroupData;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationHelper().goToGroupPage("groups");
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupFields(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitGroupForm();
        app.getGroupHelper().returnToGroupPage();
    }

}
