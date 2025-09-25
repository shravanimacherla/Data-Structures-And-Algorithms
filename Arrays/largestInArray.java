package Arrays;
public class largestInArray{
  public static int largest(int[] a){
        int largest=a[0];

        for(int i=0;i<a.length;i++){
          if(a[i]>largest){
            largest=a[i];
          }
        }
        return largest;
  }
    public static void main(String[] args) {
        int a[]={1,2,6,3,5};

        System.out.println(largest(a));
    }
}