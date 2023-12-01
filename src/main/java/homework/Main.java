package homework;

import homework.ecommerceService.EcommerceService;
import homework.registrationService.RegistrationService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Ecommerce ecommerce = new Ecommerce("Pigu" , 0, new HashSet<>(), new HashMap<>(), new ArrayList<>());

        EcommerceService ecommerceService = new EcommerceService();
        ecommerceService.fillInProductList("src/main/resources/productList.json", ecommerce);

        RegistrationService registrationService = new RegistrationService();
        Customer simas = new Customer("Simas", 111, 300);
        Customer darius = new Customer("Darius", 222, 500);
        Customer rimas = new Customer("Rimas", 333, 600);

        registrationService.registerCustomer(ecommerce, simas, darius, rimas);

        ecommerceService.addToCard(simas, ecommerce, "Milk", "Cereal");
        ecommerceService.addToCard(simas, ecommerce, "Apples", "Bananas");

        ecommerceService.addToCard(darius, ecommerce, "Coffee", "Chicken");
        ecommerceService.addToCard(darius, ecommerce, "Ground Beef", "Yogurt");

        System.out.println(ecommerce.getCustomerShoppingCartMap());
        System.out.println(ecommerce.getCustomerShoppingCartMap().get(111));
        System.out.println(ecommerce.getCustomerShoppingCartMap().get(222));

        ecommerceService.addToCard(rimas, ecommerce, "aa", "Yogurt");
        System.out.println(ecommerce.getCustomerShoppingCartMap());
        System.out.println(ecommerce.getCustomerShoppingCartMap().get(333));


    }
}
