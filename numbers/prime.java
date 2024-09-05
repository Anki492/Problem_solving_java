public class prime {
        static boolean primeno(int n){
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
            int a=10,b=20;
            for(int i=a;i<=b;i++){
            if(primeno(i)){
                System.out.println(i);
            }}
        }
    }
        // public static void main(String[] args){
        //     int num=11;
        //     if(prime(num)){
        //         System.out.println(num+"is prime");
        //     }else{
        //         System.out.println(num+"not is prime");
        //     }}

