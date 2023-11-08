package com.fastcampus.projectarticle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class FastCampusProjectArticleApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastCampusProjectArticleApplication.class, args);
    }

}
