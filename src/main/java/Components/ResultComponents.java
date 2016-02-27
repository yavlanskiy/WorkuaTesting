package Components;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by YavlanskiyMS on 25.02.2016.
 * ResultComponents
 */
public class ResultComponents {

    public ElementsCollection getJobsListSearch(){
        return $$(".job-link");
    }

    public SelenideElement nextPageLinc(){
        return $(Selectors.byText("Следующая"));
    }

    public SelenideElement previousPageLinc(){
        return $(Selectors.byText("Предыдущая"));
    }
}
