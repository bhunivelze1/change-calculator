package model;

import java.util.ArrayList;
import javafx.scene.paint.Color;

public class Model {
    
    int[] currencyUnit = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100};
    
    int cashValue;
    int totalPriceValue;
    int result;
    ArrayList<MoneyBoxData> moneyBoxList = new ArrayList<>();
    
    public void calculateChange(String cashValue, String totalPriceValue) {
        
        this.cashValue = Integer.parseInt(cashValue);
        this.totalPriceValue = Integer.parseInt(totalPriceValue);
        this.result = this.cashValue - this.totalPriceValue;
        
        if (!moneyBoxList.isEmpty()) moneyBoxList.clear();
        calculateMoneyBoxListConfiguration(result);
    }
    
    private void calculateMoneyBoxListConfiguration(int result) {
        int cashLeft = result;
        int tempCash = 0;
        
        while (cashLeft != 0 || tempCash != 0) {
            int unit = checkCurrencyUnitMatch(cashLeft);
            if (unit != 0) {
                this.moneyBoxList.add(new MoneyBoxData(String.valueOf(unit)));
                cashLeft -= unit;
                if (cashLeft == 0 && tempCash != 0) {
                    cashLeft = tempCash;
                    tempCash = 0;
                }
            } else {
                cashLeft -= 100;
                tempCash += 100;
            }
        }
    } 
    
    private int checkCurrencyUnitMatch(int cash) {
        for (int i  = 0; i < currencyUnit.length; i++) {
            int temp = currencyUnit[i];
            if (cash == temp) {
                return temp;
            }
        }
        
        return 0;
    }

    public ArrayList<MoneyBoxData> getMoneyBoxList() {
        return this.moneyBoxList;
    }

    public String getResult() {
        return String.valueOf(this.result);
    }
    
    
}
