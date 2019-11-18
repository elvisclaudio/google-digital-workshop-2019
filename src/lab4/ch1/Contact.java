package lab4.ch1;

public class Contact {

    private String name;
    private double phoneNumber;

    public Contact(String name , double phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return " Name " + name + " pn " + (long)  phoneNumber;
    }
}
