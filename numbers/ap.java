public class ap {
    public static double apc(int n,double a,double b){
        double sum=0.0;
        for(int i=1;i<=n;i++){
            sum += a;
            a += b;
        }
        return sum;
        
    }
    public static void main(String[] args){
        double a=2,b=2;
        int n=4;
        System.out.println("ap series"+apc(n,a,b));
    }
}
