package composition.shop.products;

import java.util.UUID;

public class Product {
    private UUID id = UUID.randomUUID();
    private String name;
    private double price;
    private Long quantity;
    private String measurement;

    public Product() {}

    public Product(String name, double price, Long quantity, String measurement) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.measurement = measurement;
    }

    public Product(UUID id, String name, double price, Long quantity, String measurement) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.measurement = measurement;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }
}

/* primitive
 * int, double, byte, float
 *
 * Class types
 * String, Long, Float, Double
 */