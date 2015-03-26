import java.math.BigDecimal;

/**
 * Created by Kang on 3/24/2015.
 */
public class VendingMachine {
    private Product[] products = new Product[10];
    private Currency[] currencies = new Currency[8];


    //Currencies
    public void loadCurrencies() {
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
            System.out.println((i + 1) + " " + currencies[i].print());
        }
    }

    //Products
    public void loadProducts() {
        this.products[0] = new Product("Oreo Cookies", 20, 2.5);
        this.products[1] = new Product("Oreo Cookies", 20, 2.5);
        this.products[2] = new Product("Oreo Cookies", 20, 2.5);
        this.products[3] = new Product("Oreo Cookies", 20, 2.5);
        this.products[4] = new Product("Oreo Cookies", 20, 2.5);
        this.products[5] = new Product("Oreo Cookies", 20, 2.5);
        this.products[6] = new Product("Oreo Cookies", 20, 2.5);
        this.products[7] = new Product("Oreo Cookies", 20, 2.5);
        this.products[8] = new Product("Oreo Cookies", 20, 2.5);
        this.products[9] = new Product("Oreo Cookies", 20, 2.5);
    }

    public void showProducts() {
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " " + products[i].print());
        }
    }

    //Purchase
    public void purchase(int productIndex, double money) {
        double totalChange;
        double price = products[productIndex - 1].getPrice();
        if (money > price) {
            totalChange = money - price;
            System.out.println("Change:");
            for (int i = 0; i < 8; i++) {
                while (totalChange - currencies[i].getValue() >= 0)
                {
                    System.out.println(currencies[i].getValue());
                    totalChange =  totalChange - currencies[i].getValue();

                }


            }

        }
    }
}
