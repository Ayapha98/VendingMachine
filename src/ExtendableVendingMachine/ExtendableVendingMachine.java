package ExtendableVendingMachine;


public class ExtendableVendingMachine {

    private int softDrinkQty;
    private int saltySnackQty;
    private int chocolateQty;

    public ExtendableVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty) {

        this.softDrinkQty = softDrinkQty;
        this.saltySnackQty = saltySnacksQty;
        this.chocolateQty = chocolatesQty;

    }

    void buy(Product product) {
        if (product instanceof SoftDrink) {
            if (softDrinkQty > 0)
                softDrinkQty--;
        } else if (product instanceof SaltySnack) {
            if (saltySnackQty > 0)
                saltySnackQty--;
        } else if (product instanceof Chocolate) {
            if (chocolateQty > 0)
                chocolateQty--;
        }
    }

    void addStock(Product product) {
        if (product instanceof SoftDrink) {
            softDrinkQty += 3;
        } else if (product instanceof SaltySnack) {
            saltySnackQty += 3;
        } else if (product instanceof Chocolate) {
            chocolateQty += 3;
        }
    }

    public int getStock(Product product) {
        if (product instanceof SoftDrink) {
            return softDrinkQty;
        } else if (product instanceof SaltySnack) {
            return saltySnackQty;
        } else if (product instanceof Chocolate) {
            return chocolateQty;
        }  else if (product instanceof Product){
            return softDrinkQty + saltySnackQty + saltySnackQty;
        } else {
            return 0;
        }
    }
}



