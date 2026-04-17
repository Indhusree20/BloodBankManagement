package bloodbank;

import java.util.HashMap;

public class BloodStock {
    private HashMap<String, Integer> stock = new HashMap<>();

    public BloodStock() {
        stock.put("A+", 0);
        stock.put("A-", 0);
        stock.put("B+", 0);
        stock.put("B-", 0);
        stock.put("O+", 0);
        stock.put("O-", 0);
        stock.put("AB+", 0);
        stock.put("AB-", 0);
    }

    public void addStock(String group, int units) {
        stock.put(group, stock.get(group) + units);
    }

    public void reduceStock(String group, int units) {
        if (stock.get(group) >= units) {
            stock.put(group, stock.get(group) - units);
        } else {
            System.out.println("Not enough stock!");
        }
    }

    public void displayStock() {
        System.out.println("\nBlood Stock:");
        for (String group : stock.keySet()) {
            System.out.println(group + " : " + stock.get(group) + " units");
        }
    }
}