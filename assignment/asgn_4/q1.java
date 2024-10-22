//bubblesort
package AD1.assignment.asgn_4;
public class q1 {
    public static void main(String[] args) {
        int arr [] ={6,4,8,9,3,1};
        System.out.println("------Original Array------");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("------Sorted Array--------");
        printArray(arr);
    }

    static void bubbleSort(int[] arr){
        for(int i = 0 ; i<arr.length;i++){
           int j = i;
           while (j>0 && arr[j-1]>arr[j]) {
            int temp = arr[j-1];
            arr[j-1]=arr[j];
            arr[j] = temp;
            j--;
           }
        }
    }

    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + ", ");
        }System.out.println();
    }
}