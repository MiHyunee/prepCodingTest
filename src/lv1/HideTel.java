package lv1;

public class HideTel {
    public String hideTel(String phone_number) {
        //뒷자리4자리 제외 모두 *
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<phone_number.length()-4; i++)
            sb.append("*");
        sb.append(phone_number, phone_number.length()-4, phone_number.length());
        return sb.toString();
    }
}
