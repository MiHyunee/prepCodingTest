package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfTime=0;

        int[] arrTime = new int[scanner.nextInt()];
        for(int i=0; i<arrTime.length; i++) {
            arrTime[i] = scanner.nextInt();
        }
        Arrays.sort(arrTime);
        for(int i=0; i<arrTime.length; i++) {
            sumOfTime += (arrTime.length-i)*arrTime[i];
        }

        System.out.println(sumOfTime);
        scanner.close();
    }
}
