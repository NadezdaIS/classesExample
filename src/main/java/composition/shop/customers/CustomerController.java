package composition.shop.customers;

import java.util.ArrayList;
import java.util.UUID;

public class CustomerController {
    private final ArrayList<Customer> customers = new ArrayList<>();

    public CustomerController() {
    }
    public Customer getCustomerById (UUID customerId) {
        return null;
    }

    public String addCustomer (Customer customer) throws Exception {
        this.customers.add(customer);
        return "Customer created!";
    }
    public String removeCustomer (UUID customerId) throws Exception {
        return "Customer deleted!";
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
