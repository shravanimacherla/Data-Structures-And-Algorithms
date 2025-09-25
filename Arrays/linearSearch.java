package Arrays;
public class linearSearch{
     public static int Search(int arr[],int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,5,8,9,11,15,32,65,84,100};
        int n=32;
        
       System.out.println(Search(arr,n));
    
    }
}