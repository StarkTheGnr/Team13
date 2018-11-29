

public class CountPrimeNums {
	
	
	int countPrimes(int[] a){
        int counter = 0;
        boolean flag = true;
        for (int i = 0; i < a.length; i++) {
            flag = true;
            int n = a[i];
            for (int j = 2; j <= n / 2; ++j) {
                if (n % j == 0) {
                    flag = false;
                    break;
                }
            }
            if ((n == 0) || (n == 1)) {
                flag = false;
            }
            if (flag) {
                counter++;
            }
        }
        return counter;
	}}