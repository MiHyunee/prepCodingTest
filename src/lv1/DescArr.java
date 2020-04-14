package lv1;

import java.util.Arrays;

public class DescArr {
    public long descArr(long n) {
        long answer =0;
        char[] tmp = Long.toString(n).toCharArray();
        Arrays.sort(tmp);
        for(int i=tmp.length-1; i>=0; i--) {
            answer = answer * 10 + (tmp[i]-'0');
        }
        return answer;
    }
}
