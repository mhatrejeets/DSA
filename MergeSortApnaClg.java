public class MergeSortApnaClg{
    public static void mergeSort (int arr [] , int si, int ei){
        //base condition
        if(si>= ei){
            return;
        }

        int mid  = si +(ei - si)/2;
        //left part
        mergeSort(arr, si, mid);
        //right part
        mergeSort(arr, mid+1, ei);
        //merge
        merge(arr,si,mid, ei);
    }

    public static void merge (int arr [] , int si, int mid , int ei){
        //left part iterater
        int i = si;
        //right part iterater
        int j = mid+1;
        // iterater for temp arr
        int k = 0;

        int temp [] = new int [ei - si +1];

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp [k] = arr[i];
                i++;
                k++;
            }
            else{
                temp[k]= arr[j];
                k++;
                j++;
            }

        }

        while(i<=mid){
            temp[k]= arr[i];
            k++;
            i++;
        }

        while(j<=ei){
            temp[k]= arr[j];
                k++;
                j++;
        }

        while(i<=mid){
            temp[k]= arr[i];
            k++;
            i++;
        }

        for(int l = si, m = 0; m<temp.length ; l++,m++){
            arr[l] = temp[m];

        }
        
    }

    public static void main(String args[]){
        int arr [] = {9,5,7,8,2,4,3,1,56};
        mergeSort(arr, 0, arr.length-1);
        System.out.println("Sorted array : " );
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        
    }
}