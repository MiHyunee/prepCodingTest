package greedy;

import java.io.*;

public class FindDocs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        String key = br.readLine();
        int answer = 0;
        int[] index = new int[2];

        while(string.contains(key)) {
            String tmp = string;
            int first=0, second=0;
            int same = 0;
            /* key 횟수 검사 */
            while(tmp.contains(key)) {
                if(index[1] != 0 && tmp.indexOf(key)==index[1])
                    break;
                if(same==0)
                    first = tmp.indexOf(key);
                else if(same==1)
                    second = tmp.indexOf(key);
                same++;
                tmp = tmp.substring(tmp.indexOf(key)+key.length());
            }
            if(answer<same) {
                answer = same;
                index[0] = first;
                index[1] = second;
            }
            string = string.substring(1);
        }

        System.out.println(answer);
        br.close();
    }

    /* 앞에서부터 검사하는 것이 당연히 개수가 가장 많을 것이므로
    while(tmp.indexOf(key) != -1) {
        tmp = tmp.substring(tmp.indexOf(key), tmp.indexOf(key)+key.length);
        count++;
    }
     */
}
