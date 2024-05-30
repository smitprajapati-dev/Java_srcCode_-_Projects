import java.util.Scanner;

public class odd_or_even {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int num = scn.nextInt();

        if(num == 0){
            System.out.println("It is even number");
        }
        else if (num % 2 == 0){
            System.out.println("It is even number");
        }
        else{
            System.out.println("It odd number");
        }
    }

}
