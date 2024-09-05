public class lexicographic {
    public static void main(String[] args){
        String str="Ankita";
        StringBuffer ans=new StringBuffer();
        for(int i=0;i<str.length();i++){
            int ch=str.charAt(i);
            if(ch==90){
                ans.insert(i,(char)(65));
            }else if(ch==122){
                ans.insert(i,(char)(97));
            }else if(ch>=65&&ch<=90||ch>=97&&ch<=122){
                ans.insert(i,(char)(ch+1));
            }
        }
        System.out.println(ans);
    }
  
}
