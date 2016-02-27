package Steps;

import Components.CardComponents;
import com.codeborne.selenide.ElementsCollection;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by YavlanskiyMS on 25.02.2016.
 */
public class CardSteps {

    CardComponents cardComponents;

    public CardSteps() {
        cardComponents = new CardComponents();
    }

    @Step
    public boolean contains(ElementsCollection description, String containsElement){
        for (String element : description.getTexts()){
            if (element.contains(containsElement)){
                return true;
            }
        }
        return false;
    }

    @Step
    public ElementsCollection getDescriptionPosition(){
        return cardComponents.getDescriptionPosition();
    }
}
