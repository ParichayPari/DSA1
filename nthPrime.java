import java.io.*;
import java.util.*;
//problem statement below:
// Let's define P[i] as the ith Prime Number. Therefore, P[1]=2, P[2]=3, P[3]=5, so on.
// Given two integers L, R (L<=R), find the value of P[L]+P[L+1]+P[L+2]...+P[R].

public class nthPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        List<Long> primes = new ArrayList<>();
        int len = 700000;
        
        boolean[] sieve = new boolean[len];
        for (int i=0;i<sieve.length;i++) sieve[i] = true;
        sieve[0] = false;
        sieve[1] = false;
        primes.add(0L);
        for (int seed=2;seed<len;seed++) {
            if (sieve[seed]) {
              primes.add((long)seed);
              for (int j=seed*2;j<len;j+=seed) {
                sieve[j] = false;
              }
            }
        }
        long counter = 0;
        for (int i=0;i<primes.size();i++) {
          counter += primes.get(i);
          primes.set(i, counter);
        }
        while (tests-->0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println((primes.get(r)-primes.get(l-1)));
        }       

    }
}