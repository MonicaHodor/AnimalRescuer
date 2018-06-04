package org.fasttrackit;

public class CatFood extends Food {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CatFood(String name) {
        super(name);


    }
}
