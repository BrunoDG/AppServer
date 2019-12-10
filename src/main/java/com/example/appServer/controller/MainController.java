package com.example.appServer.controller;

import com.example.appServer.model.Pessoa;
import com.example.appServer.service.PessoasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private PessoasService pessoasService;

    @GetMapping("/pessoas")
    public ResponseEntity<List<Pessoa>> getPessoas() {
        return ResponseEntity.ok(pessoasService.getPessoas());
    }

}
