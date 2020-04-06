package lv1;

public class MockExam {
    public int[] mockExam(int[] answers) {

        /*
        1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
        2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5,
        3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5
         */
        //규칙성 : 5개/8개/10개
        //학생1,2,3의 각각의 답
        //비교
        int student1=0, student2=0, student3=0;
        for(int q=0; q<answers.length; q++) {
            //학생1
            int a = (q+1)%5;  //학생1의 답
            if (a==0) a=5;
            if(answers[q]==a) ++student1;
            //학생2
            int b = (q+1)%8;
            switch(b){
                case 1: case 3: case 5: case 7:
                    b=2;
                    break;
                case 2:
                    b=1;
                    break;
                case 4: case 6:
                    b=b/2+1;
                    break;
                case 0:
                    b=5;
                    break;
            }
            if(answers[q]==b)  ++student2;
            //학생3
            int c = q%10;
            switch(c) {
                case 0: case 1:
                    c = 3;
                    break;
                case 2: case 3:
                    c = 1;
                    break;
                case 4: case 5:
                    c = 2;
                    break;
                case 6: case 7:
                    c = 4;
                    break;
                case 8: case 9:
                    c = 5;
                    break;
            }
            if(answers[q]==c)  ++student3;
        }
        int cmpAB = student1-student2;
        if(cmpAB>0){  //1이 더큼
            if (student1==student3) return new int[]{1, 3};
            int best = student1>student3 ? 1 : 3;
            return new int[]{best};
        }
        else if(cmpAB<0){  //2가 더큼
            if (student2==student3) return new int[]{2, 3};
            int best = student2>student3 ? 2 : 3;
            return new int[]{best};
        }
        else if(cmpAB==0){
            if (student1==student3) return new int[]{1, 2, 3};
            if (student1>student3) return new int[]{1, 2};
            else
                return new int[]{3};
        }
        return new int[]{};
    }
}
