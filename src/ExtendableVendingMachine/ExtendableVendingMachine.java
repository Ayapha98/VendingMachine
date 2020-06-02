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

    void buy (Product product) {
        if (product instanceof SoftDrink) {
            softDrinkQty--;
        } else if (product instanceof SaltySnack) {
            saltySnackQty--;
        } else {
            chocolateQty--;

        }
    }

    void addStock (Product product){
        if (product instanceof SoftDrink) {
            softDrinkQty +=3;
        } else if (product instanceof SaltySnack) {
            saltySnackQty +=3;
        } else {
            chocolateQty +=3;

        }
    }

    public int getStock (Product product){
        if (product instanceof SoftDrink) {
            return softDrinkQty;
        } else if (product instanceof SaltySnack) {
            return saltySnackQty;
        } else {
            return chocolateQty;

        }
    }
}



