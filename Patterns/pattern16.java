import java.util.Scanner;
public class pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spc = 2*n -3;
        int count=1;
        
        for(int i=1;i<=n;i++){
            int num=1;
//            System.out.println(count+","+spc);
            for(int j=1;j<=count;j++){
                System.out.print(num);  
                num++;                          
            }
            for(int j=1;j<=spc;j++){              
                System.out.print(" ");
            } 
            if(i==n){
                count--;
                num--;
            }
            for(int j=1;j<=count;j++){
                num--;
                System.out.print(num);        
            }
                    
            spc-=2;
            count++;
            
            System.out.println();
        }
        sc.close();
    }
}

//input n=5
//output
// 1     1
// 12   21
// 123 321
// 1234321