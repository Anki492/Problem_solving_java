import java.util.Scanner;

public class revbracket {
    public static void remove(String str){
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)!='(' && str.charAt(i)!=')'&& str.charAt(i)!='{'&& str.charAt(i)!='}'&& str.charAt(i)!='['&& str.charAt(i)!=']'){
        //         System.out.print(str.charAt(i));
        //     }
        str=str.replaceAll("[(){}\\[\\]]","");
        System.out.println(str);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a equation: ");
        String str=sc.nextLine();
        remove(str);
        } 
}
