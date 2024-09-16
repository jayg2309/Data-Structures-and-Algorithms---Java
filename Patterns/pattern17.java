import java.util.Scanner;
public class pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spc= n/2;
        int str = 1;
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=spc;j++){
                if(i==n/2 +1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=str;j++){
                System.out.print("*");
            }
            if(i<=n/2){
                str++;
            }else{
                str--;
            }
            System.out.println();
        }
        sc.close();
    }
}

//input n=5
//output
//   *
//   **
// *****
//   **
//   *