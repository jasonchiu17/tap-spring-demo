package com.example.springboot;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoAppController {
   @RequestMapping(value = {"/index", "/"} )
   public String index() {
      // return "index";
      return "index-v2";
   }
}
