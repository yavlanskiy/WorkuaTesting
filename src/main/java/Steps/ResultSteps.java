package Steps;

import Components.ResultComponents;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by YavlanskiyMS on 25.02.2016.
 * ResultSteps
 */
public class ResultSteps {

    ResultComponents resultComponents;

    public ResultSteps() {
        resultComponents = new ResultComponents();
    }

    @Step
    public SelenideElement getFirstElementList(){
        return resultComponents.getJobsListSearch().first();
    }

    @Step
    public SelenideElement getLastElementList(){
        return resultComponents.getJobsListSearch().last();
    }

    @Step
    public SelenideElement getForIndexElementList(int index){
        return resultComponents.getJobsListSearch().get(index);
    }

    @Step
    public ResultSteps getNextPage(){
        resultComponents.nextPageLinc().click();
        return this;
    }

    @Step
    public ResultSteps getPreviousPage(){
        if(resultComponents.previousPageLinc().is(Condition.visible)){
            resultComponents.previousPageLinc().click();
        }
        return this;
    }



}
