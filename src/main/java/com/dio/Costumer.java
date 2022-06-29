package com.dio;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class Costumer {
    private String name;
    private Adress adress;

    public Costumer(String name, Adress adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
