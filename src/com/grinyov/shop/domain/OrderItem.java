package com.grinyov.shop.domain;

/**
 * Created by green on 31.10.2015.
 *
 * Класс строки(поля) заказа
 *
 * здесь нужно выбирать тип переменной взависимости от того,
 можно ли наш товар делить или нет, например штук или литров и тп.
 т.е. если это магазин продуктов например и товар взвешивается
 то нужно использовать Float и прописывать логику округления
 */
public class OrderItem {

    private Goods goods;
    /* здесь нужно выбирать тип переменной взависимости от того,
    можно ли наш товар делить или нет, например штук или литров и тп.
    т.е. если это магазин продуктов например или товар взвешивается
     */
    Integer amount;

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    // цена типа товара
    public Integer getPrice(){
        return goods.price * amount;
    }
}
