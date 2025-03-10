package Tugas3_AudreyKhansaLarasati;

import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;

class Cart {
    private List<Product> items = new ArrayList<>();
    private List<Integer> quantities = new ArrayList<>();

    public void addProduct(Product product, int quantity) {
        items.add(product);
        quantities.add(quantity);
    }

    public void showItems(Customer customer) {
        double grandTotal = 0;
        System.out.println("\nYOUR CART");
        System.out.printf("%-20s: %s%n", "Customer Name", customer.getName());
        System.out.printf("%-20s: %s%n", "Phone Number", customer.getPhoneNumber());
        System.out.println("--------------------------------------------------");
        System.out.printf("%-20s| %-12s| %s%n", "Product", "Quantity", "Price");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < items.size(); i++) {
            Product product = items.get(i);
            int quantity = quantities.get(i);
            double total = product.getPrice() * quantity;
            grandTotal += total;
            System.out.printf("%-20s| %-12d| Rp%s%n", product.getName(), quantity, new DecimalFormat("###,###").format(total).replace(",", "."));
        }

        System.out.println("--------------------------------------------------");
        System.out.printf("%-34s: Rp%s%n", "Total Price", new DecimalFormat("###,###").format(grandTotal).replace(",", "."));
        System.out.println("--------------------------------------------------");
    }
}
