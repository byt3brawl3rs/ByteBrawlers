package com.ByteBrawlers.ByteBrawlers.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientForwardController {

    @GetMapping(value = "/hello")
    public String forward() {
        return "forward:/";
    }
}
