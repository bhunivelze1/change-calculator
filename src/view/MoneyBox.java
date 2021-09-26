package view;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import model.MoneyBoxData;

public class MoneyBox extends VBox {
   
    MoneyBoxData moneyBoxData;
    
    public MoneyBox(MoneyBoxData moneyBoxData) {
        super(5, new Rectangle(50, 50, moneyBoxData.getColor()), new Label(moneyBoxData.getValue()));
        super.setAlignment(Pos.CENTER);
    }
    
}
