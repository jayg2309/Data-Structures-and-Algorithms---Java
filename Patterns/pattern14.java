import java.util.Scanner;
public class pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        //print multiplication table
        for(int i=1;i<=10;i++){
            int mul = x*i;
            System.out.println(x + "*" + i + "=" + mul );
        }
        sc.close();
    }
}
//input n=2
//output
// 2*1=2
// 2*2=4
// 2*3=6
// 2*4=8
// 2*5=10
// 2*6=12
// 2*7=14
// 2*8=16
// 2*9=18
// 2*10=20