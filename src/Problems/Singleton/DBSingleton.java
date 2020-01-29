package Problems.Singleton;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class DBSingleton {
    private static DBSingleton instance;

    private DBSingleton() {}

    public static DBSingleton getInstance() {
        if (instance == null) {
            instance = new DBSingleton();
        }

        return instance;
    }

    public static void connectToDatabase() throws UnsupportedEncodingException {
        System.out.println("Connecting to the database ... ");
        System.out.println("Please wait .... ");

        System.out.print("Connection successfully ");
        Charset utf8 = Charset.forName("UTF-8");
        Charset def = Charset.defaultCharset();

        String charToPrint = "\u2713";

        byte[] bytes = charToPrint.getBytes("UTF-8");
        String message = new String(bytes, def.name());

        PrintStream printStream = new PrintStream(System.out, true, utf8.name());
        printStream.println(message); // should print your character
    }
}
