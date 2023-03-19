package composition.shop.products;

import javax.swing.*;
import java.util.ArrayList;

public class ProductController {

    private final ArrayList<Product> products = new ArrayList<>();


    public String addProduct(){
        String name = JOptionPane.showInputDialog("Enter name of product");
        Double price = Double.parseDouble(JOptionPane.showInputDialog("Enter price of product"));
        Long quantity = Long.parseLong(JOptionPane.showInputDialog("Enter Quantity"));

        String[] availableMeasurements = {"KG", "Item", "MB", "Liters"};

        String measurement = (String) JOptionPane.showInputDialog(
                null,
                "Select Product Measurement",
                "Product Measurement",
                JOptionPane.QUESTION_MESSAGE,
                null,
                availableMeasurements,
                availableMeasurements[0]
        );

        Product product = new Product(name, price, quantity, measurement);

        this.products.add(product);

        return  "Product created successfully";

    }

    public ArrayList<Product> getProducts() {
        return products;
    }


}
