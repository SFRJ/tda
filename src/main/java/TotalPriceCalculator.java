public class TotalPriceCalculator {

    private final Customer forwarder;
    private int totalPrice;

    public TotalPriceCalculator(Customer forwarder) {
        this.forwarder = forwarder;
    }

    public void done() {
        forwarder.showTotalPrice(totalPrice);
    }

    public void sumPrice(int price) {
        totalPrice += price;
    }
}
