package org.dizzo.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DemoController {
    @GetMapping("helloworld")
    public String getRequest(){
        return "helloworld";
    }

}
