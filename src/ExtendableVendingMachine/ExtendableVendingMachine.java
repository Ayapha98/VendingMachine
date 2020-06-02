package ExtendableVendingMachine;


public class ExtendableVendingMachine {

    private int softDrinkQty;
    private int saltySnackQty;
    private int chocolateQty;
    private int jellyBabyQty;

    public ExtendableVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty, int jellyBabyQty) {

        this.softDrinkQty = softDrinkQty;
        this.saltySnackQty = saltySnacksQty;
        this.chocolateQty = chocolatesQty;
        this.jellyBabyQty = jellyBabyQty;

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
        } else if (product instanceof JellyBaby) {
            if (jellyBabyQty > 0)
                jellyBabyQty--;
        } else if (product instanceof Product) {
            if (saltySnackQty > 0 && softDrinkQty > 0 && chocolateQty > 0) ;
            softDrinkQty--;
            saltySnackQty--;
            chocolateQty--;
            jellyBabyQty--;
        }
    }

    void buy(Product product, int qty) {
        if (product instanceof SoftDrink) {
            if (softDrinkQty > 0 && softDrinkQty > qty) ;
            softDrinkQty -= qty;
        } else if (product instanceof SaltySnack) {
            if (saltySnackQty > 0 && saltySnackQty > qty) ;
            saltySnackQty -= qty;
        } else if (product instanceof Chocolate) {
            if (chocolateQty > 0 && chocolateQty > qty) ;
            chocolateQty -= qty;
        } else if (product instanceof JellyBaby) {
            if (jellyBabyQty > 0 && jellyBabyQty > qty)
                jellyBabyQty -= qty;
        }
    }

    void addStock(Product product) {
        if (product instanceof SoftDrink) {
            softDrinkQty += 3;
        } else if (product instanceof SaltySnack) {
            saltySnackQty += 3;
        } else if (product instanceof Chocolate) {
            chocolateQty += 3;
        } else if (product instanceof JellyBaby) {
            jellyBabyQty += 3;
        }
    }

    void addStock(Product product, int qty) {
        if (product instanceof SoftDrink) {
            softDrinkQty += qty;
        } else if (product instanceof SaltySnack) {
            saltySnackQty += qty;
        } else if (product instanceof Chocolate) {
            chocolateQty += qty;
        } else if (product instanceof JellyBaby) {
            jellyBabyQty += qty;
        }
    }


    public int getStock(Product product) {
        if (product instanceof SoftDrink) {
            return softDrinkQty;
        } else if (product instanceof SaltySnack) {
            return saltySnackQty;
        } else if (product instanceof Chocolate) {
            return chocolateQty;
        } else if (product instanceof JellyBaby) {
            return jellyBabyQty;
        } else if (product instanceof Product) {
            return softDrinkQty + saltySnackQty + saltySnackQty + jellyBabyQty;
        } else {
            return 0;
        }
    }

}



