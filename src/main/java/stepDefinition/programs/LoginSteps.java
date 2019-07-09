package stepDefinition.programs;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.qameta.allure.selenide.AllureSelenide;
import pages.programs.Login;
import pages.programs._TestBase;
import utils.Reader;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;

public class LoginSteps {
    @Given("user is on login page programs")
    public void userIsOnLoginPagePrograms() throws IOException {
        Configuration.holdBrowserOpen = false;
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        Configuration.headless = false;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));

        Reader objReader = new Reader();
        objReader.environmentPropertiesLoader();
        open(objReader.urlPrograms);
    }

    @When("he enters invalid credentials to programs")
    public void heEntersInvalidCredentialsToPrograms() throws InterruptedException {
        Login objLogin = new Login();
        objLogin.login("invalid","invalid");
    }

    @Then("he isn't logged in programs")
    public void heIsnTLoggedInPrograms() {
        System.out.println("niezalogowany");
    }

    @When("he enters valid credentials to programs")
    public void heEntersValidCredentialsToPrograms() throws InterruptedException {
        Login objLogin = new Login();
        objLogin.login("mateuszkrasny@gmail.com","Wniosek1!");
    }

    @Then("he is logged in programs")
    public void heIsLoggedInPrograms() {
        System.out.println("zalogowany");
    }


}
