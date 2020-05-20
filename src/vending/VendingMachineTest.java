package vending;


import org.junit.jupiter.api.Test;
import vending.product.Chocolate;
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

}