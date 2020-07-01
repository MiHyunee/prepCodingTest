package greedy;

import java.util.Scanner;
import java.util.Stack;

public class Coins {
    public static void main(String[] args) {
        Stack<Integer> coinType = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int price = scanner.nextInt();
        int answer = 0;

        while(count != 0) {
            coinType.push(scanner.nextInt());
            count--;
        }
        while(price > 0) {
            int value = coinType.pop();
            answer += price/value;
            price %= value;
        }
        scanner.close();
        System.out.println(answer);
    }
}
