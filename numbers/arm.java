import java.lang.Math;
import java.util.Scanner;
public class arm {
    static boolean check(int n){
        int k=String.valueOf(n).length();
        int sum=0,temp=n;
        while (n>0) {
            int ld=n%10;
            sum+=Math.pow(ld,k);
            n=n/10;
        }
        if(sum==temp){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no:");
        int n=sc.nextInt();
        if(check(n)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
