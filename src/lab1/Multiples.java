package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(1000, 3,5));
    }

    public static int multiples(int n, int a, int b) {
        int i = 1;
        int count = 0;
        while ( i < n) {

            boolean divisibleBy3 = i % a == 0;
            boolean divisibleBy5 = i % b == 0;

            // Print our appropriate result
            if (divisibleBy3 || divisibleBy5) {
                count++;
            }
            i++;
        }
        return count;
    }
    public static int multiples() {
        int i = 1;
        int count = 0;
        while ( i < 1000) {

            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result
            if (divisibleBy3 || divisibleBy5) {
                count++;
            }
            i++;
        }
        return count;
    }
}