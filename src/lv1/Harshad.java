package lv1;

public class Harshad {
    public boolean harshad(int x) {
        int tmp = x;
        int digitSum = 0;
        //x%(자릿수 합) == 0
        while(x>9) {
            digitSum += (x % 10);
            x /= 10;
        }
        digitSum += x;
        if(tmp%digitSum == 0) return true;
        else return false;
    }
}
