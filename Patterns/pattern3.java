import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spc = n-1;
        int str = 1;
        for(int i=1;i<=n;i++){
            //System.out.println(spc + "," + str);
            for(int j=1;j<=spc;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=str;j++){
                System.out.print("*");
            }
            spc--;
            str++;
            System.out.println();
        }
        sc.close();
    }
}
