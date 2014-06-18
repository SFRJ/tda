import java.util.ArrayList;
import java.util.List;

public class ShoppingCartTDA {

    private final List<Item> items;
    private TotalPriceCalculator calculator;

    public ShoppingCartTDA(TotalPriceCalculator calculator) {
        this.calculator = calculator;
        items = new ArrayList<Item>();
    }

    public void addItem(Item item) {

        items.add(item);
    }

    public void calculateTotalCost(){
        for (Item item : items) {
            item.updatePrice(calculator);
        }
        calculator.done();
    }
}
