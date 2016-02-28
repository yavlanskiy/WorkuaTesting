package registration;

import Model.UserDegreeCandidate;
import Steps.RegistrationUserDegreeSteps;
import org.testng.annotations.Test;

/**
 * Created by KAIN on 28.02.2016.
 * RegistrationTest
 */
public class RegistrationTest extends BaseTest {

    RegistrationUserDegreeSteps registrationUserDegreeSteps;

    {
        registrationUserDegreeSteps = new RegistrationUserDegreeSteps();
    }

    @Test
    public void registrationRandomUser(){
        UserDegreeCandidate candidat = new UserDegreeCandidate().setRandomUser();
        registrationUserDegreeSteps.registrationUserDegree(candidat);
    }

}
