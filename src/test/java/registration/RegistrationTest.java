package registration;

import Model.UserDegreeCandidate;
import Steps.LogInSteps;
import Steps.RegistrationUserDegreeSteps;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by KAIN on 28.02.2016.
 * RegistrationTest
 */
public class RegistrationTest extends BaseTest {

    RegistrationUserDegreeSteps registrationUserDegreeSteps;
    LogInSteps logInSteps;

    {
        registrationUserDegreeSteps = new RegistrationUserDegreeSteps();
        logInSteps = new LogInSteps();
    }

    @Test(description = "")
    public void registrationRandomUser() {
        UserDegreeCandidate candidate = new UserDegreeCandidate().setRandomUser();
        registrationUserDegreeSteps.registrationUserDegree(candidate);

        $(".container h1").shouldHave(Condition.exactText("Добро пожаловать, " + candidate.getName() + "!"));
        Assert.assertTrue($(".alert.alert-success").isDisplayed());

        registrationUserDegreeSteps.logOut();
    }

    @Test(description = "")
    public void registrationRandomUserAndLogIn() {
        UserDegreeCandidate candidate = new UserDegreeCandidate().setRandomUser();
        registrationUserDegreeSteps.registrationUserDegree(candidate);

        $(".container h1").shouldHave(Condition.exactText("Добро пожаловать, " + candidate.getName() + "!"));
        Assert.assertTrue($(".alert.alert-success").isDisplayed());

        registrationUserDegreeSteps.logOut();
        logInSteps.logInNotName(candidate);
        $(".container h1").shouldHave(Condition.exactText("Добро пожаловать, " + candidate.getName() + "!"));
    }

}
