package vending;

import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

public class OverloadedVendingMachine {

    private int softDrinkQty;
    private int saltySnackQty;
    private int chocolateQty;

    public OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty) {
        // set stockLevel Here
        this.softDrinkQty = softDrinkQty;
        this.saltySnackQty = saltySnacksQty;
        this.chocolateQty = chocolatesQty;
    }


    void buy(SoftDrink softDrink) {

        if (softDrinkQty >= 1) {
            System.out.println("Buying a Soft Drink");
            softDrinkQty--;
        } else {
            System.out.println(" Soft Drink is out of stock");
        }

    }

    void buy(SaltySnack saltySnack) {
        if (saltySnackQty >= 1) {
            System.out.println("Buying a Salty Snack.");
            saltySnackQty--;
        } else {
            System.out.println(" Salty snack is out of stock.");
        }

    }

    void buy(Chocolate chocolate) {
        if (chocolateQty >= 1) {
            System.out.println("Buying a Chocolate");
            chocolateQty--;
        } else {
            System.out.println(" Chocolate is out of stock");
        }

    }

    void buy(Product product) {
        //System.out.println("Buying a product");

    }

    void addStock (SoftDrink softDrink)
    {
        System.out.println("Adding stock to Soft Drinks.");
        softDrinkQty++;
    }

    void addStock (SaltySnack saltySnack)
    {
        System.out.println("Adding stock to Salty Snacks.");
        saltySnackQty++;
    }

    void addStock (Chocolate chocolate)
    {
        System.out.println("Adding stock to Chocolates.");
        chocolateQty++;
    }



    public static void main(String[] args) {


    }
}