package com.KunalTTNSpringApp.Spring_Boot_Assignment.Config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix ="employee")
public class AppConfig {
    private Integer companyId;
    private String company;
    private String location;
}
