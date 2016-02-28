package Components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by KAIN on 28.02.2016.
 * RegistrationComponents
 */
public class RegistrationComponents {

    public SelenideElement getFirstNameInput(){
        return $("#first_name");
    }

    public SelenideElement getLastNameInput(){
        return $("#last_name");
    }

    public SelenideElement getEmailInput(){
        return $("#email");
    }

    public SelenideElement getPasswordInput() {
        return $("#password");
    }

    public SelenideElement getRegistrationButton() {
        return $(".btn.btn-default.btn-block");
    }
}
