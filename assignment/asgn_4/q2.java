//insertion sort
package AD1.assignment.asgn_4;
public class q2 {
    public static void main(String[] args) {
        int arr [] ={23,1,10,5,2};
        System.out.println("------Original Array------");
        printArray(arr);
        insertionSort(arr);
        System.out.println("------Sorted Array------");
        printArray(arr);
    }

    static void insertionSort(int[] arr){
       int temp = 0;
       for(int i = 1; i<=arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }
}