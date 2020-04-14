package lv1;

public class DigitSum {
    public int digitSum(int n) {
        int answer =0;
        String str = Integer.toString(n);
        for(int i=str.length()-1; i>=0; i--) {
            answer += (int) ( n / Math.pow(10, i) );
            n = (int) ( n % Math.pow(10,i));
        }
        return answer;
    }
}
