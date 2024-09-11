import java.util.Scanner;
public class RotateNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        //calculate no of digits
        int temp = n;
        int nod= 0;
        while(temp!=0){
            temp=temp/10;
            nod++;
        }
        k = k % nod; // for repeating cases like 352 times means only 2 times rotation for a 5 digit number

        if ( k<0){
            k = k + nod; 
        }
        int div =1;
        int mult=1;
        for(int i =1; i<= nod;i++){
            if(i<=k){
                div = div *10;
            }else{
                mult = mult *10;
            }
        }

        int q = n / div;
        int rem = n % div;

        int rot = rem * mult + q;
        System.out.println(rot);


        sc.close();
    }
    
}