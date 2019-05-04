public class BinarySearch1 {


    public static int BinarySearch(int[] arr, int searchNumber, int low, int high){
        while(low <= high){
            // remember middle
            int middle = (high - low)/2 + low;
            if (arr[middle] == searchNumber) return searchNumber;
            if(searchNumber < arr[middle]) {
                high = middle - 1;
            }else{
                low = middle + 1;
            }


        }

        return -1;
    }

    public static void main(String[] args){
        int[] arr = {1,2,4,5,6};

        System.out.println("Result = " + BinarySearch(arr, 0, 0, arr.length - 1));
    }
}
