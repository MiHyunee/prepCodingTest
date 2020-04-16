package lv1;

public class MatrixSum {
    public int[][] matrixSum(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][];
        for(int i=0; i<answer.length; i++) {
            answer[i] = new int[arr1[i].length];
            for(int j=0; j<arr1[i].length; j++) {
                answer[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        return answer;
    }
}
