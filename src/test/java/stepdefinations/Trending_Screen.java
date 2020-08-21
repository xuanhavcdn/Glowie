package stepdefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.Hook;

public class Trending_Screen {
    private WebDriver driver;

    public Trending_Screen() {
        this.driver = Hook.getDriver();
    }
    @And("^I click filter button$")
    public void iClickFilterButton() {
        driver.findElement(By.id("com.glowie.staging:id/ivContestType")).click();
    }


    @And("^I select contest \"([^\"]*)\" to view Trending$")
    public void iSelectContestToViewTrending(String contestname) throws Throwable {
        driver.findElement(By.xpath("//*[@resource-id='com.glowie.staging:id/tvLabel' and @text='Automation Trending Test']")).click();
//        driver.findElement(By.id("com.glowie.staging:id/tvLabel")).click();
    }

    @Then("^Default Trending screen with no post is displayed success$")
    public void defaultTrendingScreenWithNoPostIsDisplayedSuccess() {
        driver.findElement(By.id("com.glowie.staging:id/btnJoinContest")).isDisplayed();
    }

    @And("^I select contest \"([^\"]*)\" to view Trending by scroll$")
    public void iSelectContestToViewTrendingByScroll(String arg0) throws Throwable {
        //capture all the list items
        AndroidElement list=(AndroidElement)driver.findElement(By.id("com.glowie.staging:id/tvUserName"));
        //Scrolling down till we get the element
        MobileElement listitem = (MobileElement) driver.findElement(
                MobileBy.AndroidUIAutomator(
                        "new UiScrollable (new UiSelector()).scrollIntoView("
                        + "new UiSelector().description(\"chau iphone\"));"));
        System.out.println(listitem.getLocation());
        listitem.click();
    }

    @And("^click on my pick bottom$")
    public void clickOnMyPickBottom() {
        driver.findElement(By.id("com.glowie.staging:id/ivTabPick")).click();
    }

    @And("^Click on user picked$")
    public void clickOnUserPicked() {
        driver.findElement(By.xpath("//*[@resource-id='com.glowie.staging:id/tvUserName' and @text = 'chau iphone']")).click();
    }
}
