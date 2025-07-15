package org.aniket.SimpleSpringBootWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//The below implementation will only work if we have static resource(.html) file. that is why if you run below code it will error out saying No static resource found. Because with @controller annotation you need to return the file rather than the actual data. To fix that we can either use @RestController or @ResponseBody.

//@Controller
//public class HomeController {
//
//    @RequestMapping("/")
//    public String greet() {
//        return "Welcome to my site";
//    }
//
//}

@RestController
//@Controller
public class HomeController {

    @RequestMapping("/")
//    @ResponseBody
    public String greet() {
        return "Welcome to my site";
    }

    @RequestMapping("/about")
    public String about() {
        return "This is data for about";
    }

}
