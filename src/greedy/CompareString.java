package greedy;

import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        int lenDiff = str2.length()-str1.length();

        //{index, count}
        int[] smallest = new int[2];
        boolean flagFirst = true;
        while(lenDiff>=0) {
            int tmp=0;
            for(int i=0; i<str1.length(); i++) {
                if(str1.charAt(i)!=str2.charAt(i+lenDiff))
                    tmp++;
            }
            if(tmp<smallest[1] || flagFirst) {
                smallest[0] = lenDiff;
                smallest[1] = tmp;
                flagFirst = false;
            }
            lenDiff--;
        }
        /*
        //어차피 결과에 영향을 미치지 않는 부분이므로 불필요
        if(smallest[0]+str1.length() != str2.length())
            str1 = str1 + str2.substring(smallest[0]+str1.length());
        if(smallest[0]!= 0)
            str1 = str2.substring(0, smallest[0]) + str1;
         */
        System.out.println(smallest[1]);
        scanner.close();
    }
}
