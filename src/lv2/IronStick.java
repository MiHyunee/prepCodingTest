package lv2;

import java.util.Stack;

public class IronStick {
    private class Stick {
        int startCut;

        public Stick(int startCut) {
            this.startCut = startCut;
        }
    }

    public int ironStick(String arrangement) {
        int answer=0, index=0, cut=0;
        boolean left=true;
        Stack<Stick> stack = new Stack<>();

        try {
            while(true) {
                if(arrangement.charAt(index) == '(') {
                    stack.push(new Stick(cut));
                    left = true;
                }
                else {
                    if(left) {
                        stack.pop();
                        ++cut;
                    }
                    else {
                        answer += (cut - stack.pop().startCut + 1);
                    }
                    left = false;
                }
                ++index;
            }
        } catch (StringIndexOutOfBoundsException e) { }

        return answer;
    }
}
