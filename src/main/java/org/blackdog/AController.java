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


  @Value("${group1.b}")
  private String message;

  @RequestMapping("/")
  String getMessage() {
    return "toto " + message;
  }
}
