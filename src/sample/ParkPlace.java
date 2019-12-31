package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ParkPlace {

    //these variables will be used in transition 1st type
        private int x1;
        private int x2;
        private int x3;
        private int y2;
        private int y3;
        private int rot1;
        private int rot2;


List<Car> cars=new ArrayList<Car>();
private int id;
private int nbr=1;
private boolean isEmpty=true;


        public ParkPlace(int id,int pos){




        }

        public ParkPlace(int id){

                this.x2=40;
                this.y2=-80;
                this.y3=-157;
                this.rot1=-90;
                this.x3=(id==1||id==7)?-75:85; //this condition check if the place is in park 1 or 3 and give x3
                //this.rot2=(id==1||id==7)?-29:29;
            //this.rot2=(id>=1&& id<=3)?-29:(id>=7&& id<=9)?-29:29;
            this.rot2=(id==1||id==7)?-29:29;
            if(id>=1&& id<=6){
                        this.x1=170;

            }
                else {
                        this.x1=523;

            }
           // System.out.println("car parking in slot "+id);
            nbr++;
                this.id=id;

        }


public boolean isEmpty(){
        //System.out.println((isEmpty)?"slot "+id+ " is empty ":"slot "+id+ " is not empty ");
                return this.isEmpty;

}


        public void setEmpty(boolean empty) {
                isEmpty = empty;

                System.out.println((empty)?"slot "+id+ " is empty ":"slot "+id+ " is not empty ");
        }

        public int getNbr() {
                return nbr;
        }


      //getters for fetching coordinates
        public int getId() {
                return id;
        }


        public int getX1() {
                return x1;
        }

        public int getX2() {
                return x2;
        }

        public int getX3() {
                return x3;
        }

        public int getRot1() {
                return rot1;
        }

        public int getRot2() {
                return rot2;
        }

        public int getY2() {
                return y2;
        }

        public int getY3() {
                return y3;
        }
}
