package org.fasttrackit;

public class Rescuer {

    String rescuerName;


    public void feed (Animal animal,Food food) {
        System.out.println(rescuerName + " just feed " + animal.name + " with " + food.name);
    }
        public void entertain (Animal animal, EntertainmentActivity entertainmentActivity){
            System.out.println(rescuerName + "just play with" +animal.name  + entertainmentActivity.name);


    }
}

