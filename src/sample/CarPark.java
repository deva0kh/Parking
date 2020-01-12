package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarPark {
    int x1;
   int []axis ;
    static int i=1;
    static int count=0;

static List<Car> cars =new ArrayList<Car>();
 public List<ParkPlace> parkPlaces = new ArrayList<ParkPlace>();

    private int capacity=9;


    public CarPark(boolean right){
        Random r = new Random();

        axis=new int[8];


    while(count<10){
       parkPlaces.add(new ParkPlace(r.nextInt((9 - 0) + 1) + 0));
        //
        count++;
    }/*
    for(ParkPlace pP: parkPlaces){
        pP.id=i;
        i++;
    }*/
}
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }


}
