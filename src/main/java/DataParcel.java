public class DataParcel {

    private final OutputDestination destination;
    private int totalPrice;

    public DataParcel(OutputDestination destination) {
        this.destination = destination;
    }

    public void deliver() {
        destination.showTotalPrice(totalPrice);
    }

    public void updateData(int price) {
        totalPrice += price;
    }
}
