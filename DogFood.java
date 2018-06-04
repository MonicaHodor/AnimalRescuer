package org.fasttrackit;

public class DogFood extends Food  {

   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DogFood(String name) {
        super(name);


    }
}
