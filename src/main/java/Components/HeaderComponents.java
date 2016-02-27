package Components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by YavlanskiyMS on 26.02.2016.
 * HeaderComponents
 */
public class HeaderComponents {

    public SelenideElement getLoginButton(){
        return $(".btn.btn-default.hidden-xs");
    }

}
