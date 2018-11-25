package returnOnlyPrimes;

public class returnOnlyPrimes {

    public char[] returnOnlyPrimes(char[]arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = Character.getNumericValue(arr[i]);
            if ((a % a == 0) && (a % 1 == 0) && (a % 2 != 0) && (a % 3 != 0)) {
                counter++;
            }
        }

        char[] fin = new char[counter];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = Character.getNumericValue(arr[i]);
            if ((a % a == 0) && (a % 1 == 0) && (a % 2 != 0) && (a % 3 != 0)) {
                fin[j] = arr[i];
                j++;
            }
        }
        return fin;
    }
}
