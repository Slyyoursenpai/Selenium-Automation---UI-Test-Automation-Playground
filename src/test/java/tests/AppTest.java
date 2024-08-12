package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AppPage;
import pages.MainPage;

import java.util.UUID;

public class AppTest extends BaseTest {
    private final static String USER_NAME = UUID.randomUUID().toString();
    private final static String PASSWORD = "pwd";

    @Test
    public void appTest() {
        MainPage mainPage = new MainPage();
        mainPage.clickLink();

        AppPage app = new AppPage();
        Assert.assertTrue(app.state().isDisplayed(), "Page is not open");

        app.enterUserName(USER_NAME);
        app.enterPass(PASSWORD);
        app.loginPress();

        String welcomeMessage = app.getWelcomeMessage();
        Assert.assertTrue(welcomeMessage.contains(USER_NAME),"Welcome message does not contain username");
    }
}
