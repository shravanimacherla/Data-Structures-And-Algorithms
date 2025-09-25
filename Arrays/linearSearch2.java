package Arrays;

public class linearSearch2 {
    
     public static int Search(String arr[],String n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String arr[]={"Shravani","Anushka","Sonal","Nihal"};
        String key="Sonal";
        
       System.out.println(Search(arr,key));
    
    }
}

