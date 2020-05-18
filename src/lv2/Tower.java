package lv2;

import java.util.Stack;

public class Tower {
    public int[] tower(int[] heights) {
        Stack<Integer> index = new Stack<>();
        Stack<Integer> value = new Stack<>();
        int []answer = new int[heights.length];
        int turn = 0;

        while(turn < heights.length) {
            int num = heights.length-1-turn;
            if(!value.isEmpty()) {
                getSignal(index, value, heights[num], turn, answer);
            }
            index.push(num);
            value.push(heights[num]);
            turn++;
        }
        return answer;
    }

    private void getSignal(Stack<Integer> index, Stack<Integer> value, int num, int turn, int[] answer) {
        if(!index.isEmpty() && value.peek()<num) {
            answer[index.pop()] = answer.length-turn;
            value.pop();
            getSignal(index, value, num, turn, answer);
        }
        else
            return;
    }

    public static void main(String[] args) {
        Tower ex = new Tower();
        ex.tower(new int[]{6,9,5,7,4});
    }
}
