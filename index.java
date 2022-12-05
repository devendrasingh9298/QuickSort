public class index{
    public static int Partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start-1;

        for(int j = start; j <= end-1; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        return (i+1);
    }
    public static void Quick(int[] arr, int start, int end){
        if(start<end){
            int p = Partition(arr,start,end);

            Quick(arr,start,p-1);
            Quick(arr,p+1,end);
        }
    }
    public static void main(String[] args){
        int[] arr = {20,30,10,50,40};
        int n = arr.length;
        Quick(arr,0,n-1);

        for(int i = 0; i <n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
