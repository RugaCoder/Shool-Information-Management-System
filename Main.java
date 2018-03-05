package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Main extends Application {
 static Parent root;
    public static void main(String[] args) {
        launch (args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle ("Mail App");
        primaryStage.setScene (new Scene(root,419.0, 205.0));
        primaryStage.show();
     // URL location=Main.class.getResource ("sample.fxml");
      //FXMLLoader loader=new FXMLLoader (location);


//        try {

//        } catch (IOException e) {
//            System.out.println ("Bug detected");
//       / }

    }

}
