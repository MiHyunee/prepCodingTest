package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SqncStack {
    public static void main(String[] args) throws IOException {
        final String NO = "NO";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int limit = Integer.parseInt(br.readLine());
        int now = 1;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<limit; i++) {
            int sqnc = Integer.parseInt(br.readLine());
            if(!stack.isEmpty() && now>sqnc && stack.peek().compareTo(sqnc)==1) {
                System.out.println(NO);
                br.close();
                return;
            }
            while(now<=sqnc) {
                stack.push(now++);
                sb.append("+\n");
            }
            sb.append("-\n");
            stack.pop();
        }
        System.out.print(sb);
        br.close();
    }
}