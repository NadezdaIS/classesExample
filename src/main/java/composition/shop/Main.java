package composition.shop;

import composition.shop.customers.Customer;

import javax.swing.*;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        ShopController shop = new ShopController();
        try {
            shop.customerController.addCustomer(new Customer("Zino", 200.34));
            shop.customerController.addCustomer(new Customer("Inga", 1200.45));
            shop.customerController.addCustomer(new Customer("Lina", 575.67));
            System.out.println(shop.customerController.getCustomers());
            System.out.println(shop.customerController.getCustomerById(UUID.randomUUID()));


            JOptionPane.showMessageDialog(null, "Zino");
            JOptionPane.showMessageDialog(null, shop.productController.addProduct());
            JOptionPane.showMessageDialog(null, shop.productController.addProduct());
            System.out.println(shop.productController.getProducts());
        } catch (Exception exception){
            exception.printStackTrace();
        }
    }
}

