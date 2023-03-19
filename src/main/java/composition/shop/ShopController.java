package composition.shop;

import composition.shop.customers.CustomerController;
import composition.shop.owner.OwnerController;
import composition.shop.products.ProductController;
import composition.shop.transactions.Transaction;
import composition.shop.transactions.TransactionController;

public class ShopController {

    public CustomerController customerController = new CustomerController();
    public ProductController productController = new ProductController();

}


// MVC - Design pattern
/*
 * M - Model
 * V - View
 * C - Controllers
 *
 * Services
 * Repository
 * */
