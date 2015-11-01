package com.grinyov.shop.domain;

import java.util.List;

/**
 * Created by green on 31.10.2015.
 *
 * Класс корзина
 */
public class Cart {

    List<OrderItem> items;
    void addItem(){

    }

    // метод вычисляет сумму всех товаров в корзине

    public Integer sum(){

        Integer result = null;

        for (OrderItem item : items){

            result += item.getPrice();
        }

        return result;
    }
}
