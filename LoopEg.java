import java.util.Scanner;

public class LoopEg {
    public static void main(String[] args) {
        // int x=25649;
        // int count=0;
        // while(x>0){
        //     count++;
        //     x=x/10;
        // }
        // System.out.println(count);  


        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int evencount=0,oddcount=0;
        // while(n>0){
        //     if(n%2==0){
        //         evencount++;
               
        //     }else{
        //         oddcount++;
        //     }
        //     n=n/10;
        // }
        // System.out.println(evencount);
        // System.out.println(oddcount);



        // REVERSE THE NUMBER
        // Scanner sc =new Scanner(System.in);
        // int n=sc.nextInt();
        // int rev=0;
        // while (n>0) {
        //     rev=rev*10+(n%10);
        //     n/=10;
        // }
        // System.out.println(rev);


        // PALINDROME NUMBER:
        // Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        // int rev=0;
        // while (n>0) {
        //     rev=rev*10+(n%10);
        //     n/=10;
        // }
        // if(n==rev){
        //     System.out.println("is a Palindrom");
        // }else{
        //     System.out.println("not a palindrom");
        // }


        // LARGEST DIGIT IN NUMBER:
        // Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        // int max=0;
        // while (n>0) {
        //     int digit=n%10;
        //     if(digit>max){
        //         max=digit;
        //     }
        //     n/=10;
        // }
        // System.out.println(max);


        //MININUM DIGIT IN NUMBER;
        // Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        // int min=9;
        // while (n>0) {
        //     int digit=n%10;
        //     if(digit<min){
        //         min=digit;
        //     }
        //     n/=10;
        // }
        // System.out.println(min); 


        // FACTORIAL:
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // long f = 1;
        // for (int i = 1; i <= n; i++) {
        //     f = f * i;
        // }
        // System.out.println(f);


        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {  
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
    }
}
            
    
    

