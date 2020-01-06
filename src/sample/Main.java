package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../style/sample.fxml"));
        primaryStage.setTitle("Hello World");



        Scene scene =new Scene(root, 713, 620);
        primaryStage.setScene(scene);


        primaryStage.show();
      //  Thread.sleep(1000);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
