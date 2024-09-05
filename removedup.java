import java.util.Arrays;

public class removedup {

public static String remove(String str){
    char[] ch=str.toCharArray();
    StringBuilder ans=new StringBuilder();
    Arrays.sort(ch);
    ans.append(ch[0]);
    for(int i=1;i<ch.length;i++){
        if(ch[i]!=ch[i-1]){
            ans.append(ch[i]);
        }
    }
    return ans.toString();

}
public static void main(String[] args){
    String str="";
    System.out.println(remove(str));
}
}
