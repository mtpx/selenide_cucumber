package pages.programs;
        import com.codeborne.selenide.Condition;
        import com.codeborne.selenide.SelenideElement;
        import io.qameta.allure.Step;
        import pages.programs._TestBase;

        import static com.codeborne.selenide.Selenide.$;


public class Login extends _TestBase {

    private static SelenideElement emailInput = $("#email"),
            passwordInput = $("#password"),
            loginButton = $("#loginButton"),
            registerButton = $("##j_idt60"),
            rememberMeCheckbox = $("#remember-me"),
            popupAboutLogin = $(".ui-growl-title");

    @Step("Logowanie za pomoca: user: {0}, pass: {1}")
    public void login(String login, String password) throws InterruptedException {
        $(this.emailInput).clear();
        $(this.passwordInput).clear();
        $(this.emailInput).setValue(login);
        $(this.passwordInput).setValue(password);
        Thread.sleep(200);
        $(this.loginButton).shouldBe(Condition.enabled).click();
    }

    @Step("Pobieranie wiadomosci z bledem logowania")
    public SelenideElement getErrorMessage(){
        return popupAboutLogin;
    }

    public void waitForPopupAboutLogin(){
        popupAboutLogin.shouldBe(Condition.disappear);
    }


}
