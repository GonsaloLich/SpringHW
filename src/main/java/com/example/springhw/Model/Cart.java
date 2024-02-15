package com.example.springhw.Model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Component
@SessionScope
public class Cart {
    private final List<Integer> items;

    public Cart(List<Integer> items) {
        this.items = items;
    }

    public List<Integer> getItems() {
        return items;
    }
    public List<Integer> addItems(List<Integer> itemsId){
        items.addAll(itemsId);
        return items;
    }
}
