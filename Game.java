package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {


    private Animal firstTipe;
    private Animal secondTipe;

    private List<Food> availableFood = new ArrayList<Food>();
    private EntertainmentActivity[] availableActivities = new EntertainmentActivity[2];

    private void initFood() {
        availableFood.add(new Food("Pedigree"));
        availableFood.add(new Food("Purina"));
    }


    private void initActivities() {
        availableActivities[0] = new EntertainmentActivity();
        availableActivities[1] = new EntertainmentActivity();


    }

    private void foodTipe() {
        System.out.println(" available Food " + " Pedigree " + " Purina ");
    }

    private void activityTipe() {
        System.out.println(" available activities " + " throw the ball " + " climb in the tree ");
    }





    public List<Food> getAvailableFood() {
        return availableFood;
    }

    public EntertainmentActivity[] getAvailableActivities() {
        return availableActivities;
    }

    public void start() {



        Animal animal1 = new Animal();
        animal1.setAnimalTipe("dog");
        animal1.setName("Bernard");
        animal1.setColor("white");

        Food food = new Food("Pedigree");
        Food food1 = new Food("Purina");

        initFood();


        foodTipe();

        Rescuer rescuer = new Rescuer();
        rescuer.setRescuerName("Monix");

        Vet vet = new Vet();
        vet.setVetName("AnimalAid");

        initActivities();

        activityTipe();


        Animal animal2 = new Animal();
        animal2.setAnimalTipe("cat");
        animal2.setName("Donna");
        animal2.setColor("black");






        EntertainmentActivity entertainmentActivity = new EntertainmentActivity();
        entertainmentActivity.setName("throw the ball");
        entertainmentActivity.setName("climb in the tree");





        rescuer.entertain(animal1, availableActivities[0]);
        rescuer.entertain(animal2, availableActivities[1]);

        Animal animal = new Animal();
        rescuer.feed(animal1, food);
        rescuer.feed(animal2, food1);

    }


    public Animal getFirstTipe() {
        return firstTipe;
    }

    public void setFirstTipe(Animal firstTipe) {
        this.firstTipe = firstTipe;
    }

    public Animal getSecondTipe() {
        return secondTipe;
    }

    public void setSecondTipe(Animal secondTipe) {
        this.secondTipe = secondTipe;
    }

    public void setAvailableFood(List<Food> availableFood) {
        this.availableFood = availableFood;
    }

    public void setAvailableActivities(EntertainmentActivity[] availableActivities) {
        this.availableActivities = availableActivities;
    }
}