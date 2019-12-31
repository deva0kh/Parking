package sample;

import javafx.animation.*;

import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.QuadCurve;
import javafx.util.Duration;



/*This Class will handle annimation whereI tried using two types

* the first one handles places 1 4 and 7which is sequence of translate , parallel , rotation and sequence Transitions
* the other one uses path transition and handle all the others spots
* */



public class Handler  {

    public Handler() {


    }

   public void parkHandler(Car car, ParkPlace pkPlace, CubicCurve lineP){
        //get place id
       int test=pkPlace.getId();

       //positions de voiture pour parker dans le 1er et le 4eme, 7eme place
        int x1= pkPlace.getX1();
       int x2=pkPlace.getX2();
       int x3=pkPlace.getX3();
       int y2=pkPlace.getY2();
       int y3=pkPlace.getY3();
       int rot1 =pkPlace.getRot1();
       int rot2=pkPlace.getRot2();


       ParallelTransition pl;//first parallel transition to get to 90
       ParallelTransition pl2;//second parallel transition to park
       SequentialTransition sq1; //first seq transition
       SequentialTransition sql2;//second seq transition
       PathTransition pt;

     //first movement
       TranslateTransition tr1;

       //second movement
       RotateTransition rt;
       TranslateTransition tr2;

       //last movement
       TranslateTransition tr3;
       RotateTransition rt3,rt4;










       System.out.println("this test from handler test= "+ test);
            if(lineP!=null){
                int rota=0;
                if(pkPlace.getId()%2!=0){ rota=-120;} else { rota =120;}
                pt= new PathTransition(Duration.seconds(4),lineP,car.getImg());
               rt4=new RotateTransition(Duration.seconds(4),car.getImg());
               // sq1 = new SequentialTransition(car.getImg(),rt,rt4);
               // sq1.
               rt4.setByAngle(rota);
                rt4.play();
                pt.setDelay(Duration.seconds(0));
                pt.setCycleCount(1);
                pt.play();
            }

            else{

                // first transition to 170 or 5**
                tr1 = new TranslateTransition(Duration.seconds(2),car.getImg());
                tr1.setToX(x1);
                tr1.setToY(0);
                tr1.setCycleCount(1);

                //first rotatiob to get to 90
                rt = new RotateTransition(Duration.seconds(2),car.getImg());
                rt.setByAngle(rot1);
                rt.setCycleCount(1);


                tr2 = new TranslateTransition(Duration.seconds(2),car.getImg());
                tr2.setByX(x2);
                tr2.setByY(y2);
                tr2.setCycleCount(1);

                //translation to -75 or 85
                tr3 = new TranslateTransition(Duration.seconds(2),car.getImg());
                tr3.setByX(x3);
                tr3.setByY(y3);
                tr3.setCycleCount(1);

                //rotation to 29 or -29
                rt3 = new RotateTransition(Duration.seconds(2),car.getImg());
                rt3.setByAngle(rot2);
                rt3.setCycleCount(1);


                pl = new ParallelTransition(car.getImg(), rt, tr2  );

                sq1 = new SequentialTransition(car.getImg(),tr1,pl);
                pl2 = new ParallelTransition(car.getImg(), rt3, tr3 );
                sql2 = new SequentialTransition(car.getImg(), sq1,pl2);
                sql2.play();
                sql2.setDelay(Duration.seconds(3));

            }

        }







}
