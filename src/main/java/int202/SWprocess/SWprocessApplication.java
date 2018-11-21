package int202.SWprocess;

import java.security.Principal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableAutoConfiguration
@SpringBootApplication

public class SWprocessApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(SWprocessApplication.class, args);
    }
}
