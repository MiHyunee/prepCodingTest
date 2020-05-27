package lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HIndex {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);

        HashMap<Integer, Integer> citationHash = new HashMap<>();   //{값, 횟수}
        ArrayList<Integer> key = new ArrayList<>();
        int same=0;
        for(int i=0; i<citations.length; i++) {
            if(i != citations.length-1 && citations[i] == citations[i+1]) {
                ++same;
                continue;
            }
            citationHash.put(citations[i], same+1);
            key.add(citations[i]);
            same=0;
        }

        int times = 0;  //인용 횟수
        int all = citations.length;   //전체 논문 수
        int lastKey = 0;
        while(!citationHash.isEmpty()){
            int i=citationHash.size()-1;
            times += citationHash.get(key.get(i));
            int remains = all-times;

            if(remains > key.get(i)) {    //나머지 논문이 h보다 크다
                lastKey = key.get(i);
                delete(citationHash, key, i);
            }
            else if(times < key.get(i)) {
                lastKey = key.get(i);
                if(i==0) {
                    for(int j=lastKey-1; j>=0; j--) {
                        if(times >= j && remains <= j)
                            return j;
                    }
                }
                delete(citationHash, key, i);
            }
            else {
                if(lastKey-key.get(i) < 1) {
                    return key.get(i);
                }
                times -= citationHash.get(key.get(i));
                for(int j=(lastKey-1); j>key.get(i); j--) {
                    if(times >= j && remains <= j)
                        return j;
                }
                return key.get(i);
            }
        }
        return 0;
    }

    private void delete(HashMap<Integer, Integer> hashmap, ArrayList<Integer> arrList, int i) {
        hashmap.remove(arrList.get(i));
        arrList.remove(i);
    }

    public static void main(String[] args) {
        HIndex ex = new HIndex();
        System.out.println(ex.hIndex(new int[]{2,7,5}));
    }
}
