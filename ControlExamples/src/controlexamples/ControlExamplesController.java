package controlexamples;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class ControlExamplesController implements Initializable {

    private Lotto winningTicket;
    private Lotto usersTicket;

    private int totalSpent;
    private int totalWon;

    @FXML
    private Label firstLabel;
    @FXML
    private Label secondLabel;
    @FXML
    private Label thirdLabel;
    @FXML
    private Label fourthLabel;
    @FXML
    private Label fifthLabel;
    @FXML
    private TextField firstNumberTextBox;
    @FXML
    private TextField secondNumberTextBox;
    @FXML
    private TextField thirdNumberTextBox;
    @FXML
    private TextField fourthNumberTextBox;
    @FXML
    private TextField fifthNumberTextBox;
    @FXML
    private Label totalSpentLabel;
    @FXML
    private Label totalWonLabel;
    @FXML
    private Label netLossLabel;
    @FXML
    private Label discliamerLabel;
    @FXML
    private Button disclaimerButton;
    @FXML
    private Button playButton;
    @FXML
    private Slider firstSlider;
    @FXML
    private Slider secondSlider;
    @FXML
    private Slider thirdSlider;
    @FXML
    private Slider fourthSlider;
    @FXML
    private Slider fifthSlider;

    public ControlExamplesController() {
        winningTicket = new Lotto();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void buttonClick(ActionEvent event) {
        totalSpent += 1;

        winningTicket = new Lotto();

        int firstNumber = Integer.parseInt(firstNumberTextBox.getText());
        int secondNumber = Integer.parseInt(secondNumberTextBox.getText());
        int thirdNumber = Integer.parseInt(thirdNumberTextBox.getText());
        int fouthNumber = Integer.parseInt(fourthNumberTextBox.getText());
        int fifthNumber = Integer.parseInt(fifthNumberTextBox.getText());
        int[] usersNumbers = new int[]{firstNumber, secondNumber, thirdNumber,
            fouthNumber, fifthNumber};
        usersTicket = new Lotto(usersNumbers);

        totalWon += usersTicket.getWinnings(winningTicket);

        updateLabel();
    }

    private void updateLabel() {
        int[] numbers = winningTicket.getNumbers();
        firstLabel.setText(Integer.toString(numbers[0]));
        secondLabel.setText(Integer.toString(numbers[1]));
        thirdLabel.setText(Integer.toString(numbers[2]));
        fourthLabel.setText(Integer.toString(numbers[3]));
        fifthLabel.setText(Integer.toString(numbers[4]));

        totalSpentLabel.setText("Total Spent: $" + totalSpent);
        totalWonLabel.setText("Total Won: $" + totalWon);
        netLossLabel.setText("Net loss: $" + (totalSpent - totalWon));
    }

    @FXML
    private void disclaimerButtonClicked(ActionEvent event) {
        playButton.setDisable(false);
        disclaimerButton.setVisible(false);
        discliamerLabel.setText("");
    }

    @FXML
    private void sliderMouseReleased(MouseEvent event) {
        if (event.getSource() == firstSlider) {
            firstNumberTextBox.setText(Integer.toString((int) firstSlider.getValue()));
        } else if (event.getSource() == secondSlider) {
            secondNumberTextBox.setText(Integer.toString((int) secondSlider.getValue()));
        } else if (event.getSource() == thirdSlider) {
            thirdNumberTextBox.setText(Integer.toString((int) thirdSlider.getValue()));
        } else if (event.getSource() == fourthSlider) {
            fourthNumberTextBox.setText(Integer.toString((int) fourthSlider.getValue()));
        } else if (event.getSource() == fifthSlider) {
            fifthNumberTextBox.setText(Integer.toString((int) fifthSlider.getValue()));
        }
    }

    @FXML
    private void textBoxKeyTyped(KeyEvent event) {
        if (event.getSource() == firstNumberTextBox
                && !firstNumberTextBox.getText().equals("")) {
            firstSlider.setValue(Integer.parseInt(firstNumberTextBox.getText()));
        } else if (event.getSource() == secondNumberTextBox
                && !secondNumberTextBox.getText().equals("")) {
            secondSlider.setValue(Integer.parseInt(secondNumberTextBox.getText()));
        } else if (event.getSource() == thirdNumberTextBox
                && !thirdNumberTextBox.getText().equals("")) {
            thirdSlider.setValue(Integer.parseInt(thirdNumberTextBox.getText()));
        } else if (event.getSource() == fourthNumberTextBox
                && !fourthNumberTextBox.getText().equals("")) {
            fourthSlider.setValue(Integer.parseInt(fourthNumberTextBox.getText()));
        } else if (event.getSource() == fifthNumberTextBox
                && !fifthNumberTextBox.getText().equals("")) {
            fifthSlider.setValue(Integer.parseInt(fifthNumberTextBox.getText()));
        }

    }

}
