package Steps;

import Components.SearchComponents;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by YavlanskiyMS on 23.02.2016.
 * SearchSteps
 */
public class SearchSteps {

    SearchComponents searchComponents;

    public SearchSteps() {
        searchComponents = new SearchComponents();
    }

    @Step
    public void searchPositionInput(String positionName){
        searchComponents.inputFindPosition().clear();
        searchComponents.inputFindPosition().setValue(positionName).pressEnter();
    }
    @Step
    public void clearSearchField(){
        searchComponents.inputFindPosition().clear();
    }

    @Step
    public SearchSteps setSearchLocation(String city){
        searchComponents.inputFindLocation().clear();
        searchComponents.inputFindLocation().setValue(city);
        return this;
    }

}
