package Tugas3_AudreyKhansaLarasati;

import java.util.Scanner;

public class MainT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%-20s: ", "Enter Customer Name");
        String customerName = scanner.nextLine();
        System.out.printf("%-20s: ", "Enter Phone Number");
        String customerPhone = scanner.nextLine();

        Customer customer = new Customer(customerName, customerPhone);

        Product[] products = {
            new Product("Lego Dried Flower", 1000000),
            new Product("Lego Disney Princess", 250000),
            new Product("Lego Harry Potter", 950000),
            new Product("Lego Marvel", 450000),
            new Product("Lego Friends", 160000)
        };

        Cart cart = new Cart();
        System.out.println("\nAvailable Products:");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i].getName() + " - " + products[i].getFormattedPrice());
        }

        while (true) {
            System.out.print("\nEnter Product Number (0 to finish): ");
            int choice = scanner.hasNextInt() ? scanner.nextInt() : -1;
            scanner.nextLine();

            if (choice == 0) break;
            if (choice < 1 || choice > products.length) {
                System.out.println("Invalid choice. Try again.");
                continue;
            }

            System.out.print("Enter Quantity: ");
            int quantity = scanner.hasNextInt() ? scanner.nextInt() : -1;
            scanner.nextLine();

            if (quantity <= 0) {
                System.out.println("Quantity must be greater than zero.");
                continue;
            }

            cart.addProduct(products[choice - 1], quantity);
        }

        cart.showItems(customer);
        scanner.close();
    }
}
