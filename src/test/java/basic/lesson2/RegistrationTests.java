package basic.lesson2;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RegistrationTests {
    private final By ACCEPT_COOKIES_BTN = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private final By REGISTRATION_BTN = By.xpath(".//strong[@class = 'user-block__title--strong']");
    private final By REGISTRATION_LINK = By.xpath(".//p[@class = 'users-session-form__signup' ]/a");

    @Test
    public void passwordInconsistencyTest() {
        //Open Browser window
        WebDriver browser = new ChromeDriver(); //выбираем браузер
        browser.manage().window().maximize();  //расхлопываем на весь экран
        //Open Home Page
        browser.get("http://1a.lv"); //указали страницу
        //Accept cookies
//        WebElement acceptCookiesBtn = browser.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
//        acceptCookiesBtn.click();
        browser.findElement(ACCEPT_COOKIES_BTN).click();
        //Press Registration btn
//        WebElement registrationBtn = browser.findElement(By.xpath(".//strong[@class = 'user-block__title--strong']"));
//        registrationBtn.click();
        browser.findElement(REGISTRATION_BTN).click();
        //Press Registration link
//        browser.findElement(REGISTRATION_LINK).click();
        WebElement registrationLink = browser.findElement(REGISTRATION_LINK);
        Actions actions = new Actions(browser);
                actions.scrollToElement(registrationLink);
        //Enter First name

        //Enter Last name
        //Enter E-mail
        //Enter Password
        //Enter Password again with mistake
        //Select marketing check-box
        //Select news check-box
        //Press Registration btn
        //Check wrong password error message 
    }
}

