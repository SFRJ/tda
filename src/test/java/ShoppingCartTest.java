import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ShoppingCartTest {

    @Test
    public void calculateTotalCostTDAWay() {
        Customer presenter = mock(Customer.class);
        TotalPriceCalculator dataHolder = new TotalPriceCalculator(presenter);
        ShoppingCartTDA instance = new ShoppingCartTDA(dataHolder);

        Item a = new Item("gloves", 23);
        instance.addItem(a);

        Item b = new Item("hat", 10);
        instance.addItem(b);

        Item c = new Item("scarf", 5);
        instance.addItem(c);

        instance.calculateTotalCost();
        verify(presenter).showTotalPrice(38);

    }

//      THIS COMMENTED CODE HERE IS HOW THE TEST LOOKED LIKE BEFORE THE TELL DON'T ASK PRINCIPLE
//    @Test
//    public void calculateTotalCost() {
//
//        ShoppingCart instance = new ShoppingCart();
//
//        Item a = new Item("gloves", 23);
//        instance.addItem(a);
//
//        Item b = new Item("hat", 10);
//        instance.addItem(b);
//
//        Item c = new Item("scarf", 5);
//        instance.addItem(c);
//        //In here we dont follow the TDA principle because we interrogate the object for its state
//        int totalCost = calcTotalCost(instance);
//        assertEquals(40.41, totalCost, 0.0001);
//    }


//    private int calcTotalCost(ShoppingCart instance) {
//
//        List<Item> items = instance.getAllItems();
//        int totalCartPrice = 0;
//        for (Item item : items) {
//            totalCartPrice += item.getPrice();
//        }
//
//        return totalCartPrice;
//    }

}
