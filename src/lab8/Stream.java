package lab8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public Stream ex1() {

        List<String> list = new ArrayList<>(Arrays.asList("Water","Office", "Building"));

        List l = list.stream().map( s -> s.charAt(0)).collect(Collectors.toList());

        System.out.println(l);

        return this;
    }


    public Stream ex2() {

        List<String> list = new ArrayList<>(Arrays.asList("Water","Office", "Building"));

        List l = list.stream().filter( s -> s.length() % 2 == 0 ).collect(Collectors.toList());

        System.out.println(l);

        return this;
    }

    public Stream ex3() {

        List<String> list = new ArrayList<>(Arrays.asList("Water","Office", "Building"));

        List l = list.stream().map( s -> s.toUpperCase() ).collect(Collectors.toList());

        System.out.println(l);

        return this;
    }

    public static void main(String[] args) {

        Stream s = new Stream();

        s.ex1().
            ex2().
            ex3();

    }

}
