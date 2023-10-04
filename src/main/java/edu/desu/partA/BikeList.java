package edu.desu.partA;

import java.util.ArrayList;

public class BikeList {

    public BikeList(){
    }

    public void fillArray(ArrayList<Bike> bikes){
        for(int x = 0 ; x < 10; x++){
            int rando = (int) (Math.random() * 10) +1 ;
            if(rando%2 != 0){
               bikes.add(new MountainBike());
            }else {
                bikes.add(new RoadBike());
            }

        }
    }

    public int calculateStock(ArrayList<Bike> bikes){
        int sold = 0;
        for (Bike bike:bikes) {
            if (bike instanceof MountainBike){
                sold ++;
            }
        }
        return sold;
    }

    public void displayInventory(ArrayList<Bike> bikes){
        for (Bike bike:bikes) {
            bike.printDescription();
        }
    }

    public void displayBikeNumber(ArrayList<Bike> bikes){
        int mb = calculateStock(bikes);
        int rb = 10 - mb;
        System.out.println("Stock Levels");
        System.out.println("We have "+ mb + " Mountain Bikes in stock");
        System.out.println("We have "+ rb + " Road Bikes in stock");
    }

    public void start(){
        int mountainBikeSales = 0;
        int roadBikeSales = 0;
        ArrayList<Bike> bikes  = new ArrayList<>();
        fillArray(bikes);
        displayInventory(bikes);
        displayBikeNumber(bikes);
    }

    public static void main(String[] args) {
        BikeList bikeList = new BikeList();
        bikeList.start();


    }
}
