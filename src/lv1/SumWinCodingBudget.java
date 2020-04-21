package lv1;

import java.util.Arrays;

public class SumWinCodingBudget {
    public int budget(int[] d, int budget) {
        int sum = 0;
        d = Arrays.stream(d).sorted().toArray();
        int i=0;
        for(; i<d.length; i++) {
            if (budget - sum >= d[i]) {
                sum += d[i];
            }
            else
                break;
        }
        return i;
    }

    public static void main(String[] args) {
        SumWinCodingBudget ex = new SumWinCodingBudget();
        int answer = ex.budget(new int[]{1, 3, 2, 5, 4}, 9);
        System.out.println(answer);
    }
}
