import java.util.Scanner;

public class factorial {

    static int fNumber(int n){
        int res = 1, i;
        for(i = 2;i<=n;i++)
        res *= i;
        return res;
    }
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Please Enter a number you want a factorial");
        int n = scn.nextInt();
        System.out.println("Factorial of "+ n + " is " + fNumber(n));
    }
}
