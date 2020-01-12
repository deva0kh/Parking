package controller;


import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.scene.shape.CubicCurve;
import sample.Car;
import sample.CarPark;
import sample.ParkPlace;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class ParkControler extends Task<Integer> implements Initializable,Runnable {


    @FXML
    private Pane paneP;
  /*  //@FXML
    //private QuadCurve lineP,lineP2;*/
    @FXML
    private CubicCurve lane4;
    //boolean right = ();

    CarPark carPark=new CarPark(true);



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        System.out.println("hello from initial");

    }

    @FXML
    void startButton() {
        call();
        System.out.println("button start clicked");

    }

    public void park(int a){//TODO
    }


    public  void park(ParkPlace parkPlace,CubicCurve lane4){

        Car car = null;
        try {
            car = new Car();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
       //this two variables to set position

        paneP.getChildren().add(car.getImg());
        car.getImg().setX(car.getPosX());
        car.getImg().setY(car.getPosY());
        car.park(parkPlace, lane4);
       // updateProgress(parkPlace.getId(),10);


        carPark.setCapacity((carPark.getCapacity())-1);

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public void appAxis(int place){
        List<Integer> values = ReadAxis.appeandAxis(place);
        lane4.setStartX(values.get(2));
        System.out.print(" "+values.get(2));
        lane4.setStartY(values.get(3));
        lane4.setEndX(values.get(4));
        lane4.setEndY(values.get(5)) ;
        lane4.setControlX1(values.get(6));
        lane4.setControlY1(values.get(7));
        lane4.setControlX2(values.get(8));
        lane4.setControlY2(values.get(9));

        Iterator<Integer> itr = values.iterator();

        while (itr.hasNext())

            System.out.print(itr.next()+ " ");

    }


    public Integer call() {
double x=3,max=10;
        for(ParkPlace pP: carPark.parkPlaces) {

            System.out.println(pP.getId());
            if (pP.isEmpty() == true){
                if ((pP.getId() == 1 || pP.getId() == 2 || pP.getId() == 7)) {
                    // the test value 1 or 0 is for chosing between functions
                    this.park(pP,null);
                } else  {
                    switch (pP.getId()) {
                        case 3:
                            appAxis(0);
                            this.park(pP, lane4);
                            break;
                        case 4:
                            appAxis(10);
                            this.park(pP,lane4)  ;
                            break;

                        case 5:
                            appAxis(20);
                            this.park(pP,lane4)  ;
                            break;

                        case 6:
                            appAxis(30);
                            this.park(pP, lane4);
                            break;
                          // updateProgress(x, max);

                    }


                }

            }

        }
return 22;



    }

    }


