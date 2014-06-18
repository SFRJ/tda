public class Main {
    public static void main(String[] args) {
        ShoppingCartTDA shoppingCartTDA = new ShoppingCartTDA(new TotalPriceCalculator(new ConsoleCustomer()));
        shoppingCartTDA.addItem(new Item("Apple", 3));
        shoppingCartTDA.addItem(new Item("Banana", 2));
        shoppingCartTDA.calculateTotalCost();
    }
}
