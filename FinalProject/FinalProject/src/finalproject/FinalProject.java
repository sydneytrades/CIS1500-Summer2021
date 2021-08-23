package finalproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FinalProject extends Application {

    public static void main(String[] args) {
       launch(args);
    }
    
         @Override
    public void start(Stage stage) throws Exception {
         // change the name of your fxml file to match
        Parent root = FXMLLoader.load(getClass().getResource("FinalProject.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("GUI GUI GUI");
        stage.setScene(scene);
        stage.show();
    }
    
}
