class sum{
    protected int sum(int a, int b) {
        return a + b;
    }
}

// public class RecursionEg extends sum {
//     public static void main(String[] args) {
//         RecursionEg obj = new RecursionEg();

//         int result = obj.sum(10, 20);

//         System.out.println("Sum = " + result);

//     }
// }



// public class RecursionEg{
//     public static return void main(String[] args){
//         int s=factorial(1,10,1);
//         System.out.println(s);
//     }

//     public static int factorial(int i,int n,int fact){
//         if(i>n){ct;
//         }
//         fact*=i;
//         return factorial(i+1,n,fact);
//     }
// }



// public class RecursionEg {

//     public static int sumDigits(int n, int sum) {
//         if (n == 0) {
//             return sum;
//         }
//         sum += n % 10;
//         return sumDigits(n / 10, sum);
//     }
//     public static void main(String[] args) {
//         int n = 12345;
//         int sum = sumDigits(n, 0);
//         System.out.println(sum);
//     }
// }



// public class RecursionEg {

//     public static int sumDigits(int n, int product) {
//         if (n == 0) {
//             return product;
//         }
//         product *= n % 10;
//         return sumDigits(n / 10, product);
//     }
//     public static void main(String[] args) {
//         int n = 12345;
//         int product= sumDigits(n, 1);
//         System.out.println(product);
//     }
// }


