package com.dio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


// scope prototype retira o objeto do scope Singleton e permite mais de uma objeto criado, ou seja mais de uma instância
//quando o escopo estiver em prototype, não será criado automaticamente o Bean da classe, apenas quando for chamada ou iniciada


@Component()
@Scope(value = "prototype")
public class Alien {

    private int aid;
    private String name;
    private String tech;
    @Autowired
    @Qualifier("laptopAlienFoda")    // o nome do objeto laptop no container
    private Laptop laptop;


    public Alien() {
        System.out.println("EU FUI CRIADO - ALIEN");
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public void show()
    {
        System.out.println("EU SOU ALIEN VINDO DO BEAN");
        System.out.println("Meu nome é " + this.name);
        System.out.println("Tenho Tech em " + this.tech);
        laptop.compile();
    }
}
