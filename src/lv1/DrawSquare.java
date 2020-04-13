package lv1;

import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();
        int row = sc.nextInt();

        for(int r=0; r<row; r++) {
            for(int c=0; c<col; c++) {
               System.out.print("*");
            }
            System.out.println();
        }
    }
}
