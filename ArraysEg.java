import java.util.Scanner;

public class ArraysEg {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int[] arr=new int[10];
        // for(int i=0;i<10;i++){
        //     arr[i]=sc.nextInt();
        // }
        // for(int i=0;i<10;i++){
        //     System.out.print(arr[i]);
        // }


        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int[] arr=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]);
        // }


         // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int[] arr=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        // for(int i=0;i<n;i++){
        // System.out.print(arr[i]);
        // }



        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
       
        // int[] arr={20,3,5,2};
        // for(int num:arr){
        //    System.out.println(num);
        // }


       
    //     int sum=0;
    //     int[] val={1,3,4,5};
    //     for(int i=0;i<4;i++){
    //            sum+=val[i];
    //     }
    //     System.out.println(sum);
    // }


    //   int[] arr = {10, 25, 5, 40, 15};
    //     int max = arr[0]; 
    //     for (int i = 1; i < arr.length; i++) {
    //         if (arr[i] > max) {
    //             max = arr[i];
    //         }
    //     }

    //     System.out.println("Maximum value: " + max);




    
    //   int[] arr = {10, 25, 5, 40, 15};
    //     int min = arr[0]; 
    //     for (int i = 1; i < arr.length; i++) {
    //         if (arr[i] < min) {
    //             min = arr[i];
    //         }
    //     }

    //     System.out.println("Maximum value: " + min);





    // int[] arr = {10, 25, 5, 40, 15};

    //     int odd = 0;
    //     int even = 0;

    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] % 2 == 0) {
    //             even++;
    //         } else {
    //             odd++;
    //         }
    //     }

    //     System.out.println("Even count: " + even);
    //     System.out.println("Odd count: " + odd);


    
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the n values:");
           for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];//ASSUME FIRST ELEMENT IS MAX
        int Secondmax = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                Secondmax = max;
                max = arr[i];
            }
            else if(arr[i] > Secondmax &&Secondmax != max){
                Secondmax = arr[i];
            }
        }
        System.out.println("Maximum value:"+max);
        System.out.println("Second Maximum value:"+Secondmax);
        sc.close();
    }
}



    













