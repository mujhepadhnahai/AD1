import java.util.*;
class p3 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter how many numbers you want");
        int n = sc.nextInt();
        System.out.println("enter "+n+" numbers");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter how many times you want to rotate");
        int arr1[] = arr;
        int k = sc.nextInt();
        while(k!=0){
            for(int j = 1;j<n;j++){
               arr[j] = arr1[j-1];
            }
            arr[0] = arr1[n-1];
            k--;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
        

    }
}