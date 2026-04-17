package bloodbank;

public class Donor {
    private int id;
    private String name;
    private String bloodGroup;
    private String phone;

    public Donor(int id, String name, String bloodGroup, String phone) {
        this.id = id;
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name +
                ", Blood Group: " + bloodGroup + ", Phone: " + phone);
    }
}