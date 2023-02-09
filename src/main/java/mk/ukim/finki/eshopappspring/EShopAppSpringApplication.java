package mk.ukim.finki.eshopappspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class EShopAppSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(EShopAppSpringApplication.class, args);
    }

}
