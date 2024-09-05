public class gp {
    public static double gpc(int n,double a,double r){
        double count=0.0;
        for(int i=1;i<=n;i++){
            count += a;
            a *= r;
        }
        return count;
    }
    public static void main(String[] args){
        int n=5;
        double a=12.5,r=10.0;
        System.out.println("gp series"+gpc(n,a,r));
    }
    
}
