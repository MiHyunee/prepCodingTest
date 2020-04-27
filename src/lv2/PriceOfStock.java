package lv2;

import java.util.Stack;

public class PriceOfStock {
    public int[] priceOfStock(int[] price) {
        Stack<Integer[]> stack = new Stack<>();
        int[] secondsArray = new int[price.length];

        secondsArray[price.length-1] = 0;   //마지막 가격은 항상 0초유지
        for(int i=price.length-2; i>=0; i--) {
            int seconds = 0;

            while(!stack.empty() && price[i]<=stack.peek()[0])
                seconds += stack.pop()[1];

            secondsArray[i] = stack.push(new Integer[]{price[i], seconds+1 })[1];
        }
        return secondsArray;
    }

}

