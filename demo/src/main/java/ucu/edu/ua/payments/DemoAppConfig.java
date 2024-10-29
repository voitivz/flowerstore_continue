package ucu.edu.ua.payments;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoAppConfig {
    @Bean
    public String getData() {
        return "Hello, world";
    }
}