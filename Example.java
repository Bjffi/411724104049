import java.util.*;

public class Example {
    public static void main(String[] args) {
        // int n = 4;
        // int i, j;

        // for (i = n; i >= 1; i--) {
        //     for (j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for(i=0;i<n;i++){
        //     for(j=0;j<=n-i+1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        int n=4;
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

    }
}
