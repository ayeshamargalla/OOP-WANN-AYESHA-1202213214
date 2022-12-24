public class Waiters implements Runnable {
    private final int orderQty;
    private final int customerID;
    static int foodPrice = 25000;

    public Waiters(int orderQty, int customerID) {
        this.orderQty = orderQty;
        this.customerID = customerID;
    }

    @Override
    public void run() {
        while (true) {
            makeFood();
            try {
                Thread.sleep(15000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void orderInfo() {
        System.out.println("==========================================================");
        System.out.println("Customer ID : " + this.customerID);
        System.out.println("Order Quantity : " + this.orderQty);
        System.out.println("Total Price : " + this.orderQty * foodPrice);
        System.out.println("==========================================================");
    }

    public void makeFood() {
        synchronized(Restaurant.getLock()) {

            System.out.println("Waiter : Delicious food ready to be delivered");
            Restaurant restaurant = new Restaurant();
            restaurant.setWaitingForPickup(false);

            if (Restaurant.getFoodNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiter : Hungry customer wanting another food, giving notice to the kitchen\n");

        }
    }
}