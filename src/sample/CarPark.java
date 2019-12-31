package sample;

import java.util.ArrayList;
import java.util.List;

public class CarPark {
    int x1;
   int []axis ;
    static int i=0;
    static int count=0;

static List<Car> cars =new ArrayList<Car>();
 public List<ParkPlace> parkPlaces = new ArrayList<ParkPlace>();

    private int capacity;


    public CarPark(boolean right){

        axis=new int[8];

    capacity=3;
    while(i<capacity){
       parkPlaces.add(new ParkPlace(i+1));
        i++;
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
