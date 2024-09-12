import java.util.Scanner;
public class pattern6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int str = n/2 + 1;
        int spc = 1;
        for (int i=1;i<=n;i++){
 //           System.out.println(str+","+spc+","+str);
            for(int j=1;j<=str;j++){
                System.out.print("*");
            }
            for(int j=1;j<=spc;j++){
                System.out.print(" ");
            }
            for( int j=1;j<=str;j++){
                System.out.print("*");
            }
            if(i<=n/2){
                str--;
                spc+=2;
            }else{
                str++;
                spc-=2;
            }
            System.out.println();
        }
        sc.close();
    }
}


// input n=5
//output 
// *** ***
// **   **
// *     *
// **   **
// *** ***