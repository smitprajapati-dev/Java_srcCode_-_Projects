public class factorial {

    static int fNumber(int n) {
        int res = 1, i;
        for (i = 2; i <= n; i++)
            res *= i;
        return res;

    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " is " + fNumber(5));
    }

}
