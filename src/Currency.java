import java.math.BigDecimal;

/**
 * Created by Kang on 3/24/2015.
 */
public class Currency {
    private String type; //paper or coin
    private String name; //English name
    private double value;
    private int amount;

    Currency(double value, int amount) {
        this.value = value;
        this.amount = amount;
        if (value==20) {
            this.type = "paper bill";
            this.name = "$20";
        } else if (value==10) {
            this.type = "paper bill";
            this.name = "$20";
        } else if (value==5) {
            this.type = "paper bill";
            this.name = "$5";
        } else if (value==1) {
            this.type = "paper bill";
            this.name = "$1";
        } else if (value==.25) {
            this.type = "coin";
            this.name = "Quarter";
        } else if (value==.1) {
            this.type = "coin";
            this.name = "Dime";
        } else if (value==.05) {
            this.type = "coin";
            this.name = "Nickel";
        } else if (value==.01) {
            this.type = "coin";
            this.name = "Penny";
        }
    }

    public String print() {
        return this.name + " " + this.type + " " + this.value + " " + this.amount;
    }
    public double getValue() {
        return value;
    }
}

