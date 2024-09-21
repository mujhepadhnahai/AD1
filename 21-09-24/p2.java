import java.util.*;
class p2 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter how many numbers you want");
        int n = sc.nextInt();
        System.out.println("enter "+n+" numbers");
        int arr[] = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {   arr[i] = sc.nextInt();
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("max is "+max+" and min is"+min);
    }
}