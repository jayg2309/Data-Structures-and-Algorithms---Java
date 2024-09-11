import java.util.Scanner;
public class Inverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int inverse = 0;
        int count = 0;
        while (n!=0){
            int rem = n%10;
            count++;
            inverse = inverse + count * (int)Math.pow(10,rem-1);
            n=n/10;
        }
        System.out.println(inverse);
        sc.close(); 
    }
}
