package lv2;


public class World124 {
    public String newNumber(int n) {
        StringBuffer ternary = new StringBuffer();

        int remainder = 0;
        while(n != 0) {
            remainder = n % 3;
            if (remainder == 0) {
                remainder = 4;
                n = (n / 3) -1;
            }
            else
                n /=3;
            ternary.append(Integer.toString(remainder));
        }
        return ternary.reverse().toString();
    }

    public static void main(String[] args) {
        World124 ex = new World124();
        System.out.println(ex.newNumber(10));
    }
}
