package sample;

import java.util.ArrayList;
import java.util.List;

public class CarPark {
    int x1;
   int []axis ;
    static int i=1;
    static int count=0;

static List<Car> cars =new ArrayList<Car>();
 public List<ParkPlace> parkPlaces = new ArrayList<ParkPlace>();

    private int capacity=9;


    public CarPark(boolean right){

        axis=new int[8];


    while(count<capacity){
       parkPlaces.add(new ParkPlace(i));
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
