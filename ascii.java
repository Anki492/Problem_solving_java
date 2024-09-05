import java.util.Scanner;
public class ascii {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a charecter:");
        char c=sc.next().charAt(0);
        int asc=c;
        System.out.println(asc);
    }
}