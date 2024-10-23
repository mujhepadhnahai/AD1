//sum of n numbers in recursion
import java.util.*;
public class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no: ");
        int no = sc.nextInt();
        System.out.println("Ans: "+sum(no));
    }

    static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n+sum(n-1);
    }
} 