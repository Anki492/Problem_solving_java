import java.util.Scanner;

public class svowcons {
    static void count(String s){
        int vow=0,cons=0,num=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vow++;
            }else if(ch>='a'&& ch<='z'){
                cons++;
            }else if(ch==' '){
                num++;
            }
        }
        System.out.println("vowels: "+vow);
        System.out.println("cons: "+cons);
        System.out.println("space: "+num);
    }
    public static void main(String[] s){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string:");
        String str=sc.nextLine();
        count(str);
    }
}
