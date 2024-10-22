//section sort
package AD1.assignment.asgn_4;
public class q3 {
    public static void main(String[] args) {
        int arr [] ={6,4,8,9,3,1};
        System.out.println("------Original Array------");
        printArray(arr);
        selectionSort(arr);
        System.out.println("------Sorted Array------");
        printArray(arr);
    }

    static void selectionSort(int[] arr){
      
    }

    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + ", ");
        }
    }
}