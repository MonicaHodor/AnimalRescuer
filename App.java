package org.fasttrackit;


public class App 
{
    public static void main( String[] args){

             Game game=new Game();


        Animal animal1=new Animal();
        animal1.setAnimalTipe("dog");
        animal1.setName("Bernard");
        animal1.setColor("white");


        Food food=new Food("Pedigree");
        food.setQuantity(100);

        DogFood dogFood = new DogFood("Pedigree");


        Rescuer rescuer=new Rescuer();
        rescuer.setRescuerName("Monix");

        Vet vet=new Vet();
        vet.setVetName("AnimalAid");

        EntertainmentActivity entertainmentActivity = new EntertainmentActivity();
        entertainmentActivity.setName("throwtheball");

        Animal animal2 = new Animal();
        animal2.setAnimalTipe("cat");
        animal2.setName("Donna");
        animal2.setColor("blck");

        CatFood catFood=new CatFood("Purina");

        EntertainmentActivity entertainmentActivity1 = new EntertainmentActivity();
        entertainmentActivity1.setName("climbinthetree");



        rescuer.feed(animal1, food);

        rescuer.entertain(animal1,entertainmentActivity);
        rescuer.entertain(animal2,entertainmentActivity1);




















    }








    {
    }
}
