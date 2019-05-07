public class BinarySearch1 {


    public static int BinarySearch(int[] a, int key){

        int low = 0;
        int high = a.length - 1;
        //Array must be sorted
        while(low <= high){
            // remember middle
            int middle = (high - low)/2 + low;
            if (a[middle] == key) return middle;
            if(key < a[middle]) high = middle - 1;
            else if (key > a[middle]) low = middle + 1;
            else                        return middle;
        }

        return -1;
    }

    public static void main(String[] args){
        int[] arr = {1,2,4,5,6};

        System.out.println("Result = " + BinarySearch(arr, 0));
    }
}
