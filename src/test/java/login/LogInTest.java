package login;

import Steps.LogInSteps;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by YavlanskiyMS on 26.02.2016.
 * BaseTest
 */
public class LogInTest extends BaseTest {

    LogInSteps logInSteps;

    {
        logInSteps = new LogInSteps();
    }

    @Test
    public void test(){
        logInSteps.logIn("", "");
        Assert.assertTrue(logInSteps.isErrorNotification());
    }
}
