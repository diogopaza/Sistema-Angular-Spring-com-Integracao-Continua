package com.diogo_paza.sistemadiogo.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diogo_paza.sistemadiogo.dto.LoginDTO;



@RestController
@RequestMapping("login")
public class Autenticacao {
    public String login(@RequestBody LoginDTO login){
        return "";
    }
}
