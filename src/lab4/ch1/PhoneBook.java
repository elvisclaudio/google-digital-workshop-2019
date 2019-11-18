package lab4.ch1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class PhoneBook {
    private Scanner s = null;
    private Contact[] contacts = new Contact[10];
    public int count = 0;

    public PhoneBook(String filePath) {
        try {

            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            Scanner s = new Scanner(br);
            this.s = s;

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void importContacts() {
        try {
            String name;
            Double number;


            while (s.hasNext()) {
                name = s.next();
                if (s.hasNextDouble()) {
                    number = s.nextDouble();
                    contacts[count] = new Contact(name, number);
                    count++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void displayContacts() {

        for (int i = 0; i < count; i++) {
            System.out.println(contacts[i]);
        }

    }

    public void searchContact(String name) {
        for (int i = 0; i < count; i++) {
           if (contacts[i].getName().equals(name)) {
               System.out.print("2");
               System.out.println(contacts[i]);
           }
        }

    }
}
