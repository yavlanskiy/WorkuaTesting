package Steps;

import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by YavlanskiyMS on 02.03.2016.
 */
public class RegistrationSteps {

    @Step
    public void logOut(){
        open("http://www.work.ua/employer/");
        $("#auth>a:nth-child(3)").click();

    }
}
