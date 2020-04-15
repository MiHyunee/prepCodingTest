package lv1;

public class Average {
    public double average(int[] arr) {
        double answer=0;
        for(int elem : arr)
            answer += elem;
        return answer/arr.length;
    }
}
