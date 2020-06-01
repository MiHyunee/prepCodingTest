package lv2;

public class Carpet {
    public int[] carpet(int brown, int yellow) {
        int row=1, col =1;

        for(;true; col++) {
            row = (int)Math.ceil(yellow/col);
            if(row<col)
                continue;
            if((brown+yellow)==(col+2)*(row+2))
                if((col*row)==yellow)
                    break;
        }
        return new int[]{row+2, col+2};
    }
}
