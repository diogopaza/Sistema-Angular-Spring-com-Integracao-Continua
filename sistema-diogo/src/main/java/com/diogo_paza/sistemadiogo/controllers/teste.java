package com.diogo_paza.sistemadiogo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * teste
 */
@RestController
@RequestMapping("api/example")
public class teste {

    @GetMapping
    public String testeInicial(){
        return "Diogo senior ";
    }    
}