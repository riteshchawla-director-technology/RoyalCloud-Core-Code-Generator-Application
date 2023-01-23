package royal.cloud.microservices.code.generator.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableScheduling
public class RoyalCloudCodeGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoyalCloudCodeGeneratorApplication.class, args);
    }

    @RestController
    public static class WarInitializerController {

        @GetMapping("/")
        public String handler() {
            return "welcome";
        }
    }
}
