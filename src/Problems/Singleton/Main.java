package Problems.Singleton;

import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        DBSingleton dbSingleton = DBSingleton.getInstance();
        DBSingleton.connectToDatabase();
    }
}
