public class Main {
    public static void main(String[] args) {
        ShoppingCartTDA shoppingCartTDA = new ShoppingCartTDA(new DataParcel(new ConsoleOutputDestination()));
        shoppingCartTDA.addItem(new Item("Apple", 3));
        shoppingCartTDA.addItem(new Item("Banana", 2));
        shoppingCartTDA.calculateTotalCost();
    }
}
