package lv1;

import java.util.Arrays;

public class KaKaoBlindSecretMap {
    public String[] secretMap(int n, int[] arr1, int[] arr2) {
        int [][]biMap1 = toBinary(n, arr1);
        int [][]biMap2 = toBinary(n, arr2);

        String[] answer = new String[n];
        for(int i=0; i<n; i++){
            StringBuffer line = new StringBuffer();
            for(int j=0; j<n; j++) {
                int tmp = biMap1[i][j]|biMap2[i][j];
                if(tmp==0)
                    line.append(' ');
                else
                    line.append('#');
            }
            answer[i]=line.toString();
        }
        return answer;
    }

    private int[][] toBinary(int n, int[] arr) {
        int [][] map = new int[n][n];
        for(int i=0; i<n; i++) {
            String strBi = Integer.toBinaryString(arr[i]);
            while(strBi.length()<n) {
                strBi = '0'+strBi;
            }
            for(int j=0; j<n; j++) {
                map[i][j] = strBi.charAt(j)-'0';
            }
        }
        return map;
    }

    public static void main(String[] args) {
        KaKaoBlindSecretMap ex = new KaKaoBlindSecretMap();
        System.out.println(ex.secretMap(5,new int[]{9, 20, 28, 18, 11},new int[]{30, 1, 21, 17, 28}));
    }
}
