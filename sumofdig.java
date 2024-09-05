import java.util.Scanner;

public class sumofdig {
    public static int sum(int n){
       int sum=0; 
        while(n!=0){
            int ld=n%10;
            sum=sum+ld; 
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no:");
        int num=sc.nextInt();
        System.out.println("sum of digits "+sum(num));
    }
}
