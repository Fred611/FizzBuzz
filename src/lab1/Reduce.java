package lab1;

public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduce(2));
    }

    public static int reduce(int n) {
        int count = 0;
        while(n != 0){
            boolean divisible2 = n % 2 == 0;
            if (divisible2){
                n = n / 2;
            }else{
                n = n - 1;
            }
            count ++;
        }
        return count;
    }
}
