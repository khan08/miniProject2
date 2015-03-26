import sun.tools.jar.CommandLine;

import java.util.Scanner;

/**
 * Created by KangH on 3/18/2015.
 */
public class VendingMachineSimulator {
    public static void commandList(){
        System.out.println("1 -> Show Inventory");
        System.out.println("2 -> Show Available Change");
        System.out.println("3 -> Purchase");
        System.out.println("4 -> Show Command");
        System.out.println("5 -> Quit");
        System.out.println();
    }

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.loadCurrencies();

        vendingMachine.loadProducts();
        Scanner scan = new Scanner(System.in);
        int i;
        //UI
        System.out.println("Vending machine's information shown below.\n");
        vendingMachine.showProducts();
        System.out.println();
        vendingMachine.showCurrencies(vendingMachine.getLoadedCurrencies());
        System.out.println();
        commandList();
        //VendingMachine while loop
        do {
            System.out.println("Enter your command:");
            i = scan.nextInt();
            //Purchase
            if(i == 1){
                vendingMachine.showProducts();
                System.out.println();
            }
            if(i == 2){
                vendingMachine.showCurrencies(vendingMachine.getLoadedCurrencies());
                System.out.println();
            }
            if (i == 3) {
                vendingMachine.readCurrencyInput();
                vendingMachine.returnChange();
                vendingMachine.purchaseSummary();
                System.out.println();
            }
            if(i == 4){
                commandList();
                System.out.println();
            }
        }
        while (i != 5);


    }
}
