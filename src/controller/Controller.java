package controller;



import java.util.function.Consumer;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import model.Model;
import model.MoneyBoxData;
import view.MoneyBox;

public class Controller {

    Model model = new Model();
    
    @FXML
    TextField cash, totalPrice, change;
    @FXML
    FlowPane flowPane;
    
    public void calculateChangeButton() {
        model.calculateChange(cash.getText(), totalPrice.getText());
        
        cash.clear();
        totalPrice.clear();
        change.clear();
        flowPane.getChildren().clear();
                
        change.setText(model.getResult());
        model.getMoneyBoxList().forEach((MoneyBoxData m) -> {
            flowPane.getChildren().add(new MoneyBox(m));
        });
    }
    
}
