import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//
public class ShoppingCart {

    private final List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<Item>();
    }

    public void addItem(Item item) {

        items.add(item);
    }

    public List<Item> getAllItems() {
        return Collections.unmodifiableList(items);
    }
}
