package com.company;

import java.util.Random;

public class Shuffle {
    public char[] shuffleArray(char[] a) {
        char [] out = new char [a.length];
        for (int i=0; i<out.length;i++){
            out[i] = a[i];
        }
        int n = out.length;
        Random random = new Random();
        random.nextInt();
        for (int i = 0; i < n; i++) {
            int rand = random.nextInt(n);
            char tmp = out[i];
            out[i] = out[rand];
            out[rand] = tmp;
        }
        return out;
    }
}
