import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Choose Pizza Type:\n1. Veg\n2. Non-Veg\n3. Delux Veg\n4. Delux Non-Veg");
            int choice = sc.nextInt();

            Pizza pizza;

            switch (choice) {
                case 1:
                    pizza = new Pizza(true);
                    break;
                case 2:
                    pizza = new Pizza(false);
                    break;
                case 3:
                    pizza = new DeluxPizza(true);
                    break;
                case 4:
                    pizza = new DeluxPizza(false);
                    break;
                default:
                    System.out.println("Invalid choice");
                    return;
            }

            if (!(pizza instanceof DeluxPizza)) {
                System.out.println("Add extra cheese? (yes=1 / no=0): ");
                if (sc.nextInt() == 1) pizza.addExtraCheese();

                System.out.println("Add extra toppings? (yes=1 / no=0): ");
                if (sc.nextInt() == 1) pizza.addExtraToppings();
            }

            System.out.println("Takeaway? (yes=1 / no=0): ");
            if (sc.nextInt() == 1) pizza.addTakeaway();

            pizza.printBill();
        }
    }
}

