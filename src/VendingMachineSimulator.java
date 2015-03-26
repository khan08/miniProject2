/**
 * Created by KangH on 3/18/2015.
 */
public class VendingMachineSimulator {
    public static void main(String[] args){
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.loadCurrencies();
        vendingMachine.loadProducts();
        //While loop
        vendingMachine.showProducts();
        System.out.println() ;
        vendingMachine.showCurrencies();
        //Purchase
        vendingMachine.purchase(2,5.5);

    }
}
