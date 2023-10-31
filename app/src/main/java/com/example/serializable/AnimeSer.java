package com.example.serializable;

import java.io.Serializable;

public class AnimeSer implements Serializable {
    private int id;
    private String name;
    private String description;
    private String type;
    private int year;
    private String image;
    private String favorite;

    public AnimeSer(int id, String name, String description, String type, int year, String image, String favorite) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.year = year;
        this.image = image;
        this.favorite = favorite;
    }

    public AnimeSer() {

    }
}
