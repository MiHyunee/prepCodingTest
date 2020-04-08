package lv1;


public class CaesarCipher {
    int COUNT = 26;
    public String caesorCipher(String s, int n) {
        //아스키 번호를 사용하자
        //대문자끼리, 소문자끼리
        char[] sArray = s.toCharArray();
        char tmp;
        for(int i=0; i<sArray.length; i++){
            if (sArray[i] == ' ') continue;
            if ('A'<= sArray[i] && sArray[i] <= 'Z') {
                tmp = (char)(sArray[i] + n);
                if (tmp>'Z')
                    tmp = (char)(tmp-COUNT);
            }
            else {  //소문자
                tmp = (char)(sArray[i] + n);
                if (tmp>'z')
                    tmp = (char)(tmp-COUNT);
            }
            sArray[i] = tmp;
        }
        return String.valueOf(sArray);
    }

    public static void main(String[] args) {
        CaesarCipher pw = new CaesarCipher();
        System.out.println(pw.caesorCipher("AB", 1));
        System.out.println(pw.caesorCipher("z", 1));
        System.out.println(pw.caesorCipher("a B z", 4));


    }
}
