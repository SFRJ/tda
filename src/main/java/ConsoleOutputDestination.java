public class ConsoleOutputDestination implements OutputDestination {
    @Override
    public void showTotalPrice(int result) {
        System.out.println("The to total result is: " + result);
    }
}
