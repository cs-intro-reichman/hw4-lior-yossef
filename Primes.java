public class Primes {
    public static void main(String[] args) {
        int numLimit = Integer.parseInt(args[0]);
        int primeCount = 0;
        int num = 2;
        boolean[] isPrimeArr = new boolean[numLimit + 1];

        System.out.println("Prime numbers up to " + numLimit + ":");

        while (num <= numLimit) {
            isPrimeArr[num] = true;
            num++;
        }

        num = 2;

        while (num <= numLimit) {
            updateIsPrimeArr(isPrimeArr, num);
            num++;
        }

        num = 2;

        while (num <= numLimit) {
            if (isPrimeArr[num]) {
                primeCount += 1;
                System.out.println(num);
            }
            num++;
        }

        int precent = (int)((double) primeCount / numLimit * 100);

        System.out.println("There are " + primeCount + " primes between 2 and " + numLimit + " (" + precent + "% are primes)");               
    }

    public static void updateIsPrimeArr(boolean[] isPrime, int num) {
        for (int i = 2; i * i <= num; i++) {
            if (isPrime[i] && num % i == 0) {
                isPrime[num] = false;
            }
        }
    }
}