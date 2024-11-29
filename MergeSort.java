

public class MergeSort{

    public static void mergeSort(int si, int ei, int arr[]){
        if(si>=ei){
            return;
        }

        int mid = (si+ei)/2;
        mergeSort(si, mid, arr);
        mergeSort(mid+1, ei, arr);
        mergeArray(si,mid,ei,arr);

    }

    public static void mergeArray(int si, int mid, int ei, int arr[]){
        int temp [] = new int [ei - si +1];
        int i=si;
        int j= mid+1;
        int k =0;

        while (i<=mid && j<=ei) { 
            if(arr[i]>arr[j]){
                temp[k] = arr[j];
                j++;
            }
            else{
                temp[k]=arr[i];
                i++;
            }
            k++;
            
        }
        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }

        while(j<= ei){
            temp[k]=arr[j];
            j++;
            k++;
        }
        
        for(int l=si, m =0; m<k;l++,m++){
            arr[l]=temp[m];
        }

    }

   

    public static void main(String args []){
        int arr[] = {6,3,9,5,2,8};
        mergeSort(0,arr.length-1,arr);
        System.out.println("THe sorted array is ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}