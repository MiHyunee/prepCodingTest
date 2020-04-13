package lv1;

public class findMrKim {
    public String findKim(String[] seoul) {
        int i= 0;
        for(; i<seoul.length; i++)
            if(seoul[i].equals("Kim")){
                break;
            }
        StringBuffer str = new StringBuffer("김서방은 ");
        str.append(i);
        str.append(" 에 있다");
        return str.toString();
    }
}
