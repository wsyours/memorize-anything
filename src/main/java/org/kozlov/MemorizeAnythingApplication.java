package org.kozlov;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "org.kozlov")
@Configuration
@EnableJpaRepositories(basePackages = "org.kozlov.db.repository")

public class MemorizeAnythingApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemorizeAnythingApplication.class, args);
    }
}