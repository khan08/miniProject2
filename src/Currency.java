import java.math.BigDecimal;

/**
 * Created by Kang on 3/24/2015.
 */
public class Currency {
    private String type; //paper or coin
    private String name; //English name
    private BigDecimal value;
    private int amount;

    Currency(BigDecimal value,int amount){
        this.value = value;
        this.amount = amount;
        if (value.equals(20)){
            this.type = "paper bill";
            this.name = "$20";
        }
        else if (value.equals(10)){
            this.type = "paper bill";
            this.name = "$20";
        }
        else if (value.equals(5)){
            this.type = "paper bill";
            this.name = "$5";
        }
        else if (value.equals(1)){
            this.type = "paper bill";
            this.name = "$1";
        }
        else if (value.equals(.25)){
            this.type = "coin";
            this.name = "Quarter";
        }
        else if (value.equals(.10)){
            this.type = "coin";
            this.name = "Dime";
        }
        else if (value.equals(.05)){
            this.type = "coin";
            this.name = "Nickel";
        }
        else if (value.equals(.01)){
            this.type = "coin";
            this.name = "Penny";
        }


    }
}
