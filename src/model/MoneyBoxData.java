package model;

import javafx.scene.paint.Color;

public class MoneyBoxData {
     
    String value;
    Color color;

    public MoneyBoxData(String value) {
        this.value = value;
        switch (value) {
            case "100000":
                this.color = Color.RED;
                break;
            case "50000":
                this.color = Color.BLUE;
                break;
            case "20000":
                this.color = Color.LIME;
                break;
            case "10000":
                this.color = Color.PURPLE;
                break;
            case "5000":
                this.color = Color.CORNSILK;
                break;
            case "2000":
                this.color = Color.GREY;
                break;
            case "1000":
                this.color = Color.LIGHTBLUE;
                break;
            case "500":
                this.color = Color.ORANGE;
                break;
        }
    }

    public String getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

}
