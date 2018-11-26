package com.company;

import java.util.Random;

public class Shuffle {
    public void shuffleArray(char[] a) {
        int n = a.length;
        Random random = new Random();
        random.nextInt();
        for (int i = 0; i < n; i++) {
            int rand = random.nextInt(n);
            char tmp = a[i];
            a[i] = a[rand];
            a[rand] = tmp;
        }
    }
}
