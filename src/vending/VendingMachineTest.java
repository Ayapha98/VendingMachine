package vending;


import org.junit.jupiter.api.Test;
import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

import static org.junit.jupiter.api.Assertions.assertEquals;


class VendingMachineTest {
    @Test
    public void shouldBuyAChocolate (){
    OverloadedVendingMachine ovm = new OverloadedVendingMachine(7, 8, 1);
    ovm.buy(new Chocolate());
    assertEquals(0, ovm.getStock(new Chocolate()));

    }
    @Test
    public void shouldBuyASoftDrink () {
        OverloadedVendingMachine ovm = new OverloadedVendingMachine(7, 8, 1);
        ovm.buy(new SoftDrink());
        assertEquals(6, ovm.getStock(new SoftDrink()));
    }
    @Test
    public void shouldBuyASaltySnack () {
        OverloadedVendingMachine ovm = new OverloadedVendingMachine(7, 0, 1);
        ovm.buy(new SaltySnack());
        assertEquals(0, ovm.getStock(new SaltySnack()));
    }
    @Test
    public void shouldAddChocolateStock () {
        OverloadedVendingMachine ovm = new OverloadedVendingMachine(7, 8, 1);
        ovm.addStock(new Chocolate());
        assertEquals(2, ovm.getStock(new Chocolate()));
    }
    @Test
    public void shouldAddSoftDrinkStock () {
        OverloadedVendingMachine ovm = new OverloadedVendingMachine(7, 8, 1);
        ovm.addStock(new SoftDrink());
        assertEquals(8, ovm.getStock(new SoftDrink()));
    }
    @Test
    public void shouldAddSaltySnackStock () {
        OverloadedVendingMachine ovm = new OverloadedVendingMachine(7, 8, 1);
        ovm.addStock(new SaltySnack());
        assertEquals(9, ovm.getStock(new SaltySnack()));
    }
    @Test
    public void shouldAddAllProductsStock () {
        OverloadedVendingMachine ovm = new OverloadedVendingMachine(4, 10, 3);
        ovm.addStock(new Product());
        assertEquals(26, ovm.getStock(new Product()));
    }
}