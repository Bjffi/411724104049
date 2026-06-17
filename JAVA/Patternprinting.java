import java.util.Scanner;

public class Patternprinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // RIGHT TRIANGLE PATTERN:

        // for(int i = 1; i <= n; i++) {
        //     for(int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();   // Move inside outer loop
        // }


        // INVERTED TRIANGLE PATTERN:
        // for(int i= 5; i>= 1; i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        // NUMBER TRIANGLE PATTERN:
        // for(int i=3;i<=n;i++){
        //     for(int j=3;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }



        // FLOYD'S TRIANGLE:
        // int num=1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(num);
        //         num++;
        //     }
        //     System.out.println();
        // }


        // for(int i=10;i<=14;i++){
        //     for(int j=10;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        // ALPHABET TRIANGLE PATTREN:
        // for(int i = 1; i <= n; i++) {
        //     for(char ch = 'A'; ch < 'A' + i; ch++) {
        //         System.out.print(ch + " ");
        //     }
        //     System.out.println();
        // }


        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=i;j++){
        //         if((i+j)%2==0){
        //             System.out.print("0");
        //         }
        //         else{
        //             System.out.print("1");
        //         }
        //     }
        //     System.out.println();
        // }


        // pyramid pattern
        // for(int i=1;i<=10;i++){
        //     for(int j=1;j<=10-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=i;k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        

        // // FULL PYRAMID PATTREN:
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=2*i-1;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //  INVERTED PYRAMID PATTREN:
        // for(int i=5;i>=1;i--){
        //     for(int j=1;j<=5-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=2*i-1;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



        // DIAMOND PATTERN:
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=2*i-1;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=5;i>=1;i--){
        //     for(int j=1;j<=5-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=2*i-1;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // PYRAMID ALPHABET PATTERN
        // for (int i = 1; i <= n; i++) {

        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }

        //     for (char ch = 'A'; ch < 'A' + i; ch++) {
        //         System.out.print(ch);
        //     }

        //     for (char ch = (char)('A' + i - 2); ch >= 'A'; ch--) {
        //         System.out.print(ch);
        //     }

        //     System.out.println();
        // }


        // HOLLOW PATTERN:
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i==1||i==4||j==1||j==4){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
             
    }
}
