package org.blackdog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by para042 on 2017-07-26.
 */
@RestController
@RefreshScope
public class AController {


  @Value("${health.config.enabled}")
  private String message;

  @Autowired
  private Environment env;


  @RequestMapping("/")
  String getMessage() {

            System.out.println("env : " + env.getProperty("spring.cloud.config.server.git.uri"));
            System.out.println("message : " + message);
    return "toto";
  }
}
