public class perfectno {
    static boolean perfect(int n){
        int sum=0;
        for(int i=1;i<n;i++){
        if(n%i==0){
            sum=sum+i;
        }}
        if(n==sum){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        int n=6;
        if(perfect(n)){
            System.out.println(n+"perfect no");
        }else{
            System.out.println(n+"not perfect");
        }
    }
}
