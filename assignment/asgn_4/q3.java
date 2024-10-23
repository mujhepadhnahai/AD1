//section sort
package AD1.assignment.asgn_4;
public class q3 {
    public static void main(String[] args) {
        int arr [] ={13,46,24,52,20,9};
        System.out.println("------Original Array------");
        printArray(arr);
        selectionSort(arr);
        System.out.println("------Sorted Array------");
        printArray(arr);
    }

    static void selectionSort(int[] arr){
      for (int i = 0;i <= arr.length-2;i++){
        int mini =i;
        for(int j=i;j<=arr.length-1;j++){
            if(arr[j]<arr[mini]){
               mini = j;
            }
        }
        int temp = arr[mini];
        arr[mini] = arr[i];
        arr[i]=temp;
      }
    }

    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + ", ");
        }
    }
}