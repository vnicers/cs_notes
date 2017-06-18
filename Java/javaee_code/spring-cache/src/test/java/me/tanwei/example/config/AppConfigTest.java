package me.tanwei.example.config;

import lombok.extern.slf4j.Slf4j;
import me.tanwei.example.SpringCacheApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by kelp on 2017/5/20.
 */

@Slf4j
public class AppConfigTest extends SpringCacheApplicationTests {

    @Autowired
    private AppConfig appConfig;

    @Test
    public void testConfig(){
        log.info("{}",appConfig);
    }
}