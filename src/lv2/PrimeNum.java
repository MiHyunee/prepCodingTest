package lv2;

import java.util.ArrayList;

public class PrimeNum {
    public int primeNum(String numbers) {
        int answer = 0;
        ArrayList<String> numList = new ArrayList<>();

        numList = makeNum(numbers);
        for(int i=0; i<numList.size(); i++) {
            if (isPrime(numList.get(i))) {
                answer += 1;
            }
        }

        return answer;
    }

    private ArrayList<String> makeNum(String numbers) {
        ArrayList<String> numList = new ArrayList<>();

        for(int i=1; i<= numbers.length(); i++) {
            permutation(numList, numbers.toCharArray(), 0, numbers.length(), i);
        }
        return numList;
    }

    private void permutation(ArrayList<String> numList, char[] arr, int depth, int n, int r) {
        if(depth == r) {
            StringBuffer bf = new StringBuffer();
            if(arr[0] != '0'){
                for (int i=0; i<r; i++)
                    bf.append(arr[i]);
                if(!numList.contains(bf.toString()))
                    numList.add(bf.toString());
            }
        }

        for(int i=depth; i<n; i++) {
            swap(arr, depth, i);
            permutation(numList, arr, depth+1, n, r);
            swap(arr, depth, i);
        }
    }

    private void swap(char arr[], int depth, int i) {
        char temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }

    private boolean isPrime(String num) {
        if(num.equals("1"))
            return false;
        for(int i=2; i<=Math.sqrt(Integer.parseInt(num)); i++) {
            if(Integer.parseInt(num)%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNum ex = new PrimeNum();
        System.out.println(ex.primeNum("011"));
    }
}
