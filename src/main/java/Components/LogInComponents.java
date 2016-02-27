package Components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by YavlanskiyMS on 26.02.2016.
 * LogInComponents
 */
public class LogInComponents {

    public SelenideElement getEmailInput(){
        return $("#email");
    }

    public SelenideElement getPassportInput(){
        return $("#password");
    }

    public SelenideElement getLoginButton(){
        return $(".btn.btn-default.btn-block");
    }

    public SelenideElement getRememberCheckBox(){
        return $("#remember");
    }

    public SelenideElement getEmailErrorNotification(){
        return $("email-error");
    }

    public SelenideElement getPasswordErrorNotification(){
        return $("#password-error");
    }
}
