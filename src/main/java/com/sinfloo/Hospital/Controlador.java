package com.sinfloo.Hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
        @RestController
@RequestMapping("/api")
        public class Controlador {

        @Autowired
        PessoaRepositor repositor;

        @GetMapping("/pessoas")
        public List<Pessoa> getAllPessoas() {
        System.out.println("Pegue Todos eles...");

        List<Pessoa> pessoas = new ArrayList<>();
            repositor.findAll().forEach(pessoas::add);

        return pessoas;
        }






}
