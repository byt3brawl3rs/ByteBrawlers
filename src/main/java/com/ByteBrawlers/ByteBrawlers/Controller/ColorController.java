package com.ByteBrawlers.ByteBrawlers.Controller;

import com.ByteBrawlers.ByteBrawlers.Service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ColorController {

    @Autowired
    private ColorService colorService;

    public ColorController(ColorService colorService) {
        this.colorService = colorService;
    }
}
