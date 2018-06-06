package org.fasttrackit;

public class Food {

   private String name;
   private double Quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return Quantity;
    }

    public void setQuantity(double quantity) {
        Quantity = quantity;
    }




    public Food(String name) {

        this.name = name;


    }


}
