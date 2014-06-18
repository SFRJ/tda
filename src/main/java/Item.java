public class Item {

    private final String code;
    private final Double price;

    public Item(String code, Double price) {
        this.code = code;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public Double getPrice() {
        return price;
    }
}