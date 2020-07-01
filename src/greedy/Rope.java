package greedy;

import java.io.*;
import java.util.Arrays;

public class Rope {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] rope = new int[Integer.parseInt(bf.readLine())];
        for(int i=0; i<rope.length; i++) {
            rope[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(rope);
        int maxWeight = rope[rope.length-1];
        for(int i=rope.length-2; i>=0; i--) {
            if(maxWeight < (rope.length-i)*rope[i]) {
                maxWeight = (rope.length-i)*rope[i];
            }
        }
        System.out.println(maxWeight);
        bf.close();
    }
}
