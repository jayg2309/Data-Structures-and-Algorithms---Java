import java.util.Scanner;
public class GCDnLCM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int orgn1 = num1;
        int orgn2 = num2;

        while(num1 % num2 !=0){
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        int gcd = num2;
        int lcm = (orgn1 * orgn2)/ gcd;
        System.out.println(gcd+ " " + lcm);
        sc.close();
    }
}


        // //GCD
        // int gcd=1;
        // if(num1>=num2){            
        //     for (int i =1;i<num2;i++){
        //         if(num1 % i ==0 && num2 % i ==0){
        //             gcd = i;
        //         }
        //     }                                 
        // }
        // else{
        //     for (int i =1;i<num1;i++){
        //         if(num1 % i ==0 && num2 % i ==0){
        //             gcd = i;
        //         }
        //     }
        // }
        // System.out.println(gcd);   
        
        // //LCM
        // int lcm = (num1 * num2)/ gcd;
        // System.out.println(lcm);