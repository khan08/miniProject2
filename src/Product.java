import java.math.BigDecimal;

/**
 * Created by Kang on 3/24/2015.
 */
public class Product {
    private String name;
    private int amount;
    private BigDecimal price;

    //Constructors
    public Product(String name,int amount,BigDecimal price){
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public Product(){}

    //Accessor
    public int getAmount() {
        return amount;
    }
}
