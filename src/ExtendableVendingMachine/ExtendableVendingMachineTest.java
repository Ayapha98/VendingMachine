package ExtendableVendingMachine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtendableVendingMachineTest {

    @Test
    public void shouldBuyASoftDrink(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(8,14,2);
        evm.buy(new SoftDrink());
        assertEquals(7, evm.getStock(new SoftDrink()));
    }

    @Test
    public void shouldAddStockToChocolates(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(8,14,2);
        evm.addStock(new Chocolate());
        assertEquals(5, evm.getStock(new Chocolate()));
    }
    @Test
    public void shouldBuyAllProducts(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(5,8,6);
        evm.buy(new Product());
        assertEquals(18, evm.getStock(new Product()));
    }


}