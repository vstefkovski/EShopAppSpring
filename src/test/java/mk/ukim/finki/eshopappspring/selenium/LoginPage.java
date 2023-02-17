package mk.ukim.finki.eshopappspring.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage {

    private WebElement username;

    private WebElement password;

    private WebElement submit;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public static LoginPage openLogin(WebDriver driver) {
        get(driver, "/login");
        System.out.println(driver.getCurrentUrl());
        return PageFactory.initElements(driver, LoginPage.class);

    }

    public static ProductPage doLogin(WebDriver driver, LoginPage loginPage, String username, String password) {
        loginPage.username.sendKeys(username);
        loginPage.username.sendKeys(password);
        loginPage.submit.click();
        System.out.println(driver.getCurrentUrl());
        return PageFactory.initElements(driver, ProductPage.class);
    }

    public void assertElement(int productsNumber, int deleteButtons, int editButtons, int cartButtons, int addButtons) {

    }
}
