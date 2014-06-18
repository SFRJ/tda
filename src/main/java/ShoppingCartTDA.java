import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingCartTDA {

    private final List<Item> items;
    private CalculationDataHolder dataHolder;

    public ShoppingCartTDA(CalculationDataHolder dataHolder) {
        this.dataHolder = dataHolder;
        items = new ArrayList<Item>();
    }

    public void addItem(Item item) {

        items.add(item);
    }

    public List<Item> getAllItems() {
        return Collections.unmodifiableList(items);
    }

    //The behavoir was pushed|brought into the method
    //Still should have an argument with some kind of repo where to add the dataHolder
    public void calculateTotalCost(){
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice();
        }
        dataHolder.update(total);
    }
}
