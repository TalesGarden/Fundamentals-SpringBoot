package com.dio.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
public class SistemaMensagem implements CommandLineRunner {

    @Autowired
    private Remetente remetente;

    // @Value busca no arquivo application.properties os valores de cada campo. Caso não encontre
    // o atributo no arquivo, existe a possibilidade de um valor padrão ao realizar a anotação ex :
    //     @Value("${name: Dio}"), observe que o atributo está escrito com "NAME" e não "Nome" logo o nome
    // atribuido será DIO e não o valor encontrado no arquivo properties

//    @Value("${remetente.nome: Dio}")
//    private String nome;
//    @Value("${remetente.email}")
//    private String email;
//    @Value("${remetente.telefones}")
//    private List<Long> telefones;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por " + remetente.getNome()
                + "\nEmail: " + remetente.getEmail() +
                " \nCom telefones para contato "+ remetente.getTelefones());
        System.out.println("SEU CADASTRO FOI APROVADO");
    }




}
