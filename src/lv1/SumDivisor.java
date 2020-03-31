package lv1;

public class SumDivisor {
    public int sumDivisor(int n) {
        int answer = 0;

        //약수도 소수와 마찬가지로 sqrt(n)까지만 확인하면 됨
        for(int i=1; i<=(int)Math.sqrt(n); i++) {
            if(n%i == 0) {
                if(i == (n/i)) {
                    answer += i;
                    continue;
                }
                answer += i;
                answer += (n/i);
            }
        }
        return answer;
    }

    public static void main(String[] args){
        SumDivisor c = new SumDivisor();
        System.out.println(c.sumDivisor(12));
    }
}
