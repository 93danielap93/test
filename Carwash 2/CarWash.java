import java.util.ArrayList;
import java.util.Scanner;

public class CarWash {

    
    public static void main(String[] args) {
        Customer c1;
        WashCard wc1 = null;

        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.print("\n 1. Register 2. Login 3. exit\n"
                    + "\n             Enter a number:\t");

            int number = scanner.nextInt();
            if (number == 1) {
                ArrayList<Customer> cl = new ArrayList<Customer>();
                ArrayList<WashCard> wcl = new ArrayList<WashCard>();

                c1 = new Customer("Hasan", "Haidari", "4444444");
                cl.add(c1);

                wc1 = new WashCard(1, "Hasan", 2000);
                wcl.add(wc1);
                System.out.print("\n *** Customers are registered and wash card is published ***\n");
            } else if (number == 2) {
                System.out.print("\n Enter your CPR Number:\t");
                int num = scanner.nextInt();

                if (num == 5678) {
                    boolean login = true;
                    while (login) {
                        System.out.print("1. add balance 2. wash your car 3. Logout\t \n"
                                + "\n Enter a number: \t");
                        int nummer = scanner.nextInt();
                        if (nummer == 1) {
                            System.out.print("\n insert cash: \t");
                            int amount = scanner.nextInt();
                            wc1.addBalance(amount);
                            System.out.print("\n your balance is:" + wc1.getBalance() +"\n");

                            System.out.print("\n balance is added \n");
                        } else if (nummer == 2) {
                            if (wc1.getBalance() > 200) {
                                int amount = 200;
                                wc1.minusBalance(amount);
                                System.out.print("\n washing cost is 200 DKK\n");
                                System.out.print("\n   *** your balance is " + wc1.getBalance() + " now ***\n\n");
                            }else{
                                System.out.print("\n you do not have sufficient money in your account. \n");
                            }
                        } else if (nummer == 3) {
                            System.out.print("\n You are logged out");
                            login = false;
                        }
                    }
                } else {
                    System.out.print("\n Enter a valid CPR number");
                }
            } else if (number == 3) {
                run = false;
                System.out.print("\n ****Byeeeee*** \n");
            } else {
                System.out.print("\n Select a valid number");
            }
        }
    }

}
