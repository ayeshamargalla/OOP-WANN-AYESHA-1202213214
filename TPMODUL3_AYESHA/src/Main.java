import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();
        int customerID, orderQty;

    try{
        System.out.print("Enter Customer ID : ");
        customerID = input.nextInt();

        System.out.print("Enter the quantity of Food : ");
        orderQty = input.nextInt();

        Thread thrd1 = new Thread(restaurant);
        Waiters waiter = new Waiters(orderQty, customerID);
        Thread thrd2 = new Thread(waiter);

        thrd1.start();
        thrd2.start();
        thrd1.join();
        thrd2.join();

    } 
    catch(Exception e){
        System.out.println("Input have to be Integer");

    }

}

}