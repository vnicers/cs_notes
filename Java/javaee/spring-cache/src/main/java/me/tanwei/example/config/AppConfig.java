package me.tanwei.example.config;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by kelp on 2017/5/20.
 */
@Data
@Component
@PropertySource("classpath:config/config.properties")
@ConfigurationProperties("app")
public class AppConfig {
    @NotEmpty
    private String name;

    @NotEmpty
    private String version;

}
