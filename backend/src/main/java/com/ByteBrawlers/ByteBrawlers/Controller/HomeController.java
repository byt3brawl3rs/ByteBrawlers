package com.ByteBrawlers.ByteBrawlers.Controller;

@RestController
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}