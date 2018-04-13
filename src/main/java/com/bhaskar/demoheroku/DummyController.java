package com.bhaskar.demoheroku;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DummyController {

  @RequestMapping("/dummyurl")
  public String dummyUrl() {
    return "dummy.html";
  }

}
