public class swhiteremove {
    static String remove(String str){
        return str.replaceAll("\\s","");
    }
    public static void main(String[] args){
        String str="Souvik MF";
        System.out.println(remove(str));
    }
    
}
