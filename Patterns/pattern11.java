import java.util.Scanner;
public class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=1;
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
        sc.close();
    }
}

//input n=5
//output
// 1
// 2 3
// 4 5 6
// 7 8 9 10