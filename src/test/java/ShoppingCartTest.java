import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ShoppingCartTest {

    @Test
    public void calculateTotalCost() {

        ShoppingCart instance = new ShoppingCart();

        Item a = new Item("gloves", 23.43);
        instance.addItem(a);

        Item b = new Item("hat", 10.99);
        instance.addItem(b);

        Item c = new Item("scarf", 5.99);
        instance.addItem(c);
        //In here we dont follow the TDA principle because we interrogate the object for its state
        double totalCost = calcTotalCost(instance);
        assertEquals(40.41, totalCost, 0.0001);
    }

    @Test
    public void calculateTotalCostTDAWay() {
/*
 In order to follow the TDA principle when using an object, we need to remember:
 - We should tell objects to do things and not interrogate them about their state.(No return in methods)
 - It is ok to tell to objects but also it is ok to ask for values(We introduce data holders to keep results)????
*/
        CalculationDataHolder dataHolder = new CalculationDataHolder();
        ShoppingCartTDA instance = new ShoppingCartTDA(dataHolder);

        Item a = new Item("gloves", 23.43);
        instance.addItem(a);

        Item b = new Item("hat", 10.99);
        instance.addItem(b);

        Item c = new Item("scarf", 5.99);
        instance.addItem(c);

        instance.calculateTotalCost();
        assertEquals(40.41, dataHolder.getValue(), 0.0001);
    }

    private double calcTotalCost(ShoppingCart instance) {

        List<Item> items = instance.getAllItems();
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice();
        }

        return total;
    }

}
