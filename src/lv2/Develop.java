package lv2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Develop {
    public int[] develop(int[] progresses, int[] speeds) {
        Queue<Integer> endDays = new LinkedList<>();
        ArrayList<Integer> releaseProg = new ArrayList<>();

        for(int i=0; i<progresses.length; i++) {
            if((100-progresses[i])%speeds[i] != 0)
                endDays.add(((100-progresses[i])/speeds[i])+1);
            else
                endDays.add((100-progresses[i])/speeds[i]);
        }

        boolean flag = false;
        int limitDays=0;
        int count=0;
        while(!endDays.isEmpty()) {
            if (!flag) {//꺼내기
                limitDays = endDays.poll();
                count++;
                flag = !flag;
            }
            else {
                if(endDays.peek()<=limitDays) {
                    endDays.poll();
                    count++;
                }
                else {
                    releaseProg.add(count);
                    count=0;
                    flag = !flag;
                }
            }
        }
        releaseProg.add(count);
        int[] answer = new int[releaseProg.size()];
        for(int i=0; i<releaseProg.size(); i++) {
            answer[i] = releaseProg.get(i).intValue();
        }
        return answer;
    }

    public static void main(String args[]) {
        Develop ex = new Develop();
        ex.develop(new int[]{93, 30, 55}, new int[]{1, 30, 5});
    }
}
