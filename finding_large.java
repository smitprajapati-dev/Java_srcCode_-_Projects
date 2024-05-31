import java.util.Arrays;

public class finding_large {

    public static void main(String[] args) {
        int arr [] = {12,51,16,15,61,15};
        int max = Arrays.stream(arr).max().getAsInt();

        System.out.println("The maximum number in array is: "+ max);
    }

}
