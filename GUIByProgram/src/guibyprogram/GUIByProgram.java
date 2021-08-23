package guibyprogram;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class GUIByProgram extends Application {
    
    private Label label;

    public static void main(String[] args) {
        // right click Libraries in the project, add the OpenJFX16 library  

        // right click project, go to Run, add the line below to VM Options
        // --add-modules javafx.controls,javafx.fxml          
        // in the Libraries, Run tab, add OpenJFX16 to the Module Path
        // make sure the project JDK platform and JFX versions match - 16 for both  
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane root = new AnchorPane();
        root.setPrefWidth(400);
        root.setPrefHeight(400);
        
        label = new Label();
        label.setText("Hello world!");
        label.setLayoutX(50);
        label.setLayoutY(50);
        
        Button button = new Button();
        button.setText("Click me!");
        button.setLayoutX(50);
        button.setLayoutY(100);
        
        // use the fully class you write
        //button.setOnAction(new ButtonClickHandler());
        
        /* use an anonymous inner class
        button.setOnAction( new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                label.setText("You clicked the button!");
            }
        });
        */
        
        // use lambda notation to create the anonymous inner class
        button.setOnAction((ActionEvent event) -> {
            label.setText("You clicked the button!");
        });
        
        root.getChildren().add(label);
        root.getChildren().add(button);
        
        Scene scene = new Scene(root);
        stage.setTitle("GUI GUI GUI");
        stage.setScene(scene);
        stage.show();
    }
    
    class ButtonClickHandler implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event){
            label.setText("You clicked the button!");
        }
    }
}