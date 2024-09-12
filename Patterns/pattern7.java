import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spc=0;
        for(int i=1;i<=n;i++){
//            System.out.println(spc + ","+  str);
            for(int j=1;j<=spc;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            spc++;
            System.out.println();
        }
        sc.close();
    }
}

//input n=5
//output
// *
//  *
//   *
//    *
//     *

//alternate method is run for loop inside for loop and for i=j print * 