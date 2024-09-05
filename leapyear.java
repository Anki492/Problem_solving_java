public class leapyear {
    static boolean leap(int y){
        if((y%4==0) && (y%100!=0) || (y%400==0)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        int y=2000;
        if(leap(y)){
            System.out.println("leap year");
        }else{
            System.out.println("not leap year");
        }
    }
}
