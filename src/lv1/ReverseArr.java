package lv1;

public class ReverseArr {
    public int[] reverseArr(long n) {
        String numb = String.valueOf(n);
        int[] answer = new int[numb.length()];
        for(int i=numb.length()-1; i>=0; i--) {
            answer[i] = (int) (n / Math.pow(10, i));
            n= (long) (n % Math.pow(10, i));
        }
        return answer;
    }
}
