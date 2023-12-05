package com.ByteBrawlers.ByteBrawlers.Controller;

import com.ByteBrawlers.ByteBrawlers.Service.FormFactorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class FormFactorController {

    @Autowired
    private FormFactorService formFactorService;

    public FormFactorController(FormFactorService formFactorService) {
        this.formFactorService = formFactorService;
    }
}
