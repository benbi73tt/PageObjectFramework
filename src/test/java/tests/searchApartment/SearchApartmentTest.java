package tests.searchApartment;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BasTest;

import static constant.ConstantTime.Urls.REALT_HOME_PAGE;

public class SearchApartmentTest extends BasTest {


    @Test
    public void checkIsRedirectToListing() {
        basPage.open(REALT_HOME_PAGE);

        realtHomePage
                .enterCountRooms()
                .clickToFind();

        realtListingPage.checkCountCards();
    }
}
