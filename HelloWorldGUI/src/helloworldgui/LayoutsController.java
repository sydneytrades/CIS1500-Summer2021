
package helloworldgui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class LayoutsController implements Initializable {

    @FXML
    private Label firstLabel;
    @FXML
    private Label secondLabel;
    @FXML
    private Label verticalLabel;
    @FXML
    private Label topCenterLabel;
    @FXML
    private Label topRightLabel;
    @FXML
    private Label centerLeftLabel;
    @FXML
    private Label centerCenterLabel;
    @FXML
    private Label centerRightLabel;
    @FXML
    private Label bottomLeftLabel;
    @FXML
    private Label bottomCenterLabel;
    @FXML
    private Label bottomRightLabel;
    @FXML
    private TextField columnTextField;
    @FXML
    private TextField rowTextField;
    @FXML
    private Label topLeftLabel;
    @FXML
    private TextField setTextTextFIeld;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void leftButtonCLicked(ActionEvent event) {
        firstLabel.setText("left button clicked");
    }

    @FXML
    private void rightButtonClicked(ActionEvent event) {
        secondLabel.setText("right button clicked");
    }

    @FXML
    private void veritcalButtonClicked(ActionEvent event) {
        verticalLabel.setText("button clicked in the vertical box");
    }

    @FXML
    private void setGridText(ActionEvent event) {
        String row = rowTextField.getText();
        String column = columnTextField.getText();
        
        if ( row.equalsIgnoreCase("0") ){
            if ( column.equalsIgnoreCase("0")){
                topLeftLabel.setText(setTextTextFIeld.getText());
            }
            else if ( column.equalsIgnoreCase("1")){
                topCenterLabel.setText(setTextTextFIeld.getText());
            }
            else if ( column.equalsIgnoreCase("2")){
                topRightLabel.setText(setTextTextFIeld.getText());
            }
        } else if ( row.equalsIgnoreCase("1") ){
            if ( column.equalsIgnoreCase("0")){
                centerLeftLabel.setText(setTextTextFIeld.getText());
            }
            else if ( column.equalsIgnoreCase("1")){
                centerCenterLabel.setText(setTextTextFIeld.getText());
            }
            else if ( column.equalsIgnoreCase("2")){
                centerRightLabel.setText(setTextTextFIeld.getText());
            }
        }else if ( row.equalsIgnoreCase("2") ){
            if ( column.equalsIgnoreCase("0")){
                bottomLeftLabel.setText(setTextTextFIeld.getText());
            }
            else if ( column.equalsIgnoreCase("1")){
                bottomCenterLabel.setText(setTextTextFIeld.getText());
            }
            else if ( column.equalsIgnoreCase("2")){
                bottomRightLabel.setText(setTextTextFIeld.getText());
            }
        }
    }
    
}
