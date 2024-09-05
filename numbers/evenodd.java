public class evenodd {
    static boolean check(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        int num=3;
        if(check(num)){
            System.out.println(num+"no is even");
        }else{
            System.out.println(num+"no is odd");
        }
    }
    
}
