package org.blackdog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
//@EnableAutoConfiguration
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

//@RefreshScope
//@RestController
//class MessageRestController {
//
//    @Value("${health.config.enabled}")
//    private String message;
//
//    @Autowired
//    private Environment env;
//
//    @RequestMapping("/")
//    String getMessage() {
//
////        System.out.println("env : " + env.getProperty("spring.cloud.config.server.git.uri"));
//        System.out.println("message : " + message);
//        return this.message;
//    }
//}
