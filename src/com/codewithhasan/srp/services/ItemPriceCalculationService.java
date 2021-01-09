package com.codewithhasan.srp.services;

import com.codewithhasan.srp.Item;
import com.codewithhasan.srp.logger.Logger;

import java.util.List;

public class ItemPriceCalculationService {

    private double plasticBagPrice = 2.88;

    private TaxCalculationService taxCalculationService = new TaxCalculationService();

    public double calculateItemPrice(List<Item> items, int numOfPlasticBag, double tax) {
        double itemPrice = getTotalItemPrices(items);
        double plasticBagPrice = calculatePlasticBagPrice(items.size());
        double taxAmount = taxCalculationService.getTaxAmount(itemPrice, tax);

        double totalPrice = itemPrice + taxAmount + numOfPlasticBag * plasticBagPrice;
        Logger.info("Total Price of the items -> " + totalPrice);
        return totalPrice;
    }

    public double getTotalItemPrices(List<Item> items) {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    public double calculatePlasticBagPrice(int totalItems) {
        double updatedPlasticBagPrice = plasticBagPrice;
        if (totalItems > 2) {
            updatedPlasticBagPrice = plasticBagPrice * 0.5;
            Logger.info("More than 2 items purchased. Reducing plastic bag price.");
        }
        return updatedPlasticBagPrice;
    }
}
