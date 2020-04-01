package lv1;



public class sortStringDesc {
    public static String sorting(String s) {
        char[] arrAscii = s.toCharArray();

        //대문자<소문자
        //ASCII문자
        //퀵정렬
        sortDesc(arrAscii, 0, arrAscii.length-1);

        return String.valueOf(arrAscii);
    }

    public static void sortDesc(char[] arr, int left, int right) {
        if(left < right) {
            int i=left, j=right+1, pivot=arr[left];
            do {
                do {
                    i++;
                } while (i < right && arr[i] >= pivot);
                do {
                    j--;
                } while (j > left && arr[j] <= pivot);
                if (i < j)
                    swap(arr, i, j);
            } while(i < j);
            swap(arr, left, j);
            sortDesc(arr, left, j-1);
            sortDesc(arr, j+1, right);

        }
    }

    public static void swap(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        String s = "Zbcdefg";
        System.out.println(sorting(s));
    }
}
