import java.util.*;
class p1 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter how many numbers you want to sum");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
            sum = sum + i;
        }
        System.out.println("Sum = "+sum);
    }
}