public class star_pattern {
    public static void main(String [] args){
        // int n = 4;
        // int m = 5;
        // for(int i = 1; i<=n;i++){
        //     for(int j = 1; j <=m ; j++){
        //         if(i==1||j == 1 || i == n || j == m){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // int n = 4;
        // for(int i = 0; i<=n; i++){
        //     for(int j = 0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int n = 4;
        // for(int i = n; i >=0;i--){
        //     for(int j = 0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int n = 4;
        // for(int i = 1;i<=n;i++){
        //     for(int j = 1 ; j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1 ; j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // for(int i = 1;i<=n;i++){
        //     for(int j = 1; j<=n - i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i = 1; i<=n;i++){
        //     for(int j = 1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // int n = 5;
        // for(int i = 1; i<=n;i++){
        //     for(int j = 1;j<=i;j++){
        //         System.out.print(j+ " ");
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // for(int i = n;i>=1;i--){
        //     for(int j = 1;j<=i;j++){
        //         System.out.print(j+ " ");
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // int number = 1;
        // for(int i =0;i<=n;i++){
        //     for(int j = 1;j<=i;j++){
        //         System.out.print(number+ " ");
        //         number++;
        //     }
        //     System.out.println();
        // }
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                int sum = i + j;
                if(sum % 2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    
}
