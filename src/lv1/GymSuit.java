package lv1;

import java.util.*;
import java.util.stream.Collectors;


public class GymSuit {
    public int gymSuit(int n, int[] lost, int[] reserve){
        List<Integer> lostList = Arrays.stream(lost).boxed().collect(Collectors.toList());//asList()는 배열을 list처럼 사용
        List<Integer> reserveList = Arrays.stream(reserve).boxed().collect(Collectors.toList());
        //lost배열 loot돌며 원소 하나하나 확인
        //같은것이 reserve에 있는가?
        //있다-> lost에서 제거
        //없다 -> 작은 값이 reserve에 있는가? 큰 값이 있는가?
        //     -> 둘다 있다 -> 작은것 선택 -> lost, reserve에서 지우기
        //     -> 하나만 있다 -> 그것 선택 -> lost, reserve에서 지우기
        for(int i=0; i<lostList.size(); i++) {
            boolean isRemoved = false;
            for(int j=0; j<reserveList.size(); j++) {
                if (lostList.get(i) == reserveList.get(j)){
                    lostList.remove(i);
                    reserveList.remove(j);
                    isRemoved = true;
                    break;
                }
            }
            if(isRemoved) {
                i--;
            }
        }
        for (int tmp=0; tmp<lostList.size(); tmp++) {
            for(int idx=0; idx<reserveList.size(); idx++){
                if (idx == 0 && lostList.get(tmp)-1== reserveList.get(idx)){
                    lostList.remove(tmp);
                    reserveList.remove(idx);
                    tmp -= 1;
                    idx -= 1;
                    break;
                }
                else {
                    if(idx != 0 && lostList.get(tmp)-1==reserveList.get(idx-1)) {
                        lostList.remove(tmp);
                        reserveList.remove(idx-1);
                        idx -= 1;
                        tmp -= 1;
                        break;
                    }
                    else if(lostList.get(tmp)+1==reserveList.get(idx)){
                        lostList.remove(tmp);
                        reserveList.remove(idx);
                        tmp -= 1;
                        idx -= 1;
                        break;
                    }
                }
            }
        }
        return n-lostList.size();
    }

    public static void main(String[] args) {
        GymSuit gs = new GymSuit();
        System.out.println(gs.gymSuit(6, new int[]{2, 4, 6}, new int[]{1,3,5}));
    }
}
