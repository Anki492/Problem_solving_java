import java.util.Scanner;

public class posneg {
    static boolean check(int n){
        if(n>0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no:");
        int num=sc.nextInt();
        if(num==0){
            System.out.println("number is zero");
        }else if(check(num)){
            System.out.println(num+"is positive");
        }else{
            System.out.println(num+"is negative");
        }
    }
    
    
}
