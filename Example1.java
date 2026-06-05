import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) throws Exception{
        // int a = System.in.read();
        // System.out.println(a);

        // String num="1234";
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr number");
        String num=sc.nextLine();
        for(int i=num.length()-1;i>=0;i--){
             System.out.print(num.charAt(i));
        }
       
    }
    
}
