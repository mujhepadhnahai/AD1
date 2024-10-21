//find gcd of two nos
import java.util.*;
public class q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 2 no: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Ans: "+gcd(x,y));
    }

    static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
} 
