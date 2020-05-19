package vending;

import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

public class OverloadedVendingMachine {

    private int softDrinkQty;
    private int saltySnackQty;
    private int chocolateQty;

   public OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty)
    {
        // set stockLevel Here
        this.softDrinkQty = softDrinkQty;
        this.saltySnackQty = saltySnacksQty;
        this.chocolateQty = chocolatesQty;
    }


    void buy (SoftDrink softDrink)
    {

    }
    void buy (SaltySnack saltySnack)
    {

    }
    void buy (Chocolate chocolate)
    {

    }
    void buy (Product product)
    {

    }


}
