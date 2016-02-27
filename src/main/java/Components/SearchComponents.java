package Components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by YavlanskiyMS on 23.02.2016.
 */
public class SearchComponents {

    public SelenideElement inputFindPosition(){
        return $("#search");
    }

    public SelenideElement inputFindLocation(){
        return $(".input-search-city input:nth-child(1)");
    }
}
