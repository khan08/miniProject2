import java.math.BigDecimal;

/**
 * Created by Kang on 3/24/2015.
 */
public class VendingMachine {
    private Product[] products;
    private Currency[] currencies = new Currency[8];

    public void loadProducts(){}

    public void loadCurrencies(){
        this.currencies[0] = new Currency(20, 5);
        this.currencies[1] = new Currency(10, 5);
        this.currencies[2] = new Currency(5, 10);
        this.currencies[3] = new Currency(1, 20);
        this.currencies[4] = new Currency(.25, 20);
        this.currencies[5] = new Currency(.1, 20);
        this.currencies[6] = new Currency(.05, 20);
        this.currencies[7] = new Currency(.01, 50);
    }

    public void showCurrencies() {
        for (int i = 0; i < 8; i++) {
            currencies[i].print();
        }
    }
}
