package lv1;


import java.util.Arrays;

public class SortingByN {
    public String[] sortingByN(String[] strings, int n) {
            String[] tmp = new String[strings.length];
            for(int i=0; i<strings.length; i++)
                tmp[i] = Character.toString(strings[i].charAt(n))+strings[i];
            Arrays.sort(tmp);
            for(int i=0; i<strings.length;i++)
                tmp[i] = tmp[i].substring(1, tmp[i].length());
            return tmp;

    }
}
