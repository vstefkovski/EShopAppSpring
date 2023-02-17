package mk.ukim.finki.eshopappspring.selenium;

import mk.ukim.finki.eshopappspring.model.*;
import mk.ukim.finki.eshopappspring.service.CategoryService;
import mk.ukim.finki.eshopappspring.service.ManufacturerService;
import mk.ukim.finki.eshopappspring.service.ProductService;
import mk.ukim.finki.eshopappspring.service.UserService;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@ActiveProfiles("test")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class SeleniumScenarioTest {

    @Autowired
    UserService userService;

    @Autowired
    ManufacturerService manufacturerService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    ProductService productService;

    private HtmlUnitDriver driver;

    private static Category c1;
    private static Category c2;
    private static Manufacturer m1;
    private static Manufacturer m2;

    private static User regularUser;
    private static User adminUser;

    private boolean dataInitialized = false;

    @BeforeEach
    private void setup() {
        this.driver = new HtmlUnitDriver(true);
        initData();
    }


    @AfterEach
    public void destroy() {
        if (this.driver != null) {
            this.driver.close();
        }
    }

    private void initData() {
        if (!dataInitialized) {
            c1 = categoryService.create("c1", "c1");
            categoryService.create("c2", "c2");

            m1 = manufacturerService.save("m1", "m1").get();
            manufacturerService.save("m2", "m2").get();

            String user = "user";
            String admin = "admin";

            regularUser = userService.register(user, user, user, user, user, Role.ROLE_USER);
            adminUser = userService.register(admin, admin, admin, admin, admin, Role.ROLE_ADMIN);
            dataInitialized = true;
        }
    }

    @Test
    public void testScenario() throws Exception {
        LoginPage loginPage = LoginPage.openLogin(this.driver);
    }

}
