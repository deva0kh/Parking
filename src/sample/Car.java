package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.CubicCurve;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Car {


    private int posX;
  private   int posY;
  private ImageView img;
  private Image image;

    FileInputStream input = new FileInputStream("src/style/7.png");

        public  Car() throws FileNotFoundException {
        this.posX=-100 ;
        this.posY = 520;
            img=new ImageView();
        this.image = new Image(input);



        this.img.setImage(this.image);
            this.img.setFitHeight(83);
           this.img.setFitWidth(37);


        }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public  ImageView getImg() {

        return img;
    }



    public synchronized void park(ParkPlace pPlace, CubicCurve  lane4){

                Handler handler = new Handler();
                handler.parkHandler(this, pPlace, lane4);

        pPlace.setEmpty(false);



    }

        public void leave(){


        }


}
