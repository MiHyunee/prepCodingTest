package lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class GcdLcm {
    public int[] gcdLcm(int n, int m) {
        //{최대공약수, 최소공배수}
        int[] answer = new int[2];

        //최대공약수 구하기
        int[] divN = getDivisor(n);
        int[] divM = getDivisor(m);
        int commonDiv = 1;
        int i=1, j=1;
        while(i<divN.length && j<divM.length) {
            if(divN[i] < divM[j]) i++;
            else if(divN[i] > divM[j]) j++;
            else {
                commonDiv = divN[i];
                i++;
                j++;
            }
        }
        answer[0] = commonDiv;

        //최소공배수 구하기
        answer[1] = commonDiv*(n/commonDiv)*(m/commonDiv);

        return answer;
    }

    public int[] getDivisor(int n) {
        ArrayList<Integer> alN = new ArrayList<>();

        for(int i=1; i<=Math.sqrt(n); i++) {
            if(n%i==0) {
                alN.add(i);
                if(i != Math.sqrt(n))
                    alN.add(n/i);
            }
        }
        int[] div = new int[alN.size()];
        for(int i=0; i<alN.size(); i++) {
            div[i] = alN.get(i);
        }
        Arrays.sort(div);
        return div;
    }

    public static void main(String[] args) {
        GcdLcm ex = new GcdLcm();
        System.out.println(Arrays.toString(ex.gcdLcm(3, 12)));
        System.out.println(Arrays.toString(ex.gcdLcm(2, 5)));
    }
}
