package pages.realt_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasPage;

public class RealtHomePage extends BasPage {

    public RealtHomePage(WebDriver driver) {
        super(driver);
    }

    private final By countRooms = By.id("rooms");
    private final By options2rooms = By.xpath("//select[@id='rooms']/option[@value='2']");
    private final By findBtn = By.xpath("//a[text()='Найти'][1]");

    public RealtHomePage enterCountRooms() {
        driver.findElement(countRooms).click();
        driver.findElement(options2rooms).click();

        return this;
    }

    public RealtHomePage clickToFind() {
        WebElement btnFind = driver.findElement(findBtn);
        waitElementIsVisible(btnFind).click();

        return this;
    }
}
