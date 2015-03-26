import java.util.Scanner;

/**
 * Created by Kang on 3/24/2015.
 */
public class VendingMachine {
    private Product[] products = new Product[10];
    //private Currency[] currencies = new Currency[8];
    private Currency[] loadedCurrencies = new Currency[8];
    private Currency[] purchaseCurrencies;
    private Currency[] change = new Currency[8];
    private int productIndex;
    private int quantity;
    private double totalPay = 0;
    double totalChange;
    double price;

    //SETUP

    /********************/
    //Currencies
    public void loadCurrencies() {
        this.change[0] = new Currency(20, 0);
        this.change[1] = new Currency(10, 0);
        this.change[2] = new Currency(5, 0);
        this.change[3] = new Currency(1, 0);
        this.change[4] = new Currency(.25, 0);
        this.change[5] = new Currency(.1, 0);
        this.change[6] = new Currency(.05, 0);
        this.change[7] = new Currency(.01, 0);
        this.loadedCurrencies[0] = new Currency(20, 5);
        this.loadedCurrencies[1] = new Currency(10, 5);
        this.loadedCurrencies[2] = new Currency(5, 10);
        this.loadedCurrencies[3] = new Currency(1, 20);
        this.loadedCurrencies[4] = new Currency(.25, 20);
        this.loadedCurrencies[5] = new Currency(.1, 20);
        this.loadedCurrencies[6] = new Currency(.05, 20);
        this.loadedCurrencies[7] = new Currency(.01, 50);
    }

    public void showCurrencies(Currency[] currencies) {
        for (int i = 0; i < 8; i++) {
            System.out.println((i + 1) + ". " + currencies[i].print());
        }
    }

    public void listCurrencies(Currency[] currencies){
        System.out.println();
        for (int i = 0; i < 8; i++) {
            System.out.println((i + 1) + ". " + currencies[i].listCurrency());
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
            System.out.println((i + 1) + ". " + products[i].print());
        }
    }

    //PURCHASE
    /****************/
    //Change
    public void returnChange() {
        price = products[productIndex - 1].getPrice() * quantity;
        //Return Change
        if (totalPay > price) {
            products[productIndex-1].setAmount(products[productIndex-1].getAmount()- quantity);
            totalChange = totalPay - price;
            for (int i = 0; i < 8; i++) {
                while (totalChange - change[i].getValue() >= 0)
                {
                    totalChange =  totalChange - change[i].getValue();
                    loadedCurrencies[i].setAmount(loadedCurrencies[i].getAmount()-1);
                    change[i].setAmount(change[i].getAmount()+1);
                }


            }
        }


        //No Change
        else if (totalPay == price){
            products[productIndex-1].setAmount(products[productIndex-1].getAmount()- quantity);
        }
        //Not enough Money
        else {
            System.out.println("Not Enough Money. Press 1 to insert more money. Press 2 to restart. Press 3 to quit.");
        }
    }

    public void readCurrencyInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Which product would you like to purchase? (Specify index number)");
        this.productIndex = scan.nextInt();
        System.out.println("How many would you like to purchase? (Specify index number)");
        this.quantity = scan.nextInt();
        System.out.println("How many different currency items would you like to use for this purchase?");
        int currencyTypeAmount = scan.nextInt();
        purchaseCurrencies = new Currency[currencyTypeAmount];
        System.out.println("What currency items are you using? (Specify index number and separate by space)");
        this.listCurrencies(change);
        int currencyIndex;
        int currencyAmount;
        for (int i = 0; i<currencyTypeAmount; i++){
            currencyIndex = scan.nextInt();
            currencyAmount = scan.nextInt();
            purchaseCurrencies[i] = new Currency(change[currencyIndex-1].getValue(),currencyAmount);
            this.totalPay += purchaseCurrencies[i].totalValue();
        }
    }

    public void purchaseSummary(){
        System.out.println();
        System.out.println("Price: "+price);
        System.out.println();
        System.out.println("Currency item(s) you used for this transaction:");
        for(int i = 0; i<this.purchaseCurrencies.length; i++) {
            System.out.println(this.purchaseCurrencies[i].print());
        }
        System.out.println("Paid Amount: "+ totalPay);
        System.out.println();
        System.out.println("Returned Change:");
        double confirmChange = 0;
        for(int i = 0; i<this.change.length; i++) {
            if(this.change[i].getAmount()!=0)
            System.out.println(this.change[i].print());
            confirmChange += change[i].totalValue();
        }
        System.out.println("Total Change: "+confirmChange);
    }


    public Currency[] getLoadedCurrencies() {
        return loadedCurrencies;
    }

}
