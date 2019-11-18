package lab4.ch1;

public class Main {

    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook("src/lab4/ch1/phonebook.txt");
        pb.importContacts();
//        pb.displayContacts();
        pb.searchContact("Elvis");
    }
}
