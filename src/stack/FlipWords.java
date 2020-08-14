package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class FlipWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        while((n--)>0) {
            char ch = '*';
            while(ch!='\n') {
                ch = (char) br.read();
                if(ch == ' ' || ch == '\n') {
                    while(!stack.isEmpty())
                        System.out.print(stack.pop());
                    System.out.print(ch);
                } else {
                    stack.push(ch);
                }
            }
        }
        br.close();
    }
}