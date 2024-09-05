public class reparr {
    public static void main(String[] args){
        String str="ankita nniii";
        char arr[]=str.toCharArray();
        int count=0,max=0;
        char c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>max){
                max=count;
                c=str.charAt(i);
            }
        }
        System.out.println("max appear "+c);
        

    }
    
}
