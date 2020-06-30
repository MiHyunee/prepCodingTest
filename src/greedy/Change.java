package greedy;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        int coins=0;
        Scanner scanner = new Scanner(System.in);

        int change = 1000-scanner.nextInt();

        coins += change/500;
        change %= 500;
        coins += change/100;
        change %= 100;
        coins += change/50;
        change %= 50;
        coins += change/10;
        change %= 10;
        coins += change/5;
        coins += change%5;

        System.out.println(coins);
        scanner.close();
    }
}

