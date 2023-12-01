package homework.ecommerceService;

import homework.Customer;
import homework.Ecommerce;
import homework.Product;
import homework.ShoppingCart;
import homework.service.JsonReadingService;

import java.util.*;


public class EcommerceService {

    public void fillInProductList(String filePath, Ecommerce ecommerce) {
        ecommerce.setProductList(new JsonReadingService(filePath).getDataFromFile());
    }

    public void addToCard(Customer customer, Ecommerce ecommerce, String... productName) {
        ShoppingCart shoppingCart = new ShoppingCart();
        List<Product> productList = ecommerce.getProductList();
        List<Product> cartList = new ArrayList<>();
        for (String name : productName) {
            if (productCanBePurchased(productList, name)) {
                Product product = productList.stream().filter(p -> p.getName().equalsIgnoreCase(name)).findAny().orElseThrow();
                cartList.add(product);
            } else {
                System.out.println("Either we do not have such product or we are out of stock");
            }
        }
        if(cartList.isEmpty()){
            return;
        }
        shoppingCart.setProductList(cartList);
        linkCartWithCustomer(shoppingCart, ecommerce, customer);
    }

    private void linkCartWithCustomer(ShoppingCart shoppingCart, Ecommerce ecommerce, Customer customer) {
        boolean containsKey = ecommerce.getCustomerShoppingCartMap().containsKey(customer.getPersonalCode());
        if (containsKey) {
            List<ShoppingCart> customersCartList = ecommerce.getCustomerShoppingCartMap().get(customer.getPersonalCode());
            customersCartList.add(shoppingCart);
        } else {
            List<ShoppingCart> shoppingCarts = new ArrayList<>();
            shoppingCarts.add(shoppingCart);
            ecommerce.getCustomerShoppingCartMap().putIfAbsent(customer.getPersonalCode(), shoppingCarts);
        }
    }

    private boolean productCanBePurchased(List<Product> productList, String productName) {
        return productList.stream().anyMatch(p -> p.getName().equalsIgnoreCase(productName));
    }
}
