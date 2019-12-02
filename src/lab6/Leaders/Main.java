package lab6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List content = new ArrayList();

        content.add(9);
        content.add(5);
        content.add(8);
        content.add(3);
        content.add(1);

        System.out.println(content);

        Leaders leaders = new Leaders(content);

        List<Container> gContent = new ArrayList<>();

        gContent.add(new Container(3.1f));

        gContent.add(new Container(4.2f));

        gContent.add(new Container(3.2f));

        gContent.add(new Container(1.2f));

        System.out.println(gContent);
        GenericLeaders <Container> genericLeaders = new GenericLeaders<Container>(gContent);

        genericLeaders.displayLeaders();
    }
}
