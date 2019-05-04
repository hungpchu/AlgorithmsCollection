public class PowerSet1 {


    public static void PowerSet(int[] arr, int[] subset, int position ){

        if (position == arr.length){
            printSubset(subset);

        }else{
            // choose to exclude the number from subset
            subset[position] = -69;
            PowerSet(arr,subset,position + 1);
            // choose to include the number in the subset
            subset[position] = arr[position];
            PowerSet(arr,subset,position + 1);
        }


    }

    public static void printSubset(int[] arr){

        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length - 1) {
                if(arr[i] != - 69) System.out.print(arr[i]);

            }else{
              if (arr[i] != -69)  System.out.print(arr[i] + ",");
            }

        }

        System.out.print("]");
        System.out.println();


    }

    public static void main(String[] args){
        int[] arr = {1,2,3};

        int[] subset = new int[arr.length];

        // recursive call popping according to the stack
        PowerSet(arr, subset, 0);

    }
}
