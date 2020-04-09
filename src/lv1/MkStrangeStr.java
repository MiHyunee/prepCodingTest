package lv1;

public class MkStrangeStr {
    public String mkStrangeStr(String s) {
        //단어기준
        //2k -> 대분자
        //2k+1 -> 소문자
        char[] arr = new char[s.length()];
        int index = 0;
        boolean isEven = true;  //짝수인가
        while(index<s.length()){
            if(s.charAt(index)==' ') {
                arr[index] = ' ';
                isEven = true;
            }
            else if(isEven) {
                arr[index] = Character.toUpperCase(s.charAt(index));
                isEven = !isEven;
            }
            else {
                arr[index] = Character.toLowerCase(s.charAt(index));
                isEven = !isEven;
            }
            index++;
        }
        return String.valueOf(arr);
    }
}
