public class removefromstring {
    public static String remove(String str1,String str2){
        StringBuffer str=new StringBuffer();
        for(int i=0;i<str1.length();i++){
            int flag=0;
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    flag=1;
                }  
            }
            if(flag!=1){
                str.append(str1.charAt(i));
            }
        }
        return str.toString();
        
    }
    public static void main(String[] args){
        String str1="abcdef";
        String str2="cefz";
        System.out.println(remove(str1, str2));
    }
    
}
