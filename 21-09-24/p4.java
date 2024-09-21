import java.util.Scanner;

class p4
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
        for(int j=0;j<n/2;j++)
        {
            int temp = arr[j];
            arr[j] = arr[n-1-j];
            arr[n-1-j] = temp;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
