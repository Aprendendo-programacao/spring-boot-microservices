package me.gabreuw.springbootmicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({"me.gabreuw.core.model"})
@EnableJpaRepositories({"me.gabreuw.core.repository"})
public class SpringBootMicroservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMicroservicesApplication.class, args);
    }

}
