package Steps;

import Components.RegistrationComponents;
import ru.yandex.qatools.allure.annotations.Step;
import Model.UserDegreeCandidate;

/**
 * Created by KAIN on 28.02.2016.
 * RegistrationUserDegreeSteps
 */
public class RegistrationUserDegreeSteps {

    RegistrationComponents registrationComponents;

    {
        registrationComponents = new RegistrationComponents();
    }

    @Step
    public void registrationUserDegree(UserDegreeCandidate candidat){
        registrationComponents.getFirstNameInput().sendKeys(candidat.getName());
        registrationComponents.getLastNameInput().sendKeys(candidat.getLastName());
        registrationComponents.getEmailInput().sendKeys(candidat.geteMail());
        registrationComponents.getPasswordInput().sendKeys(candidat.getPass());
        registrationComponents.getRegistrationButton().click();
    }
}
