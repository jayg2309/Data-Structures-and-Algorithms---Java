import java.util.Scanner;
public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //fibonacci code
        int a=0;
        int b=1;
        // for(int i=0;i<n;i++){
        //     System.out.print(a);
        //     int c = a+b;
        //     a=b;
        //     b=c;
        // }
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                int c = a+b;
                a=b;
                b=c;
            }
            System.out.println();
        }
        sc.close();        
    }
}

//input n=5
//output
// 0
// 1 1
// 2 3 5
// 8 13 21 34