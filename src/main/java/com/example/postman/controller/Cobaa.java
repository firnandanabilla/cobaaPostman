package com.example.postman.controller;

import com.example.postman.dto.CobaaDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class Cobaa {

    @GetMapping()
    public CobaaDto getDosen(@RequestBody CobaaDto cobaaDto) {
        CobaaDto c = new CobaaDto();
        c.setId(cobaaDto.getId());
        c.setNamaDosen(cobaaDto.getNamaDosen());
        return cobaaDto;
    }
}
