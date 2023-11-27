package com.example.aula.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
/* 
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;*/

import com.example.aula.demo.model.Pessoa;

@Controller

public class PessoaController {

    @GetMapping("/create")
    public String mostrarhtml() {
        return "create";
    }

    @PostMapping("/create")
    /*
     * public @RequestBody String cadastrar(@RequestParam String nome, String
     * telefone) {
     */

    public void pegarinfos(Pessoa pessoa) {
        System.out.println("Meu nome é: " + pessoa.getNome());
        System.out.println("Meu telefone é: " + pessoa.getTelefone());
    }
    /*
     * Pessoa pessoa = new Pessoa();
     * pessoa.setNome(nome);
     * pessoa.setTelefone(telefone);
     */
}
