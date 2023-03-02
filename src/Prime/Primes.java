package Prime;

import java.util.Arrays;

public class Primes {


    public int prime(int x) {
        if (x <= 1) {
            return 0;
        }

        boolean[] isPrime = new boolean[x];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i < x; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < x; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < x; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }
}