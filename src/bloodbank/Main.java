package bloodbank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BloodBankService service = new BloodBankService();

        while (true) {
            System.out.println("\n--- Blood Bank Management System ---");
            System.out.println("1. Add Donor");
            System.out.println("2. View Donors");
            System.out.println("3. Search Donor by Blood Group");
            System.out.println("4. View Blood Stock");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Blood Group: ");
                    String group = sc.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();

                    Donor donor = new Donor(id, name, group, phone);
                    service.addDonor(donor);
                    break;

                case 2:
                    service.viewDonors();
                    break;

                case 3:
                    System.out.print("Enter Blood Group: ");
                    String bg = sc.next();
                    service.searchByBloodGroup(bg);
                    break;

                case 4:
                    service.getStock().displayStock();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}