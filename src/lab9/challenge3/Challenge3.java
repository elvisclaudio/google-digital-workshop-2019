package lab9.challenge3;

import java.util.Arrays;

import reactor.core.publisher.Flux;
import java.util.List;
public class Challenge3 {

    private static List<String> words = Arrays.asList(
        "the",
        "quick",
        "brown",
        "fox",
        "jumped",
        "over",
        "the",
        "lazy",
        "dog"
    );


    static void displayLetters() {
        Flux.fromIterable(words)
            .map(word -> word.charAt(0))
            .subscribe(System.out::println);
    }

    public static void main(String[] args) {
        displayLetters();
    }

}
