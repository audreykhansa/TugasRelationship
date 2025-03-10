package Tugas3_AudreyKhansaLarasati;

import java.text.DecimalFormat;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getFormattedPrice() {
        DecimalFormat formatter = new DecimalFormat("Rp###,###");
        return formatter.format(price).replace(",", ".");
    }
}
