import java.util.Scanner;
public class pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spc=0;
        int st= n;
        for(int i=1;i<=n;i++){
//            System.out.println(spc+","+st);
        for(int j=1;j<=spc;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=st;j++){
            if(i>1 && i<=n/2 && j>1 && j<st){
                System.out.print(" ");
            }else{
                System.out.print("*");
            }
            
        }
            if(i<=n/2){
                spc++;
                st-=2;
            }else{
                spc--;
                st+=2;
            }
            
            System.out.println();
        }
        
        sc.close();
    }
}

//input n=7
//output
// *******
//  *   *
//   * *
//    *
//   ***
//  *****
// *******