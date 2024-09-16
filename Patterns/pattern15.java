import java.util.Scanner;
public class pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spc=n/2;
        int count = 1;
        int num=1;
        for(int i=1;i<=n;i++){
//            System.out.print(spc+","+count);
            for(int j=1;j<=spc;j++){
                System.out.print(" ");
            }
            int cnum = num; // column no
            for(int j=1;j<=count;j++){               
                System.out.print(cnum);
                if(j<=count/2){
                    cnum++;
                }else{
                    cnum--;
                }
                                           
            }
            if(i<=n/2){
                spc--;
                count +=2;
                num++;
            } else{
                spc++;
                count -=2;
                num--;
            }
            System.out.println();
        }

    sc.close();
    }
}

//input n=5
//output
//   1
//  232
// 34543
//  232
//   1