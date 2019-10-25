package org.vamos.joy.webapp.web;

import java.util.Date;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

    private String message = "Hello World";


    @RequestMapping("/")
    @ResponseBody
    public String welcome() {

        return "COUCOU C'EST MOI";
    }

}