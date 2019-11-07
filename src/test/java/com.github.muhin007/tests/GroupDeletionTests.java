package java.com.github.muhin007.tests;

import org.testng.annotations.*;

public class GroupDeletionTests extends TestBase {

    @Test
    public void testsDeletionGroup() {
        app.getNavigationHelper().goToGroupPage("groups");
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
    }

}