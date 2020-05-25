package lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Biggest {
    public String biggest(int[] numbers) {
        //A+B와 B+A의 크기 비교
        Integer[] array = new Integer[numbers.length];
        for(int i=0; i<numbers.length; i++)
            array[i] = numbers[i];

        /*
        Comparable : 기본 정렬 기준을 구현하는데 사용
                   : 객체 간의 일반적인 정렬이 필요할 때, Comparable 인터페이스를 확장하여
                     정렬의 기준 정의하는 compareTo(Object o) 메서드 구현
                   : compareTo() : A<B이면 음수 리턴,  A=B이면 0리턴, A>B이면 양수 리턴
        Comparator : 기본 정렬기준 외에 다른 기준으로 정렬하고자 할 때 사용
                   : 객체 간의 특정한 정렬이 필요할 때, Comparator 인터페이스를 확장하여
                     특정 기준을 정의하는 compare(Object o1, Object o2)메서드 구현
                   : Comparable을 implements하지 않고 object의 특정 변수 기준으로 정렬하는 방법

         */
        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String tmp1 = o1.toString();
                String tmp2 = o2.toString();
                return ((tmp2+tmp1)).compareTo((tmp1+tmp2));
            }
        });

        String answer = "";
        for(int i=0; i<array.length; i++) {
            answer += String.valueOf(array[i]);
        }

        if("0".equals(answer.substring(0, 1)))
            return "0";
        return answer;
    }

    public static void main(String[] args) {
        Biggest ex = new Biggest();
        System.out.println(ex.biggest(new int[]{12,1213}));
    }
}
