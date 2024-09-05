public class fibo {
    static boolean sqrt(int x){
        int s=(int) Math.sqrt(x);
        return(s*s==x);
    }
    static void check(int []array){
        int n=array.length;
        for(int i=0;i<n-1;i++){
        if(sqrt(5*array[i]*array[i]+4) || sqrt(5*array[i]*array[i]-4)){
            System.out.println(array[i]);
        }
    }
    }
    public static void main(String[] args){
        int []arr=new int []{1,2,3,4,5,6};
        check(arr);
    }
    
}
