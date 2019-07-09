package pages.programs;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.Reader;

import java.io.IOException;


public class _TestBase {

    private static final Logger log = LogManager.getLogger(_TestBase.class);
    private SelenideElement login = $(".c-programs > a");


    @Step("Przejście na stronę logowania")
    public void clickLogin() {
        login.click();
    }
/*
    public static void open(String url) throws IOException {
        Reader objReader = new Reader();
        Configuration.holdBrowserOpen = false;
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        Configuration.headless = false;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        objReader.environmentPropertiesLoader();
        open(url);
    }
*/

}