package com.wyc.rhapsody.backend;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 后台接口
 * <p>
 * 1.前台API
 * 2.后台前端API
 *
 * @author knox
 */
@Slf4j
@EnableCaching
@MapperScan("com.wyc.rhapsody.backend.mapper")
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        log.info("server_url-------------->http://127.0.0.1:10000 ⚡");
        log.info("server_api-------------->http://127.0.0.1:10000/swagger-ui.html 📕");
    }

}
