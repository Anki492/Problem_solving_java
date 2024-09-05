import java.util.Scanner;

public class srev {
    static void rev(String str,int n){
        char [] arr=str.toCharArray();
        String reverse = "";
        for (int i = n-1; i >=0; i--) {
            reverse += arr[i];
          }
          
          System.out.println("Reversed string: "+ reverse);
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter string:");
    String originalStr=sc.nextLine();
    int n=originalStr.length();
    System.out.println("Original string: " + originalStr);
    rev(originalStr,n);
        
    }
}