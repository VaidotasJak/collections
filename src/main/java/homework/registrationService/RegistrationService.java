package homework.registrationService;

import homework.Customer;
import homework.Ecommerce;

public class RegistrationService {
    public void registerCustomer(Ecommerce ecommerce, Customer... customers) {
        for (Customer customer : customers) {
            if (!isCustomerExists(ecommerce, customer)) {
                ecommerce.getCustomerSet().add(customer);
                System.out.println("Registered user: " + customer.getName());
            } else {
                System.out.println("User already exists.");
            }
        }
    }

    private static boolean isCustomerExists(Ecommerce ecommerce, Customer customer) {
        return ecommerce.getCustomerSet().stream().anyMatch(c -> c.getPersonalCode() == customer.getPersonalCode());
    }
}
