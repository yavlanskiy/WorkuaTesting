package Components;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by YavlanskiyMS on 25.02.2016.
 * CardComponents
 */
public class CardComponents {

    public ElementsCollection getDescriptionPosition(){
        return $$(".overflow.wordwrap");
    }
}
