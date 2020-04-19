package lv1;

import java.util.ArrayList;

public class Kakao19winterInternship {
    int answer = 0;
    public int crane(int[][] board, int[] moves) {
        ArrayList<Integer> basket = new ArrayList<>();
        int times = 0;
        while(times<moves.length) {
            craneWorks(basket, board, moves[times]);
            checkRepeat(basket);
            times++;
        }
        return answer;
    }
    private void craneWorks(ArrayList<Integer> basket, int[][] board, int col) {
        //비어있는 열
        if(board[board.length-1][col-1]==0)
            return;
        else {
            for(int i=0; i<board.length; i++) {
                if(board[i][col-1] !=0) {
                    basket.add(board[i][col-1]);
                    board[i][col-1] = 0;
                    System.out.println("times"+col+"now"+basket);
                    break;
                }
            }
        }
    }
    private void checkRepeat(ArrayList<Integer> basket) {
        //중복
        if(basket.size()<2) return;
        if(basket.get(basket.size()-1).equals(basket.get(basket.size()-2))) {
            System.out.println(basket);
            basket.remove(basket.size()-1);
            basket.remove(basket.size()-1);
            answer += 2;
            System.out.println("remove"+basket);
        }
    }

    public static void main(String[] args) {
        Kakao19winterInternship ex = new Kakao19winterInternship();
        System.out.println(ex.crane(new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[]{1,5,3,5,1,2,1,4}));
    }
}
