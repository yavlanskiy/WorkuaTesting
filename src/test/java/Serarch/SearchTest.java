package Serarch;

import Steps.CardSteps;
import Steps.ResultSteps;
import Steps.SearchSteps;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.matchText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by YavlanskiyMS on 23.02.2016.
 * Testing input search positions;
 */
public class SearchTest extends BaseTest {

    SearchSteps searchSteps;
    ResultSteps resultSteps;
    CardSteps cardSteps;

    {
        searchSteps = new SearchSteps();
        resultSteps = new ResultSteps();
        cardSteps = new CardSteps();
    }

    @Test(description = "The test verifies that the resulting list was not empty.")
    public void testingSearchResults() {
        searchSteps.searchPositionInput("QA Automation Engineer");

        Assert.assertFalse($$(".col-md-8.col-left").isEmpty());
    }

    @Test(description = "The test checks for incorrect request")
    public void testingSearchResultsIncorrectRequest() {
        searchSteps.searchPositionInput("qeqweqsd1231232");

        $(".col-md-8.col-left>p>b").shouldBe(Condition.visible);
    }

    @Test(description = "Test selects the first element of the list of vacancies. " +
            "Saves title the vacancy. Enters in the job profile. " +
            "Compares title.")
    public void jobTitleVerificationFirst() {
        searchSteps.searchPositionInput("Manager");
        String expectedText = resultSteps.getFirstElementList().$("h2 a").getText();
        resultSteps.getFirstElementList().click();
        String actualText = $("#h1-name").getText();

        Assert.assertEquals(expectedText, actualText);
    }

    @Test(description = "Test selects the last element of the list of vacancies. " +
            "Saves title the vacancy. Enters in the job profile. " +
            "Compares title.")
    public void jobTitleVerificationLast() {
        searchSteps.searchPositionInput("Manager");
        String expectedText = resultSteps.getLastElementList().$("h2 a").getText();
        resultSteps.getLastElementList().click();
        String actualText = $("#h1-name").getText();

        Assert.assertEquals(expectedText, actualText);
    }

    @Test(description = "Test verifies that required word is present in the job description.")
    public void inJobDescriptionShouldPresentRequestWord() {
        String jobTitle = "продавец";
        searchSteps.setSearchLocation("Харьков");
        searchSteps.searchPositionInput(jobTitle);
        resultSteps.getFirstElementList().click();

        Assert.assertTrue(
                cardSteps.contains(cardSteps.getDescriptionPosition(), jobTitle)
                        ||
                        cardSteps.contains(cardSteps.getDescriptionPosition(), "про"));
    }

    @Test(description = "Test verifies that there is a vacancy in the desired location")
    public void searchByLocation() {
        String locationSearch = "Харьков";
        searchSteps.setSearchLocation(locationSearch);
        searchSteps.searchPositionInput("Тестировщик");
        resultSteps.getFirstElementList().click();

        $(".dl-horizontal").shouldHave(matchText(locationSearch));
    }

    @Test(description = "Test verifies that there is a vacancy in the desired location")
    public void searchByLocationNextPage() {
        String locationSearch = "Харьков";
        searchSteps.setSearchLocation(locationSearch);
        searchSteps.searchPositionInput("реализатор");
        resultSteps.getNextPage();
        resultSteps.getLastElementList().click();

        $(".dl-horizontal").shouldHave(matchText(locationSearch));
    }

}
