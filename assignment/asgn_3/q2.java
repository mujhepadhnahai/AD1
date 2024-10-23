//factorial of a number
import java.util.*;
public class q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no: ");
        int no = sc.nextInt();
        System.out.println("Ans: "+fact(no));
    }

    static int fact(int n){
        if(n == 0){
            return 1;
        }
        return n*fact(n-1);
    }
} 