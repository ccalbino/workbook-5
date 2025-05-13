package com.pluralsight;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> portfolio = new ArrayList<>(); //create array list named portfol// io.

        House h1 = new House("My main house", "2020-05-05", 200000, "123 Seseme", 2, 150000, 45000);

        portfolio.add(new Asset("Hundred Dollar Bill", "2025-01-01", 10));
        portfolio.add(new Asset("Necklace", "2025-02-14", 225));
        System.out.println("Your portfolio has the following assets:");

        double totalNertWorth = 0;

        for(Asset a : portfolio){
            System.out.printf("%s valued at %.2f\n", a.getDescription(), a.getValue());
            totalNertWorth += a.getValue();
        }

        System.out.println("Your net worth is " + totalNertWorth);

    }
}