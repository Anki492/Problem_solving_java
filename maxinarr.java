public class maxinarr {
    public static void main(String[] args){
        int [] arr=new int[] {10,40,20,30};
        int max=arr[0];
    for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
    
    
}
