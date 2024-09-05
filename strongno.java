import java.util.Scanner;
public class strongno{
   static int fact(int n){
      int count=1;
      for(int i=1;i<=n;i++){
         count=count*i;
      }
      return count;
   }
   static int strong(int x){
      int sum=0;
      while(x>0){
         int ld=x%10;
         sum=sum+fact(ld);
         x=x/10;
      }
      return sum;
   }
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a no");
      int num=sc.nextInt();
      if(num==strong(num) && num!=0){
         System.out.println("strong");
      }else{
         System.out.println("not strong");
      }
   }
}