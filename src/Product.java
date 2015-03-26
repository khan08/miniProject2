import java.math.BigDecimal;

/**
 * Created by Kang on 3/24/2015.
 */
public class Product {
    private String name;
    private int amount;
    private double price;

    //Constructors
    public Product(String name,int amount,double price){
        this.name = name;
        this.amount = amount;
        this.price = price;
    }
    public Product(){}

    //print
    public String print(){
        return this.name + " " + this.amount + " " + this.price;
    }

    //Accessor
    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }
}
