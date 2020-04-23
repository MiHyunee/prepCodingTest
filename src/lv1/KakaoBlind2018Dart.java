package lv1;

public class KakaoBlind2018Dart {
    public int dart(String dartResult) {
        String[] score = new String[3];
        String[] bonus = new String[3];
        String[] option = new String[3];
        int[] scoreSum = new int[3];
        int times = 0;
        for (int i = 0; i < dartResult.length(); i++) {
            char tmp;
            switch (tmp = dartResult.charAt(i)) {
                case 'S':
                    bonus[times] = "1";
                    times++;
                    break;
                case 'D':
                    bonus[times] = "2";
                    times++;
                    break;
                case 'T':
                    bonus[times] = "3";
                    times++;
                    break;
                case '*':
                case '#':
                    option[times - 1] = String.valueOf(tmp);
                    break;
                default:
                    if (score[times] == null)
                        score[times] = String.valueOf(tmp);
                    else
                        score[times] = "10";
            }
        }
        for (int i = 0; i < 3; i++) {
            try {
                if (option[i].equals("*")) {
                    scoreSum[i] = 2 * (int) Math.pow(Integer.parseInt(score[i]), Integer.parseInt(bonus[i]));
                    if(i != 0)
                        scoreSum[i-1] = scoreSum[i-1] * 2;
                } else if (option[i].equals("#")) {
                    scoreSum[i] = (-1) * (int) Math.pow(Integer.parseInt(score[i]), Integer.parseInt(bonus[i]));
                }
            }catch(NullPointerException e){
                scoreSum[i] = (int) Math.pow(Integer.parseInt(score[i]), Integer.parseInt(bonus[i]));
            }
        }
        return scoreSum[0]+scoreSum[1]+scoreSum[2];
    }

    public static void main(String[] args) {
        KakaoBlind2018Dart ex = new KakaoBlind2018Dart();
        System.out.println(ex.dart("1D2S3T*"));
    }
}
