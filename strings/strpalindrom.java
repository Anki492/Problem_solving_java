import java.util.Scanner;

public class strpalindrom {
    public static boolean check(String s){
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string: ");
        String str=sc.next();
        if(check(str)){
            System.out.println("palindrom string");
        }else{
            System.out.println("not palindron string");
        }
    }
}  