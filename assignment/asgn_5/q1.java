//merging the sorted array
package AD1.assignment.asgn_5;
public class q1 {
    public static void main(String[] args) {
        int new1 [] ={1,3,9,10};
        int new2 [] ={2,6,18,20};
        System.out.println("------Original Array------");
        System.out.print("array 1 :");
        printArray(new1);
        System.out.print("array 2 :");
        printArray(new2);
        System.out.println("------Merged Array------");
        printArray(arrayMerge(new1,new2));
    }

    static int[] arrayMerge(int[] new1,int[] new2){
        int n = new1.length;
        int m = new2.length;
        int i,j,k;
        i=0;j=0;k=0;
        int []arr = new int[m+n];
        while( i<n && j<m){
          if(new1[i]<new2[j]){
            arr[k]=new1[i];
            k++;i++;
          }else{
            arr[k]=new2[j];
            k++;j++;
          }
          if(j>=m){
            while(i<n){
                arr[k]=new1[i];
                k++;i++;
            }
          }
          if(i>=n){
            while(j<m){
                arr[k]=new2[j];
                k++;j++;
            }
          }
        }
        return arr;
    }

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }System.out.println();
    }
}