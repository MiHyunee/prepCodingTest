package lv1;

import java.util.ArrayList;

public class Divisible {
    public static void main(String[] args) {
        divisible(new int[]{2, 36, 1, 3}, 1);
    }

    public static int[] divisible(int[] arr, int divisor) {
        ArrayList<Integer> arrList = new ArrayList<>();

        //람다로 구현할 수 있지 않을까
        for(int num : arr) {
            if (num % divisor == 0)
                arrList.add(num);
        }

        if(arrList.size() == 0) {
            int[] answer = new int[]{-1};
            return answer;
        }
        int[] answer = new int[arrList.size()];

        for(int i=0; i<arrList.size(); i++)
            answer[i] = arrList.get(i);

        quickSort(answer, 0, answer.length-1);

        return answer;
    }

    static void quickSort(int[] array, int left, int right){
        if(left < right) {
            int i=left, j=right+1, pivot=array[left];
            do {
                do { i++;} while (i<=right && array[i] < pivot);
                do { j--;} while (j>=left && array[j] > pivot);
                if (i < j) {
                    swap(i, j, array);
                }
            } while(i<j);
            swap(left, j, array);
            quickSort(array, left, j-1);
            quickSort(array, j+1, right);
        }
    }

    static void swap(int i, int j, int[] array) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}
