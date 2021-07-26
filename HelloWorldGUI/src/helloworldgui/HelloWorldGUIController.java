
package helloworldgui;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;


public class HelloWorldGUIController implements Initializable {

    @FXML
    private Label label;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonClick(ActionEvent event) {
        Random random = new Random();
        
        label.setText(Integer.toString(random.nextInt(1000)+1));
    }
    
}
