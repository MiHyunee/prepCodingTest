package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TeamMax {
    public static void main (String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //{여학생, 남학생, 제외학생}
        String[] input = bf.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int K = Integer.parseInt(input[2]);
        /*
        int excludeXX1 = (N-2*M+2*K)/3;
        int team = Math.min((N-excludeXX1)/2, M-(K-excludeXX1));
         */
        int team = Math.min(N/2, M);
        K -= (N+M)-team*3;
        while(K>0) {
            team--;
            K -= 3;
        }
        bf.close();
        System.out.println(team);
    }
}
