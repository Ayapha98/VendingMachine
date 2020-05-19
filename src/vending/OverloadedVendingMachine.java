package vending;

import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

public class OverloadedVendingMachine {

    private int softDrinkQty = 0;
    private int saltySnackQty = 0;
    private int chocolateQty = 0;

   public OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty)
    {
        // set stockLevel Here
        this.softDrinkQty = softDrinkQty;
        this.saltySnackQty = saltySnacksQty;
        this.chocolateQty = chocolatesQty;
    }


    void buy (SoftDrink softDrink)
    {

        if (softDrinkQty >= 1){
            System.out.println("Buying a Soft Drink");
        } else {
            System.out.println(" Soft Drink is out of stock");
        }
        softDrinkQty--;
    }
    void buy (SaltySnack saltySnack)
    {
        if (saltySnackQty >= 1){
            System.out.println("Buying a Salty Snack.");
        } else {
            System.out.println(" Salty snack is out of stock.");
        }
        saltySnackQty--;
    }
    void buy (Chocolate chocolate)
    {
        if (chocolateQty >= 1){
            System.out.println("Buying a Chocolate");
        } else {
            System.out.println(" Chocolate is out of stock");
        }
        chocolateQty--;
    }
    void buy (Product product)
    {
        //System.out.println("Buying a product");

    }

}