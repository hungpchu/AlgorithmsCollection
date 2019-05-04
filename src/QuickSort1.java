public class QuickSort1 {


    public static int partition(int[] arr, int low, int high){
        int in = low - 1;
        int pivot = arr[high];

        for(int j = low; j <= high - 1; j++){
            if (arr[j] <= pivot){
                in++;
                // swap arr[j] and arr[in]
                int temp = arr[in];
                arr[in] = arr[j];
                arr[j] = temp;
            }
        }

        // swap pivot with arr[in]
        in++;
        int finalTemp = arr[in];
        arr[in] = arr[high];
        arr[high] = finalTemp;

        return in;

    }

    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pivotIndex = partition(arr, low, high);
            quickSort(arr,low,pivotIndex - 1);
            quickSort(arr,pivotIndex + 1, high);
        }

    }


    public static void main(String[] args){

//        int[] arr = {3,2,5,6,1};
        int[] arr = {4,0,1,9,2,3,5,7};
        quickSort(arr, 0, arr.length - 1);

        for(int i: arr) System.out.println(i);

    }

}
