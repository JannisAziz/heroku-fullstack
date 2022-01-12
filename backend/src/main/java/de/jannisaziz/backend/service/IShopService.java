package de.jannisaziz.backend.service;

import de.jannisaziz.backend.model.Order;
import de.jannisaziz.backend.model.Product;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface IShopService {

    /// PRODUCTS ///

    // GET
    Collection<Product> getAllProducts();
    Product getProductById(int id);
    Product getProductByName(String name) ;
    void printAllProductsToConsole();

    // ADD & REMOVE
    String addNewProducts(Product... newProducts);
    String removeProducts(Product... productsToRemove);

    /// ORDERS ///

    // GET
    Collection<Order> getAllOrders();
    Order getOrderById(int orderId);
    void printAllOrders();

    // ADD & REMOVE
    String addOrders(Order... orders);
    String removeOrders(int... orderIdsToRemove);
}
