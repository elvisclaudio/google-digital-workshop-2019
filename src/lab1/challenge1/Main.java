package lab1.challenge1;

class Main {

    public static void main(String[] args) {

        System.out.println("Google Digital Workshop 2019-2020");
        Main a = new Main();
        a.fizzBuzz();
    }

    public void fizzBuzz() {
        int cnt = 100;
        int i;
        for (i = 1;i <= cnt; i++) {
            if (i % 3 == 0 && i % 5 == 9) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0 ) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

    public void challengeTwo() {

    }

    public void challenge3() {

    }


}