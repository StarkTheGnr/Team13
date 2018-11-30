package sw_git;

public class SW_Git {

    public static void main(String[] args) {
        String[] arr = {"1", "21", "13", "42", "8", "65", "70", "5", "9", "100" };
        Get_Min_3_Num(arr);
        

    }

    public static void Get_Min_3_Num(String[] arr) {
        int n1 = Integer.valueOf(arr[1]);
        int n2 = Integer.valueOf(arr[1]);
        int n3 = Integer.valueOf(arr[1]);
        int x = 0;
        int y = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Integer.valueOf(arr[i]) < n1) {
                n1 = Integer.valueOf(arr[i]);
                x = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (Integer.valueOf(arr[i]) < n2 && i != x) {
                n2 = Integer.valueOf(arr[i]);
                y = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (Integer.valueOf(arr[i]) < n3 && i != y && i != x) {
                n3 = Integer.valueOf(arr[i]);
            }
        }

        System.out.printf("The Minimum Tree Number : %d , %d , %d \n", n1, n2, n3);
    }

}
