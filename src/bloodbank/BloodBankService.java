package bloodbank;

import java.util.ArrayList;

public class BloodBankService {
    private ArrayList<Donor> donors = new ArrayList<>();
    private BloodStock stock = new BloodStock();

    public void addDonor(Donor donor) {
        donors.add(donor);
        stock.addStock(donor.getBloodGroup(), 1);
        System.out.println("Donor added successfully!");
    }

    public void viewDonors() {
        if (donors.isEmpty()) {
            System.out.println("No donors found.");
            return;
        }
        for (Donor d : donors) {
            d.display();
        }
    }

    public void searchByBloodGroup(String group) {
        boolean found = false;
        for (Donor d : donors) {
            if (d.getBloodGroup().equalsIgnoreCase(group)) {
                d.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No donors with this blood group.");
        }
    }

    public BloodStock getStock() {
        return stock;
    }
}