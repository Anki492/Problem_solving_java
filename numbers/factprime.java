public class factprime {
    static boolean prime(int n){
        int count=0;
            for(int i=1;i<=n;i++){
                if(n%i==0){
                count=count+1;}
                }
            if(count==2){
                return true;
            }else{
                return false;
            }
        
    }
    public static void main(String[] args){
        int num=100;
        for(int j=1;j<num;j++){
            if(num%j==0 && prime(j)){
                    System.out.println(j);
                }
            }
        }
    }

