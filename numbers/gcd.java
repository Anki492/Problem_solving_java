import java.util.Scanner;

public class gcd {
    public static int fact(int n1,int n2){
        int gcd=1;
        for(int i=1;i<=Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first no:");
        int a=sc.nextInt();
        System.out.print("enter 2nd no:");
        int b=sc.nextInt();
        System.out.println("gcd of "+a+" and "+b+" is "+fact(a, b));
        }
}
