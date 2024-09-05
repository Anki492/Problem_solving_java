import java.util.Scanner;

public class permutation {
    public static int fact(int n){
        int count=1;
        for(int i=1;i<=n;i++){
            count=count*i;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter value of n : ");
        int n=sc.nextInt();
        System.out.print("enter value of r : ");
        int r=sc.nextInt();
        int permu = fact(n)/fact(n-r);
        int comb = fact(n)/(fact(r)*fact(n-r));
        System.out.println("permutation: "+permu);
        System.out.println("combination: "+comb);
    }
    
}
