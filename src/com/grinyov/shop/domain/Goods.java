package com.grinyov.shop.domain;

/**
 * Created by green on 31.10.2015.
 *
 * Класс товар
 *
 * Цена всегда целочисленна, в финансах используют BigDecimal,
 *
 * за основу берут копейки(центы) и для вывода делять на 100,
 *
 * ! только вместо деления используется сдвиг
 *
 */
public class Goods {

    private String id;
    private String name;
    // цена
    Integer price;
    Group group;

}
