public class Item {

    private final String code;
    private final int price;

    public Item(String code, int price) {
        this.code = code;
        this.price = price;
    }

    public void updatePrice(DataParcel dataHolder) {
        dataHolder.updateData(price);

    }
}