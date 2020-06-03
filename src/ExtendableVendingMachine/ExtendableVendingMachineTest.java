package ExtendableVendingMachine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtendableVendingMachineTest {

    @Test
    public void shouldBuyASoftDrink(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(8,14,2,7);
        evm.buy(new SoftDrink());
        assertEquals(7, evm.getStock(new SoftDrink()));
    }
    @Test
    public void shouldBuyASaltySnack(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(8,14,2,7);
        evm.buy(new SaltySnack());
        assertEquals(13, evm.getStock(new SaltySnack()));
    }

    @Test
    public void shouldBuyAChocolate(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(8,14,2,7);
        evm.buy(new Chocolate());
        assertEquals(1, evm.getStock(new Chocolate()));
    }

    @Test
    public void shouldBuyAJellyBaby(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(8,14,2,7);
        evm.buy(new JellyBaby());
        assertEquals(6, evm.getStock(new JellyBaby()));
    }

    @Test
    public void shouldBuySpecifiedQuantityOfSoftDrinks(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(5,8,6, 5);
        evm.buy(new SoftDrink(), 5);
        assertEquals(0, evm.getStock(new SoftDrink()));

    }

    @Test
    public void shouldBuySpecifiedQuantityOfSaltySnacks(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(5,8,6, 5);
        evm.buy(new SaltySnack(), 4);
        assertEquals(4, evm.getStock(new SaltySnack()));

    }

    @Test
    public void shouldBuySpecifiedQuantityOfJellyBabies(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(5,8,6, 5);
        evm.buy(new JellyBaby(), 3);
        assertEquals(2, evm.getStock(new JellyBaby()));

    }


    @Test
    public void shouldAddStockToSoftDrinks(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(8,14,2, 8);
        evm.addStock(new SoftDrink());
        assertEquals(11, evm.getStock(new SoftDrink()));
    }


    @Test
    public void shouldAddStockToSaltySnacks(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(8,14,2, 8);
        evm.addStock(new SaltySnack());
        assertEquals(17, evm.getStock(new SaltySnack()));
    }

    @Test
    public void shouldAddStockToChocolates(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(8,14,2, 8);
        evm.addStock(new Chocolate());
        assertEquals(5, evm.getStock(new Chocolate()));
    }

    @Test
    public void shouldAddStockToJellyBabies(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(8,14,2, 8);
        evm.addStock(new JellyBaby());
        assertEquals(11, evm.getStock(new JellyBaby()));
    }

    @Test
    public void shouldAddSpecifiedStockQuantityOfSoftDrinks(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(8,14,2, 8);
        evm.addStock(new SoftDrink(), 5);
        assertEquals(13, evm.getStock(new SoftDrink()));
    }

    @Test
    public void shouldAddSpecifiedStockQuantityOfSaltySnacks(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(8,14,2, 8);
        evm.addStock(new SaltySnack(), 8);
        assertEquals(22, evm.getStock(new SaltySnack()));
    }

    @Test
    public void shouldAddSpecifiedStockQuantityOfChocolates(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(8,14,2, 8);
        evm.addStock(new Chocolate(), 7);
        assertEquals(9, evm.getStock(new Chocolate()));
    }

    @Test
    public void shouldAddSpecifiedStockQuantityOfJellyBabies(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(8,14,2, 8);
        evm.addStock(new JellyBaby(), 7);
        assertEquals(15, evm.getStock(new JellyBaby()));
    }



}