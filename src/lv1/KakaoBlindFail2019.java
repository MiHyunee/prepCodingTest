package lv1;

import java.util.Arrays;

public class KakaoBlindFail2019 {
    public int[] failRate(int n, int[] stages) {
        Arrays.sort(stages);

        float[] rate = new float[n];
        int tmp=0;
        for(int stage=0; stage<n; stage++) {
            int all=0, onStage=0;
            for(int j=tmp; j<stages.length; j++) {
                all += 1;
                if(stages[j]==stage+1) {
                    onStage += 1;
                    if(j==stages.length-1||stages[j+1]!=stage+1) {
                        tmp = j+1;
                    }
                }
            }
            if(all==0) rate[stage]=0;
            else {
                rate[stage] = (float) onStage / all;
            }
        }

        int answer[] = new int[n];
        while(n!=0) {
            float min = 1;
            int index = 0;
            for(int j=0; j<rate.length; j++) {
                if(rate[j]<=min) {
                    min = rate[j];
                    index = j;
                }
            }
            rate[index] = 2;
            answer[--n] = index+1;
        }
        return answer;
    }

    public static void main(String[] args) {
        KakaoBlindFail2019 ex = new KakaoBlindFail2019();
        System.out.println(Arrays.toString(ex.failRate(6, new int[]{1,1,1,2,2,3,3,4,5})));
    }
}
