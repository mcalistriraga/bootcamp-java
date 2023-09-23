package com.bootcamp.bootcamptrivia.entities;

import java.util.List;

public class Categoria {
    // propiedades
    private String category;
    private String description;

    public Categoria() {

    }
    public Categoria(String category, String description) {
        this. category = category;
        this.description = description;
    }


    //métodos: Getter and Setters
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
