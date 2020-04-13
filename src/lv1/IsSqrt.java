package lv1;

public class IsSqrt {
    public long isSqrt(long n) {
        if((int)n%(int)(Math.sqrt(n))==0)
            return (long)Math.pow((Math.sqrt(n)+1), 2);
        else return -1;
    }
}