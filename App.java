package org.fasttrackit;


public class App 
{
    public static void main( String[] args){

             Game game=new Game();


        Animal animal1=new Animal();
        animal1.AnimalTipe= "dog";
        animal1.name="Bernard";
        animal1.color="white";


        Food food=new Food("Pedigree");
        food.Quantity=100;

        DogFood dogFood = new DogFood("Pedigree");


        Rescuer rescuer=new Rescuer();
        rescuer.rescuerName="Monix";

        Vet vet=new Vet();
        vet.VetName="AnimalAid";

        EntertainmentActivity entertainmentActivity = new EntertainmentActivity();
        entertainmentActivity.name = "throwtheball";

        Animal animal2 = new Animal();
        animal2.AnimalTipe="cat";
        animal2.name="Donna";
        animal2.color="black";

        CatFood catFood=new CatFood("Purina");

        EntertainmentActivity entertainmentActivity1 = new EntertainmentActivity();
        entertainmentActivity1.name = "climbinthetree";



        rescuer.feed(animal1, food);

        rescuer.entertain(animal1,entertainmentActivity);
        rescuer.entertain(animal2,entertainmentActivity1);




















    }








    {
    }
}
