import java.util.ArrayList;
import java.util.List;

public class ShoppingCartTDA {

    private final List<Item> items;
    private DataParcel dataParcel;

    public ShoppingCartTDA(DataParcel dataParcel) {
        this.dataParcel = dataParcel;
        items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void calculateTotalCost(){
        for (Item item : items) {
            item.updatePrice(dataParcel);
        }
        dataParcel.deliver();
    }
}
