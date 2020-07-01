package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Multiple30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputNum = scanner.nextLine();
        char[] numbs = inputNum.toCharArray();
        Arrays.sort(numbs);
        if (numbs[0] != '0') {
            System.out.println("-1");
        } else {
            int sumOfRemains = 0;
            for (int i = 0; i < numbs.length; i++) {
                sumOfRemains += Integer.parseInt(String.valueOf(numbs[i])) % 3;
            }
            if (sumOfRemains % 3 != 0) {
                System.out.println("-1");
            } else {
                String sb = new String();
                for(int i=numbs.length-1; i>=0; i--) {
                    sb += numbs[i];
                }
                System.out.println(sb);
            }
        }
        scanner.close();
    }
}