package Command;

public class Cashier {
    private Order order;

    public void setOrder(Order order) {
        this.order = order;
    }

    public void giveOrder() {
        System.out.println("Cashier gives order to the kitchen...");
        order.execute();
    }
}
