public class BubbleSorting {
    public static void main (String[] args) {
        int[] array = {7, 9, 4, 8, 0, -3, 15, 4, 11, -9, 3, 16, 21, 2, -5};
        printSorted(array);
    }
    private static void printSorted(int[] arr){
        for(int i=0; i < arr.length; i++){
            for(int j=0; j < arr.length-1; j++){
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
};
