package lv1;

public class CollatzConjecture {
    int times=0;
    public int collatz(long num) {
        //짝수 /= 2
        //홀수 = 홀수*3+1
        //1될때까지 반복
        //반복 횟수 구하기
        if(times>500) return -1;
        else if(num%2 == 0) {
            times++;
            collatz(num/2);
        }
        else if(num != 1 && num%2==1){
            times++;
            collatz((num*3)+1);
        }
        System.out.println(num);
        return times;
    }

    public static void main(String[] args) {
        CollatzConjecture ex = new CollatzConjecture();
        System.out.println(ex.collatz(626331));
    }
}
