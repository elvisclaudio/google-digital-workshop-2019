package lab3.visitor;

public class Main {
    public static void main(String[] args) {
        Element e1 = new Book(10, 2012);
        Element e2 = new Book(11, 2013);

        Element v1 = new Video(11,22);
        Element v2 = new Book(12, 22);


        Element[] elements = new Element[]{e1,e2,v1,v2};
        Visitor visitor = new Visitor();

        for (Element e : elements) {
            e.accept(visitor);
        }

        System.out.println(visitor.totalTime);
    }
}
