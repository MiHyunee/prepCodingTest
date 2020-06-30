package greedy;

import java.util.*;


public class MeetingRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        timeSchedule[] times = new timeSchedule[Integer.parseInt(scanner.nextLine())];
        for(int i=0; i<times.length; i++) {
            times[i] = new timeSchedule(scanner.nextInt(), scanner.nextInt());
        }
        Arrays.sort(times);
        int index = 0;
        int answer = 0;
        for(int i=1; i<times.length; i++) {
            //회의가 진행 중 일때(지금 end보다 start가 크거나 같을 때)
            if(times[i].getStart()>=times[index].getEnd()) {
                answer++;
                index = i;
            }

        }

        answer++;
        System.out.println(answer);
        scanner.close();
    }
}

 class timeSchedule implements Comparable<timeSchedule> {
    int start, end;

    public timeSchedule(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(timeSchedule t){
        if(this.end == t.getEnd()) {
            return Integer.compare(this.start, t.getStart());
        }
        return Integer.compare(this.end, t.getEnd());
    }

    public int getStart(){
        return start;
    }

    public int getEnd(){
        return end;
    }

 }