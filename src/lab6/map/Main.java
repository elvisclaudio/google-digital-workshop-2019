package lab6.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> strings = new HashMap<Integer, String>();

        strings.put(1, "one");
        strings.put(2, "two");
        strings.put(6, "six");

        System.out.println("Key 6 has value : " + strings.get(6));

        for (Map.Entry e : strings.entrySet()) {

            //getKey();
            //getValue();

        }
    }
}
