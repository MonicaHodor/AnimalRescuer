package org.fasttrackit;

public class Rescuer {

    private String rescuerName;


    public void feed (Animal animal,Food food) {
        System.out.println(rescuerName + " just feed " + animal.getName() + " with " + food.getName());
        double currentHungerLevel = animal.getHungerLevel();
        animal.setHungerLevel( currentHungerLevel-1);
    }

    public String getRescuerName() {
        return rescuerName;
    }

    public void setRescuerName(String rescuerName) {
        this.rescuerName = rescuerName;
    }

    public void entertain (Animal animal, EntertainmentActivity entertainmentActivity){
            System.out.println(rescuerName + "just play with" +animal.getName()  + entertainmentActivity.getName());




    }
}

