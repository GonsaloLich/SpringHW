package com.example.springhw.Service;

import com.example.springhw.Model.Cart;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService{

    private final Cart cart;

    public OrderServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> addItems(List<Integer> itemsId) {
        return cart.addItems(itemsId);
    }

    @Override
    public List<Integer> getItems() {
        return cart.getItems();
    }
}
