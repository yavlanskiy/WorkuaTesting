package Steps;

import com.codeborne.selenide.WebDriverRunner;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Selenide.*;

/**
 * Created by YavlanskiyMS on 02.03.2016.
 */
public class RegistrationSteps {

    @Step
    public void logOut(){
        open("http://www.work.ua/employer/");
        sleep(1000);
        $("#auth>a:nth-child(3)").click();

    }
}
