package com.codewithhasan.srp.services;

import com.codewithhasan.srp.logger.Logger;

public class TaxCalculationService {
    private final double primaryTax = 10;

    public double getTaxAmount(double itemPrice, double tax) {
        double currentTax = primaryTax;
        if (itemPrice <= 100) {
            Logger.info("Item price is more than 100. 80 Percent of the actual tax applicable.");
            currentTax = tax * 0.88;
        } else if (itemPrice >= 100 && itemPrice <= 150) {
            Logger.info("Item price is more than 100 but less than 150. 90 Percent of the actual tax applicable.");
            currentTax = tax * 0.90;
        }
        return currentTax;
    }
}
