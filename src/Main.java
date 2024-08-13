import java.util.Scanner;
// f(3) = f(2) + f(1)
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(fibonacciSeries(11));
    }
    static int fibonacciSeries(int n){
        if(n == 1) return 0;
        else if (n == 2) return 1;

        return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
    }



}