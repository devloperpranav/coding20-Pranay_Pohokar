import java.util.Scanner;

public class Armstong {
    public static void main(String[] args) {
        int count=0, sum =0,b;
        
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int t1 = n;

            while(t1>0){
                t1 = t1/10;
                count++;
            }
             int t2 = n;
             while(t2>0){
                b = t2%10;
                sum = sum+(int)Math.pow(b,count);
                t2 = t2/10;
             }
             if(sum == n){
                System.out.println("No. is armstrong");
             }
             else{
                 System.out.println("No. is not armstrong");
             }
             sum = 0;
        }
        
    
}
