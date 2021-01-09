package com.codewithhasan.srp;

public class Customer {
    private final String name;
    private final int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    /*
    // Calculate Data not related with Customer data.

    public double calculatePrice(double tax) {
        int totalItems = items.size();
        double itemPrice = items.stream().mapToDouble(Item::getPrice).sum();

        if (totalItems > 2) {
            plasticBagPrice = plasticBagPrice * 0.5;
            Logger.info("More than 2 items purchased. Reducing plastic bag price.");
        }

        if (totalItems <= 100) {
            Logger.info("Item price is more than 100. 80 Percent of the actual tax applicable.");
            tax = tax * 0.88;
        } else if (itemPrice >= 100 && itemPrice <= 150) {
            Logger.info("Item price is more than 100 but less than 150. 90 Percent of the actual tax applicable.");
            tax = tax * 0.90;
        }

        double totalPrice = itemPrice + tax + this.numberOfPlasticBags * plasticBagPrice;
        Logger.info("Total Price of the items -> " + totalPrice);
        return totalPrice;
    }

    ## In Ideal Case I Will Use Interface

    public void logInformation(String message) {
        FileLogger fileLogger = new FileLogger();
        ConsoleLogger consoleLogger = new ConsoleLogger();

        fileLogger.logInFile(message);
        consoleLogger.logInConsole(message);
    }

    // SRP Break Here

    public class FileLogger {
        public void logInFile(String message) {
            System.out.println("File Log: " + message);
        }
    }

    // SRP Break Here
    public class ConsoleLogger {
        public void logInConsole(String message) {
            System.out.println("Console Log : " + message);
        }
    }
     */
}
