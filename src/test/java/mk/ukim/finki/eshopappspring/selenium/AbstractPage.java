package mk.ukim.finki.eshopappspring.selenium;

import org.openqa.selenium.WebDriver;

public class AbstractPage {

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebDriver driver;

    static void get(WebDriver driver, String relativeUrl) {
        String url = System.getProperty("get.build.baseUrl", "http://localhost:9999") + relativeUrl;
        driver.get(url);
    }
}
