package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasPage;

public class RealtListingPage extends BasPage {

    public RealtListingPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("//div[@class='listing view-format']/div[@data-mode='3']");

    public RealtListingPage checkCountCards() {
        int countCard = driver.findElements(card).size();
        Assert.assertEquals(20, countCard);
        return this;
    }
}
