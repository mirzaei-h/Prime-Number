import java.util.Scanner;

public class CountPrimes {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int N = s.nextInt();
        System.out.println("count primes:" + countPrimes(N));
    }
    static boolean isPrime(int N) {
        for (int i = 2; i  < N; i++)
            if (N % i == 0)
                return false;
        return true;
    }
    static int countPrimes(int N) {
        if (N < 3)
            return 0;
        int count = 0;
        for (int i = 2; i < N; i ++)
            if (isPrime(i)){
                System.out.println(i + " is a prime number.");
                count++;}
        return count;
    }
}