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


        // CHECK PERFECT NUMBER:
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i < n; i++) {  
        //     if (n % i == 0) {
        //         sum += i;
        //     }
        // }
        // if (sum == n) {
        //     System.out.println("Perfect Number");
        // } else {
        //     System.out.println("Not a Perfect Number");
        // }



        // CHECK PRIME NUMBER:
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter n: ");
        // int n = sc.nextInt();
        // for (int i = 2; i <= n; i++) {
        //     boolean isPrime = true;
        //     for (int j = 2; j <= Math.sqrt(i); j++) {
        //         if (i % j == 0) {
        //             isPrime = false;
        //             break;
        //         }
        //     }
        //     if (isPrime) {
        //         System.out.print(i + " ");
        //     }
        // }


        // AMSTORG NUMBER:
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();
        // int temp = num;
        // int sum = 0;
        // while (temp > 0) {
        //     int digit = temp % 10;
        //     sum = sum + (digit * digit * digit);
        //     temp = temp / 10;
        // }
        // if (sum == num)System.out.println("Armstrong Number");
        // else System.out.println("Not an Armstrong Number");


        // DIVISION FACTOR:
        // Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        //   for (int i=1;i<=Math.sqrt(n);i++){
        //     if(n%i==0){
        //         System.out.println("fact:"+i);
        //         System.out.println("co:"+n/i);
                
        //     }
        // }



        // FIBONACCI SERIES METHOD1:
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number of terms: ");
        // int n = sc.nextInt();
        // int a = 0, b = 1;
        // for (int i = 1; i <= n; i++) {
        //     System.out.print(a + " ");
        //     int c = a + b;
        //     a = b;
        //     b = c;
        // }
        

        // FIBONACCI SERIES METHOD2:
        int a=0;
        int b=1;
        while(a<=10){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }


    }
}


        
    
            
    
    




