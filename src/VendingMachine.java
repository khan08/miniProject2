import java.math.BigDecimal;

/**
 * Created by Kang on 3/24/2015.
 */
public class VendingMachine {
    private Product[] products;
    private Currency[] currencies = new Currency[7];

    public void loadProducts(){}

    public void loadCurrencies(){
        this.currencies[0] = new Currency(new BigDecimal(20), 5);
        this.currencies[1] = new Currency(new BigDecimal(10), 5);
        this.currencies[2] = new Currency(new BigDecimal(5), 10);
        this.currencies[3] = new Currency(new BigDecimal(1), 20);
        this.currencies[4] = new Currency(new BigDecimal(0.25), 20);
        this.currencies[5] = new Currency(new BigDecimal(0.10), 20);
        this.currencies[6] = new Currency(new BigDecimal(0.05), 20);
        this.currencies[7] = new Currency(new BigDecimal(0.01), 50);
    }

    public void showCurrencies(){
        System.out.println(currencies);
    }
}
