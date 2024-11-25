public class Primes {
    public static void main(String[] args) {
        int numLimit = Integer.parseInt(args[0]);
        int primeCount = 0;
        int num = 2;

        System.out.println("Prime numbers up to: " + numLimit);

        while (num <= numLimit) {
            if (isPrime(num)) {
                primeCount++;
                System.out.println(num);
            }
            num++;
        }

        int precent = (int)((double) primeCount / numLimit * 100);

        System.out.println("There are " + primeCount + " primes between 2 and " + numLimit + " (" + precent + "% are primes)");               
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}