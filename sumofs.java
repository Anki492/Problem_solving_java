public class sumofs {
    public static int sumOfString(String str){
        String temp="0";
        int sum=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isDigit(str.charAt(i))){    
                temp+=c;
            }else{
                sum+=Integer.parseInt(temp);
                temp="0";
            }
        }
        return sum+Integer.parseInt(temp);
    }
    public static void main(String[] args){
        String str="12abc31";
        System.out.println(sumOfString(str));

    }
    
}
