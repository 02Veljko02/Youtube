package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BCPartizanChannel;
import pages.BCPartizanTVSearchPage;

public class GoToBCPartizanChannelTest extends BaseTest {
    @Test
    public void getTitleFromChannelPage(){
        homePage.enterDesiredText();
        BCPartizanTVSearchPage bcPartizanTVSearchPage = homePage.clickSearchButton();
        BCPartizanChannel bcPartizanChannel = bcPartizanTVSearchPage.clickBC();
        Assert.assertEquals(bcPartizanChannel.getPageTitle(), "BC Partizan TV", "Not expected");
    }
}
