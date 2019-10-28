package lab1.challenge3;

public class Pair {

    void findPairs(int[] numbers) {
        int cnt = 0;
        for (int i = 0; i < numbers.length; i++) {

            for (int j = i+1; j < numbers.length;j++) {
                if (numbers[i] + numbers[j] == 0) {
                    System.out.println(numbers[i] + "  " + numbers[j]);
                    cnt++;
                }
            }
        }

        System.out.println(cnt);

    }

    public static void main(String[] args) {
        Pair p = new Pair();
        int num[] = new int[5];
        int i = 0;
        for (i = 0; i<5;i++) {
            num[i] = i+1;
            System.out.print(i);
        }

        num[4] = -2;
        num[2] = -1;

        p.findPairs(num);
    }
}
