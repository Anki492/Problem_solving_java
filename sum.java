import java.util.Scanner;
public class sum {
    public static void main(String[] args){
        int cal=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            cal=cal+i;
        }
        System.out.println("sum of no"+cal);
    }
    
}
