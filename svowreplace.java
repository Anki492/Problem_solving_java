import java.util.Scanner;

public class svowreplace {
    // public static String remove(String str){
    //     return str.replaceAll("[aeiou]","");
    // }
    // public static void main(String[] args){
    //     String str="Ankita";
    //     str=str.toLowerCase();
    //     System.out.println(remove(str));
    // }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.next();
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!='a'||ch!='e'||ch!='i'||ch!='o'||ch!='u'){
                System.out.print(ch);
            }
    }
}
}
