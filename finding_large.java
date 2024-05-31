// import java.util.Arrays;

public class finding_large {
    static int arr[] = { 12, 51, 561, 542, 16 };

    static int largest() {
        int i;
        int max = arr[0];
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    public static void main(String[] args) {
        // int arr [] = {12,51,16,15,61,15};
        // int max = Arrays.stream(arr).max().getAsInt();

        // System.out.println("The maximum number in array is: "+ max);
        System.out.println("The largest number in array is : " + largest());

    }

}
