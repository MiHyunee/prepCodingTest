package lv1;

import java.util.Arrays;

public class RemoveSmallest {
    public int[] solution(int[] arr) {
        int smallestIdx = 0;
        if (arr.length == 1)  return new int[]{-1};

        //int min = Arrays.stream(arr).min().getAsInt();
        //return Arrays.stream(arr).filter(i -> i != min).toArray();
        for(int i=1; i<arr.length; i++)
            if(arr[i]<arr[smallestIdx])
                smallestIdx = i;
        int[] answer = new int[arr.length-1];
        int tmp=0;

        //for-each문은 continue작동이 안되는가보다..
        for(int i=0; i<arr.length; i++){
            if(i==smallestIdx)
                continue;
            answer[tmp++]=arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        RemoveSmallest rs = new RemoveSmallest();
        System.out.println(Arrays.toString(rs.solution(new int[]{3,6,2,7,8})));
    }
}

