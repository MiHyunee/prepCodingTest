package lv1;

public class PatternString {
    public String getPatternString(int n) {
        StringBuffer str = new StringBuffer("수");

        for(int i=2; i<=n; i++) {
            if(i%2==0)    //짝수-박
                str.append("박");
            else
                str.append("수");
        }
        return str.toString();
    }
}
