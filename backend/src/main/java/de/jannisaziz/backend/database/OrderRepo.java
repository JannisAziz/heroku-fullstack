package de.jannisaziz.backend.database;

import de.jannisaziz.backend.model.Order;

import java.security.InvalidKeyException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class OrderRepo {

    private final Map<Integer, Order> orderMap = new HashMap<>();

    // GET

    public Collection<Order> getAllOrders() {return orderMap.values();}

    public Order getOrderById(int id) throws InvalidKeyException {
        if (orderMap.containsKey(id)) {
            return orderMap.get(id);
        }
        else{
            throw new InvalidKeyException();
        }
    }

    public void printAllOrders(){
        System.out.println("All Orders:");
        for (Order order : orderMap.values()){
            System.out.println(order.toString());
        }
    }

    // ADD

    public void addOrders(Order... ordersToAdd) throws InvalidKeyException {
        for (Order orderToAdd : ordersToAdd ) addOrder(orderToAdd);
    }

    private void addOrder(Order orderToAdd) throws InvalidKeyException {
        if (!orderMap.containsKey(orderToAdd.getOrderId()))
            orderMap.put(orderToAdd.getOrderId(), orderToAdd);
        else
            throw new InvalidKeyException();
    }

    // REMOVE

    public void removeOrders(int... orderIdsToRemove) throws InvalidKeyException {
        for (int id : orderIdsToRemove) removeOrder(id);
    }

    private void removeOrder(int orderIDToRemove) throws InvalidKeyException {
        if (orderMap.containsKey(orderIDToRemove)) {
            orderMap.remove(orderIDToRemove);
        }
        else{
            throw new InvalidKeyException();
        }
    }
}
