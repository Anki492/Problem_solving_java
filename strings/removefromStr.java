import java.util.Scanner;

public class removefromStr {
    public static String remove(String s){
        String str="";
        for(int i=0;i<s.length();i++){
            int ascii=s.charAt(i);
            if(ascii>=65 && ascii<=90 || ascii>=97 && ascii<=122){
                str=str+s.charAt(i);
            }
        }
        return str;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string:");
        String s1=sc.next();
        System.out.println(remove(s1));
    }
    
}
