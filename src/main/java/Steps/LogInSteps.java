package Steps;

import Components.LogInComponents;
import Model.UserDegreeCandidate;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by YavlanskiyMS on 26.02.2016.
 * LogInSteps
 */
public class LogInSteps {

    LogInComponents logInComponents;

    public LogInSteps() {
        logInComponents = new LogInComponents();
    }

    @Step("Login")
    public void logIn(String email, String pass){
        logInComponents.getEmailInput().setValue(email);
        logInComponents.getPassportInput().setValue(pass);
        logInComponents.getLoginButton().click();
    }

    @Step("Login")
    public void logIn(UserDegreeCandidate candidate){
        logInComponents.getEmailInput().setValue(candidate.geteMail());
        logInComponents.getPassportInput().setValue(candidate.getPass());
        logInComponents.getLoginButton().click();
    }

    @Step("Login")
    public void logInNotName(UserDegreeCandidate candidate){
        logInComponents.getPassportInput().setValue(candidate.getPass());
        logInComponents.getLoginButton().click();
    }

    @Step
    public boolean isErrorNotification(){
        boolean displayedEmail = logInComponents.getEmailErrorNotification().isDisplayed();
        boolean displayedPassv = logInComponents.getPasswordErrorNotification().isDisplayed();

        if (displayedEmail){
            return true;
        }else if (displayedPassv){
            return true;
        }
        return false;
    }
}
