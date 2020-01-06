package Controller;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.scene.shape.CubicCurve;
import sample.Car;
import FileManager
import sample.CarPark;
import sample.ParkPlace;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;


public class ParkControler implements Initializable,Runnable {


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
        run();
        System.out.println("button start clicked");

    }

    public void park(int a){
    }


    public synchronized void park(ParkPlace parkPlace,CubicCurve lane4){

        Car car = null;
        try {
            car = new Car();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
       //this two variables to set position
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        paneP.getChildren().add(car.getImg());
        car.getImg().setX(car.getPosX());
        car.getImg().setY(car.getPosY());
        car.park(parkPlace, lane4);



        carPark.setCapacity((carPark.getCapacity())-1);



    }


    public void appAxis(int place){
        List values =
    }

    @Override
    public void run() {

        for(ParkPlace pP: carPark.parkPlaces) {

            System.out.println(pP.getId());
            if (pP.isEmpty() == true){
                if ((pP.getId() == 1 || pP.getId() == 2 || pP.getId() == 7)) {
                    // the test value 1 or 0 is for chosing between functions
                    this.park(pP,null);
                } else  {
                    switch (pP.getId()) {
                        case 3:
                            lane4.setEndX(56);
                            lane4.setEndY(228);
                            lane4.setControlX2(144);
                            lane4.setControlY2(388);
                            this.park(pP, lane4);
                            break;
                        case 4:
                            lane4.setEndX(212);
                            lane4.setEndY(222);
                            this.park(pP,lane4)  ;
                            break;

                        case 5:  lane4.setEndX(58);
                            lane4.setEndY(136);
                            break;

                        case 6:

                            this.park(pP, lane4);
                            break;

                    }


                }

            }

        }


    }
}
