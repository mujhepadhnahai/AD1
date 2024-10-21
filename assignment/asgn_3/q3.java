//generating nth fibonaci no,  0 1 1 2 3 5 8 13
import java.util.*;
public class q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no: ");
        int no = sc.nextInt();
        System.out.println("Ans: "+nthFibo(no));
    }

    static int nthFibo(int n){
        if(n == 1){
            return 0;
        }else if(n==2){
            return 1;
        }
        return nthFibo(n - 1) + nthFibo(n - 2);
    }
} 

