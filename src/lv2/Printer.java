package lv2;

public class Printer {
    public int printer(int[] priorities, int location) {
        int front = 0;
        int rear = priorities.length-1;
        int bigIndex;
        int times=0;

        bigIndex = findBiggest(priorities, front);
        while(true) {
            times++;
            if(bigIndex != location) {
                priorities[bigIndex] = 0;
                if(bigIndex==rear)
                    bigIndex = findBiggest(priorities, 0);
                else
                    bigIndex = findBiggest(priorities, bigIndex++);
            }
            else
                break;
        }
        return times;
    }

    private int findBiggest(int[] priorities, int front) {
        int index = front;
        boolean flag = false;
        if(front != 0)
            flag = true;
        for (int i = front; i < priorities.length; i++) {
            if(i==front-1)
                break;
            if (priorities[i] > priorities[index])
                index = i;
            if (flag && i==priorities.length-1)
                i=-1;
        }
        return index;
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        int num = printer.printer(new int[]{1, 1, 9, 1, 1, 1}, 0);
        System.out.println(num);
    }
}
