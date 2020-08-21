package stepdefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;
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
        driver.findElement(By.xpath("//*[@resource-id='com.glowie.staging:id/tvLabel' and @text='Automation Trending Test' and @bounds='[81,1935][954,2152]']")).click();
//        driver.findElement(By.id("com.glowie.staging:id/tvLabel")).click();
    }

    @Then("^Default Trending screen with no post is displayed success$")
    public void defaultTrendingScreenWithNoPostIsDisplayedSuccess() {
        driver.findElement(By.id("com.glowie.staging:id/btnJoinContest")).isDisplayed();
    }
}
