import java.util.Scanner;

public class marksCalculator {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your math marks");
        float maths = scn.nextFloat();
        System.out.println("Enter your Chemistry marks");
        float chemistry = scn.nextFloat();
        System.out.println("Eneter you Physic marks");
        float physic = scn.nextFloat();
        
        System.out.println("Eneter you English marks");
        float english = scn.nextFloat();
        
        System.out.println("Eneter you Computer marks");
        float computer = scn.nextFloat();
        float result = (maths + chemistry + physic + english + computer);
        float percentage = (result * 100 ) / 500 ;
        System.out.println("Your Percentage is :" + percentage);
        scn.close();
    }
}
