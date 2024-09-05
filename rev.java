import java.util.Scanner;

public class rev {
    static int reverse(int n){
       int count=0; 
        while(n!=0){
            int ld=n%10;
            count=count*10+ld;
            n=n/10;
        }
        return count;
    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a no:");
       int num=sc.nextInt();
       System.out.println("reverse number of "+num+" is "+reverse(num));
    }
}
