package com.codewithhasan.srp;

import com.codewithhasan.srp.services.ItemPriceCalculationService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item cleanCodeBook = new Item("Clean Code", 100.0);
        Item mask = new Item("Mask", 10.00);
        Item tShirt = new Item("tShirt", 30.0);

        int plasticBagTaken = 2;
        double tax = 10.0;

        var itemsPurchased = List.of(cleanCodeBook, mask, tShirt);
        ItemPriceCalculationService itemPriceCalculationService = new ItemPriceCalculationService();
        double totalPriceOfItems = itemPriceCalculationService.calculateItemPrice(itemsPurchased, plasticBagTaken, tax);

        System.out.println("Total Prices of items purchased : " + totalPriceOfItems);
    }
}
/*
Output:
File Log: More than 2 items purchased. Reducing plastic bag price
Console Log : More than 2 items purchased. Reducing plastic bag price
File Log: Item price is more than 100. 80 Percent of the actual tax applicable
Console Log : Item price is more than 100. 80 Percent of the actual tax applicable
File Log: Total Price of the items -> 471.68
Console Log : Total Price of the items -> 471.68
Total Prices of items purchased : 471.68
 */