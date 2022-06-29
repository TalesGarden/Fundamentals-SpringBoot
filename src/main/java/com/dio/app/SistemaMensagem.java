package com.dio.app;

import org.springframework.boot.CommandLineRunner;

import java.util.List;

public class SistemaMensagem implements CommandLineRunner {

    private String nome;
    private String email;
    private List<Long> telefones;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por " + this.nome + " Email: " + this.email + " telefone ");
    }




}
