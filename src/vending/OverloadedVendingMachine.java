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
        System.out.println("Buying a soft drink");
        softDrinkQty++;
    }
    void buy (SaltySnack saltySnack)
    {
        System.out.println("Buying a salty snack");
        saltySnackQty++;
    }
    void buy (Chocolate chocolate)
    {
        System.out.println("Buying a chocolate");
        chocolateQty++;
    }
    void buy (Product product)
    {
        System.out.println("Buying a product");

    }

}