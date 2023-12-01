package homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ecommerce {
    private String name;
    private int balance;
    private Set<Customer> customerSet;
    private Map<Integer, List<ShoppingCart>> customerShoppingCartMap;
    private List<Product> productList;

}
