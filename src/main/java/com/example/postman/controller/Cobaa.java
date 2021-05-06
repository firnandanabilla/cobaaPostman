package com.example.postman.controller;

import com.example.postman.dto.CobaaDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/biodata")
public class Cobaa {

    @GetMapping()
    public CobaaDto getDosen() {
        CobaaDto c = new CobaaDto();
        c.setAlamat("malang");
        c.setNamaDosen("bella");
        return c;
    }
}
