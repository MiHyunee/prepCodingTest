package lv1;

public class BlankN {
    public long[] blankN(long x, int n) {
        //정수 x, 자연수 n
        //x부터 x씩 증가 -> n개
        long[] answer = new long[n];
        for(int times=0; times<n; times++) {
            long tmp = (long)x + (x*times);
            answer[times] = tmp;
        }

        return answer;
    }
}
